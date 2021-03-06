


-- se a tabela existir OBJECT_ID retorna um n�mero de identifica��o
-- se a tabela n�o existir retorna null

--create database cronograma

use cronograma


if OBJECT_ID('usuario') is null
begin

	create table usuario(
	
		nome			varchar(100)		not null,
		loginUsuario	varchar(100)		not null,
		senha			char(8)				not null,
		id				int			identity(1,1)	primary key
	)
end
else
begin
	select 'existe'
end
go


if OBJECT_ID('livro') is null 
begin
	create table livro(
	
		nome				varchar(100)		not null,
		autor				varchar(100)		not null,
		id					int		identity	primary key,
		fk_id_usuario		int					not null,
		constraint			fk_livro_id_usuario	foreign key	(fk_id_usuario)  references usuario (id)
	)

end
go

if OBJECT_ID('leitura') is null
begin

	create table leitura(
		data_inicial		date		not null,
		tipo_de_leitura		varchar(50) not null, -- por pagina ou por capitulo
		quantidade_paginas	int			not null,
		paginas_ou_cap_lidos int,
		data_prevista_final	date		not null,
		meta				varchar(50)	not null, -- meta de paginas diarias ou meta de data final
	
		id_leitura			int						identity(1,1)	primary key,

		fk_id_Livro			int						not null,
		constraint			fk_leitura_id_livro		foreign key (fk_id_Livro)	references livro (id),
		fk_id_usuario		int						not null,
		constraint			fk_leitura_id_usuario	foreign key	(fk_id_usuario) references usuario (id),
	)
end
go

drop table leitura_concluida
if OBJECT_ID('leitura_concluida') is null
begin


	create table leitura_concluida(

		data_canclusao			date		not null,
		data_inicial			date		not null,
		tipo_de_leitura			varchar(50) not null, -- por pagina ou por capitulo
		quantidade_paginas		int			not null,
		paginas_ou_cap_lidos	int,
		data_prevista_final		date		not null,
		meta					varchar(50)	not null,

		fk_id_usuario			int			not null,
		constraint				fk_leitura_concluida_id_usuario foreign key	(fk_id_usuario) references usuario (id),
		fk_id_livro				int			not null,
		constraint				fk_leitura_concluida_id_livro	foreign key (fk_id_livro)	references livro (id),
		id_leitura_concluida	int			identity(1,1)		primary key
	)
end
go

--use cronograma

create table anotacao(

	id						int				identity(1,1)		primary key,
	anotacao				varchar(max),
	pagina					int,
	tituloAnotacao			varchar			not null,
	fk_anotacao_usuario		int				not null,
	fk_anotacao_livro		int				not null,
	constraint				fk_usuario_fk_anotacao_usuario foreign key (fk_anotacao_usuario) references usuario (id),
	constraint				fk_usuario_fk_anotacao_livro   foreign key (fk_anotacao_livro) references livro (id)
)
use cronograma
go
create table data_atualizacao(
	
	id								int			identity(1,1)		primary key,
	fk_atualizacao_usuario			int			not null,
	data_da_atualizacao				date		not null,
	constraint						fk_usuario_fk_atualizacao_usuario		foreign key (fk_atualizacao_usuario) references usuario (id),
)