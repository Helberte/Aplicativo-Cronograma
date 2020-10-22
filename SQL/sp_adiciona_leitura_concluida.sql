use cronograma
go

--select * from leitura_concluida
--select * from leitura
--exec sp_adiciona_leitura_concluida usuario, livro
--exec sp_lancamento_leitura 62, 73, 500

go
alter procedure sp_adiciona_leitura_concluida

@fk_id_usuario			int,
@fk_id_livro			int

as
begin

			declare @data_conclusao			date
			declare @data_inicial			date
			declare @tipo_leitura			varchar(50)
			declare @quantidade_paginas		int
			declare @paginas_ou_cap_lidos	int
			declare @data_prevista_final	date
			declare @meta					varchar(50)

			begin try
				set @data_conclusao=CONVERT(date, SYSDATETIME(), 103)

				select @data_inicial=leitura.data_inicial from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				select @tipo_leitura=leitura.tipo_de_leitura from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				select @quantidade_paginas=leitura.quantidade_paginas from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				select @paginas_ou_cap_lidos=leitura.paginas_ou_cap_lidos from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				select @data_prevista_final=leitura.data_prevista_final from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				select @meta=leitura.meta from leitura 
				where leitura.fk_id_usuario=@fk_id_usuario
				and leitura.fk_id_Livro = @fk_id_livro

				insert into leitura_concluida(data_canclusao, 
												data_inicial,
												tipo_de_leitura,
												quantidade_paginas,
												paginas_ou_cap_lidos,
												data_prevista_final,
												meta,
												fk_id_usuario,
												fk_id_livro) values (@data_conclusao,
														@data_inicial,
														@tipo_leitura,
														@quantidade_paginas,
														@paginas_ou_cap_lidos,
														@data_prevista_final,
														@meta,
														@fk_id_usuario,
														@fk_id_livro)
			
				delete from leitura where leitura.fk_id_Livro = @fk_id_livro
				and leitura.fk_id_usuario = @fk_id_usuario

				select 1 [RESULTADO]
			end try
			begin catch
				select 0 [RESULTADO]
			end catch
				
end
go
