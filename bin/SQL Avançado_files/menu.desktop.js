$(function(){
$("#headermenudesktop").prepend("<ul class=\"navspace menucel ativo3 dm-1\">\
<li><a href=\"#\" rel=\"nofollow\" class=\"menulink\">Códigos &nbsp;<small>&#9660;</small></a>\
	<ul class=\"submenu\">\
		<li><a class=\"menu-destak\" href=\"http://www.devmedia.com.br/guias/\">Guias de Refer&ecirc;ncia</a>\
			<ul class=\"submenu2\">\
			</ul>\
		</li>\
		<li><a class=\"menu-destak\" href=\"http://www.devmedia.com.br/cursos/\">Cursos & S&eacute;ries</a>\
			<ul class=\"submenu2\">\
			</ul>\
		</li>\
		<li class=\"submenu-line\"><a class=\"menu-destak\" href=\"http://www.devmedia.com.br/ultimas-atualizacoes/\">&Uacute;ltimas atualiza&ccedil;&otilde;es &nbsp;&raquo;</a>\
			<ul class=\"submenu2\">\
			<li><a href=\"http://www.devmedia.com.br/front-end-web/\">Front-end web</a></li>\
			<li><a href=\"http://www.devmedia.com.br/mobile/\">Mobile</a></li>\
			<li><a href=\"http://www.devmedia.com.br/java/\">Java</a></li>\
			<li><a href=\"http://www.devmedia.com.br/dotnet/\">.net</a></li>\
			<li><a href=\"http://www.devmedia.com.br/php/\">PHP</a></li>\
			<li><a href=\"http://www.devmedia.com.br/delphi/\">Delphi</a></li>\
			<li><a href=\"http://www.devmedia.com.br/banco-de-dados/\">Banco de dados</a></li>\
			<li><a href=\"http://www.devmedia.com.br/engenharia-de-software/\">Engenharia de Software</a></li>\
			<li><a href=\"http://www.devmedia.com.br/canal-mais/\">Canal Mais</a></li>\
			<li><a href=\"http://www.devmedia.com.br/ultimas-atualizacoes/\" class=\"btn-dm-nav\">&Uacute;ltimas atualiza&ccedil;&otilde;es</a></li>\
			</ul>\
		</li>\
		<li class=\"submenu-bottom-line menu-small\"><a href=\"http://www.devmedia.com.br/devcast/\">DevCast &nbsp;&raquo;</a>\
			<ul class=\"submenu2\">\
			<li><a href=\"http://www.devmedia.com.br/devcast/front-end-web\">DevCast Front-end web</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/mobile\">DevCast Mobile</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/java\">DevCast Java</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/dotnet\">DevCast .NET</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/php\">DevCast PHP</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/delphi\">DevCast Delphi</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/banco-de-dados\">DevCast Banco de dados</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/engenharia-de-software\">DevCast Engenharia de Software</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/canal-mais\">DevCast Canal Mais</a></li>\
			<li><a href=\"http://www.devmedia.com.br/devcast/\" class=\"btn-dm-nav\">Todos os DevCast</a></li>\
			</ul>\
		</li>\
		<li class=\"submenu-guias menu-small\"><a href=\"http://www.devmedia.com.br/artigos/\">Artigos &nbsp;&raquo;</a>\
			<ul class=\"submenu2\">\
			<li><a href=\"http://www.devmedia.com.br/artigos/front-end-web\">Artigos de Front-end web</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/mobile\">Artigos de Mobile</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/java\">Artigos de Java</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/dotnet\">Artigos de .NET</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/php\">Artigos de PHP</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/delphi\">Artigos de Delphi</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/banco-de-dados\">Artigos de Banco de dados</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/engenharia-de-software\">Artigos de Engenharia de Software</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/canal-mais\">Artigos Canal Mais</a></li>\
			<li><a href=\"http://www.devmedia.com.br/artigos/\" class=\"btn-dm-nav\">Todos os artigos</a></li>\
			</ul>\
		</li>\
		<li class=\"menu-small\"><a href=\"http://www.devmedia.com.br/desafios/\">Desafios</a>\
			<ul class=\"submenu2\">\
			</ul>\
		</li>\
		<li class=\"submenu-recomendado menu-small\"><a href=\"http://www.devmedia.com.br/recomendado/\">Recomendado</a>\
			<ul class=\"submenu2\">\
			</ul>\
		</li>\
	</ul>\
</li>\
</ul>\
<ul class=\"menucel dm-5\"><li><a href=\"http://www.devmedia.com.br/forum/\" class=\"menulink2\">F&oacute;rum</a></li></ul>\
<ul class=\"menucel dm-6\"><li><a href=\"http://www.devmedia.com.br/jobs/\" class=\"jobs-beta menulink2\">JOBS</a></li></ul>\
<ul class=\"menucel dm-6\"><li><strong><a href=\"http://www.devmedia.com.br/mvp/\" class=\"menulink2\">Assine MVP</a></strong></li></ul>");

$(".submenu>li").mouseenter(function() {
	var $submenu2 = $(this).find("ul.submenu2");
	// var $ativo3Height = $submenu2.height()+112;
	//alert($ativo3Height);
	
	// if($submenu2.length>0 && $ativo3Height>310){ $(".ativo3").css("height",$ativo3Height); }
	// else{ $(".ativo3").removeAttr("style");$submenu2.css("height",293); }
	// setTimeout( function() {
	// $submenu2.addClass("submenu2Hover");
	// }, 200);
}).mouseleave(function() {
	$("ul.submenu2").removeAttr("style");
	$(".ativo3").removeAttr("style");
});
});