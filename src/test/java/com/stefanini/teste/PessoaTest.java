package com.stefanini.teste;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;


import mockit.Tested;

public class PessoaTest {
	@Tested
	Pessoa pessoa;

	    
    @Test
    public void testarPessoa(){
    	
    	Long id = 1L;
    	String nome = "José";
    	String email = "email";
    	LocalDate dataNascimento = LocalDate.now();
    	Boolean situacao = Boolean.TRUE;
    	String caminhoFoto= "caminhoFoto";
    	Set<Endereco> enderecos = new HashSet<Endereco>();
    	Set<Perfil> perfis = new HashSet<Perfil>();
    	enderecos.add(new Endereco("78545220","DF","Brasilia","Taguatinga","Casa 98","Qn",(long) 1));
    	perfis.add(new Perfil("usuario", "usuario comum", LocalDateTime.now(), LocalDateTime.now()));
    	
    	
    	Pessoa pessoa = new Pessoa(id,nome,email,dataNascimento,situacao,caminhoFoto);
    	pessoa.setEnderecos(enderecos);
    	pessoa.setPerfils(perfis);
  
    	Assert.assertEquals(pessoa.getId(), id);
    	Assert.assertEquals(pessoa.getNome(), nome);
    	Assert.assertEquals(pessoa.getEmail(), email);
    	Assert.assertEquals(pessoa.getDataNascimento(), dataNascimento);
    	Assert.assertEquals(pessoa.getSituacao(), situacao);
    	Assert.assertEquals(pessoa.getCaminhoFoto(),caminhoFoto);
    	Assert.assertEquals(pessoa.getEnderecos(), enderecos);
    	Assert.assertEquals(pessoa.getPerfils(), perfis);
    	
    	System.out.println(pessoa);
    }
    
	@Test
	public void testeConstrutor() {
		String nome = "nome";
		String email = "email";
		LocalDate dataNascimento = LocalDate.now();
		Boolean situacao = Boolean.TRUE;
		String caminhoFoto= "caminhoFoto";
		
		Pessoa pessoa = new Pessoa(nome, email, dataNascimento, situacao, caminhoFoto);
		
		Assert.assertEquals(pessoa.getNome(), nome);
		Assert.assertEquals(pessoa.getEmail(), email);
		Assert.assertEquals(pessoa.getDataNascimento(), dataNascimento);
		Assert.assertEquals(pessoa.getSituacao(), situacao);
		Assert.assertEquals(pessoa.getCaminhoFoto(), caminhoFoto);
	}
	
	@Test
	public void testeHashCode() {
		
    	Long id = 1L;
    	String nome = "José";
    	String email = "email";
    	LocalDate dataNascimento = LocalDate.now();
    	Boolean situacao = Boolean.TRUE;
    	String caminhoFoto= "caminhoFoto";
    	Set<Endereco> enderecos = new HashSet<Endereco>();
    	Set<Perfil> perfis = new HashSet<Perfil>();
    	enderecos.add(new Endereco("78545220","DF","Brasilia","Taguatinga","Casa 98","Qn",(long) 1));
    	perfis.add(new Perfil("usuario", "usuario comum", LocalDateTime.now(), LocalDateTime.now()));
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(id);
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.setDataNascimento(dataNascimento);
		pessoa.setSituacao(situacao);
		pessoa.setCaminhoFoto(caminhoFoto);
		pessoa.setEnderecos(enderecos);
		pessoa.setPerfils(perfis);
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caminhoFoto == null) ? 0 : caminhoFoto.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((perfis == null) ? 0 : perfis.hashCode());

		
		int resultado = pessoa.hashCode();
		Assert.assertEquals(resultado, result);
	}
}
