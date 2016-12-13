(function($){
	$.fn.extend({
		DVMEditable: function(options){

			var settings = $.extend({
				onCancel: null,
				onCreate: null,
				onSave: null,
				target: '',
				trigger: []
			}, options);

			return this.each(function(){

				var elem = (settings.target === '') ? $(this) : $(settings.target);
				var display = elem.css('display');

				settings.trigger.push('#' + elem.attr('id'));
				var context = settings.trigger.join(', ');
				settings.trigger = [];

				// console.log(context);

				$(document).on('click', context, function(e){
					e.preventDefault();

					if(elem.parent().find('.dvm-editable-textarea.dvm-editable-active').length !== 0){
						return false;
					}

					elem.css('display', 'none');

					var container = $('<div />', {
						class: 'dvm-editable-container'
					});

					var textarea = $('<textarea />', {
						class: 'dvm-editable-textarea dvm-editable-active',
						val: elem.html()
							.trim()
							.replace(/<br\s*[\/]?>/gm, "\n")
					}).appendTo(container);

					var btnSave = $('<button />', {
						class: 'dvm-editable-button-save',
						text: 'Salvar'
					}).appendTo(container);

					btnSave.on('click', function(e){
						data = {
							old: elem.text(),
							new: textarea.val()
						}

						var ev = {'target' : elem};

						if(typeof settings.onSave === 'function' && settings.onSave(ev, data) === false){
							return false;
						}

						if(!data.hasOwnProperty('allowSyntaxHighlighting') || data.allowSyntaxHighlighting === false){
							elem.html($('<div />', { 
								text: data.new 
							}).html().replace(/([^>\r\n]?)(\r\n|\n\r|\r|\n)/g, '$1<br/>$2').trim());
						} else {
							data.new = $('<div />', { 
								text: data.new.trim()
							})
							.html()
							.replace(/([^>\r\n]?)(\r\n|\n\r|\r|\n)/g, '$1<br/>$2');

							var codeStart = data.new.indexOf('[code]');
							var codeEnd = data.new.indexOf('[/code]');
							var codeLength = codeEnd - codeStart;

							if(codeLength > 0){
								var codeContent = data.new.substr(codeStart + 6, codeLength - 6);

								var codeContentNewLine2Br = codeContent
									.replace(/(<br\s*[\/]?>)(\r\n|\n\r|\r|\n)(<br\s*[\/]?>)/, '<br/>')
									.replace(/<br\s*[\/]?>/gm, "\n");

								data.new = data.new.replace(codeContent, codeContentNewLine2Br)
									.replace("[code]", '<div class="div_listagem"><pre class="pre_listagem">')
									.replace("[/code]", '</pre></div>');
							}

							elem.html(
								data.new
							);
						}						

						container.remove();

						elem.css('display', display);
					});

					var btnCancel = $('<button />', {
						class: 'dvm-editable-button-cancel',
						text: 'Cancelar'
					}).appendTo(container);

					btnCancel.on('click', function(e){
						data = {
							old: elem.text(),
							new: textarea.val()
						}

						if(typeof settings.onCancel === 'function' && settings.onCancel(e, data) === false){
							return false;
						}

						container.remove();

						elem.css('display', display);
					});

					container.appendTo(elem.parent());

					if(typeof settings.onCreate === 'function'){
						settings.onCreate(container, {old: elem.text(), new: textarea.val()});
					}

					textarea.focus();
					textarea.elastic();
				});
			});
		}
  	});
}(jQuery));

function _t(text){
	return ;
}