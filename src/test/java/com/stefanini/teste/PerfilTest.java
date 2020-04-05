package com.stefanini.teste;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.stefanini.model.Perfil;

import mockit.Tested;

public class PerfilTest {
	@Tested
	Perfil perfil;

	    
    @Test
    public void testarPerfil(){
    	
 
		Long id = 1L;
		String nome = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nome,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    perfil.setId(id);
        
    	Assert.assertEquals(perfil.getId(), id);
    	Assert.assertEquals(perfil.getNome(), nome);
    	Assert.assertEquals(perfil.getDescricao(),descricao);
    	Assert.assertEquals(perfil.getDataHoraInclusao(),dataHoraInclusao);
    	Assert.assertEquals(perfil.getDataHoraAlteracao(),dataHoraAlteracao);
    	System.out.println(perfil);
    }
    
	@Test
	public void testeConstrutor() {
		String nome = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nome,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    
    	
    	Assert.assertEquals(perfil.getNome(), nome);
    	Assert.assertEquals(perfil.getDescricao(),descricao);
    	Assert.assertEquals(perfil.getDataHoraInclusao(),dataHoraInclusao);
    	Assert.assertEquals(perfil.getDataHoraAlteracao(),dataHoraAlteracao);
	}
	
	@Test
	public void testeHashCode() {
		Long id = 1L;
		String nome = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nome,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    perfil.setId(id);
			
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHoraAlteracao == null) ? 0 : dataHoraAlteracao.hashCode());
		result = prime * result + ((dataHoraInclusao == null) ? 0 : dataHoraInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());

		int resultado = perfil.hashCode();
			
		Assert.assertEquals(resultado, result);
	}
}
