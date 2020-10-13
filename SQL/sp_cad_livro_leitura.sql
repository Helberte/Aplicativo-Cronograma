use cronograma
go

--exec sp_cad_livro_leitura 'Contra a correnteza', 'Daniel', '29', '10/10/2020', 'p�ginas', '500', '02/12/2020', '10'

alter procedure sp_cad_livro_leitura

@nome					varchar (100),
@autor					varchar (100),
@id_usuario				varchar (100),
@dataInicial			date,
@tipo_leitura			varchar(50),
@quantidadePag			int,
@data_prevista_final	date,
@meta					varchar(50)

as
begin
		
	begin try
		
		declare @fk_id_Livro as int
		
		insert into livro (nome, autor, fk_id_usuario) values (@nome, @autor, @id_usuario)

		set @fk_id_Livro = SCOPE_IDENTITY()

		
		insert into leitura (data_inicial,
							 tipo_de_leitura,
							 quantidade_paginas,
							 data_prevista_final,
							 meta,
							 fk_id_Livro,
							 fk_id_usuario,
							 paginas_ou_cap_lidos)
								values	(@dataInicial,
										 @tipo_leitura,
										 @quantidadePag,
										 @data_prevista_final,
										 @meta,
										 @fk_id_Livro,
										 @id_usuario,
										 0)

		select 'Sucesso' [MENSAGEM], 1 [RESULTADO]
	end try
	begin catch
		
		select 'Inser��o de dados falhou!' [MENSAGEM], 0 [RESULTADO]		
	end catch
end 
go
