jQuery(document).ready(function($){

	window.editableOptions = {
		onCreate: function(parent, data){

			var target = parent.parent('.texto_comentario').find('.texto_comentario_conteudo.comentario-editavel');

			if(target.length){
				data.old = target.attr('data-conteudo')
						.trim()
						.replace(/<br\s*[\/]?>/gm, "\n");					

				parent.find('.dvm-editable-textarea.dvm-editable-active').val(data.old);
			}

			parent.prev('.margin_top10').hide();
		},

		onCancel: function(e, data){
			var data_comentario = $(e.target).parent().prev('.margin_top10').show();

			return true;
		},

		onSave: function(e, data){

			var comentario_editavel = $(e.target);

			if(!data.new.trim().length){
				data.new = data.old;

				notif({
					type: "error",
					msg: 'Parece que o comentário está vazio.',
					position: "center",
					width: 400,
					bgcolor: "#f05f5c",
					top: 200,
					multiline: true
				});

				return false;
			}

			if(data.new.length > 4000){
				data.new = data.old;

				notif({
					type: "error",
					msg: 'O texto está grande demais. Por favor informe menos de 4000 caracteres.',
					position: "center",
					width: 400,
					bgcolor: "#f05f5c",
					top: 200,
					multiline: true
				});

				return false;
			}

			var pacote = {
				conteudo: data.new,
				modo: 'e',
				ac: 'c',
				TipoViewer: '',
				tp: '',
				idcurso: 0,
				id: comentario_editavel.attr('data-comentario'),
				nomeusuario: comentario_editavel.attr('data-usuario')
			};

			$.ajax('http://www.devmedia.com.br/RTE3/addcomment.asp?id=' + pacote.id + '&m=e&idcomp=' + comentario_editavel.attr('data-idcomp'), {
				data: pacote,
				contentType: "application/x-www-form-urlencoded; charset:ISO-8859-1",
				method: 'POST'
			}).done(function(data){
				if(!data.length){
					return false;
				}

				if(data.hasOwnProperty('status') && data.status == 2){
					notif({
						type: "error",
						msg: data.retorno,
						position: "center",
						width: 400,
						bgcolor: "#f05f5c",
						top: 200,
						multiline: true
					});
				}
			});

			$(e.target).parent().prev('.margin_top10').show();

			comentario_editavel.attr('data-conteudo', data.new);

			data.allowSyntaxHighlighting = true;

			return true;
		}
	};

	$(document).find('.texto_comentario_conteudo.comentario-editavel').each(function(){
		$(this).DVMEditable(window.editableOptions);
	});
});