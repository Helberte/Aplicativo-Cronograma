use cronograma
go

alter procedure sp_atualiza_leituras

@id_usuario				int

as
begin

	begin try
		
		declare @quantidade int

		select @quantidade=COUNT(*) from livro l, leitura t, usuario u
								Where l.fk_id_usuario = u.id
								and t.fk_id_Livro = l.id
								and t.fk_id_usuario = u.id
								and u.id = @id_usuario

		if @quantidade > 0 
		begin

			select l.nome,
				   t.data_inicial,
				   t.data_prevista_final, 
				   t.paginas_ou_cap_lidos, 
				   t.quantidade_paginas,
				   1 [RESULTADO]    from livro l, leitura t, usuario u
									Where l.fk_id_usuario = u.id
									and t.fk_id_Livro = l.id
									and t.fk_id_usuario = u.id
									and u.id = @id_usuario
		end
		else 
		begin
			select 'Nenhuma leitura ainda, vamos come�ar?' [MENSAGEM], 2 [RESULTADO]
		end		
		
	end try
	begin catch
		
		select 'Problemas ao atualizar leituras' [MENSAGEM], 0 [RESULTADO]
	end catch		
end
go