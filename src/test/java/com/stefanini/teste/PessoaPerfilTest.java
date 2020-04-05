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
import com.stefanini.model.PessoaPerfil;

import mockit.Tested;

public class PessoaPerfilTest {
	@Tested
	PessoaPerfil pessoaPerfil;

	    
    @Test
    public void testarPessoaPerfil(){
    	
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
 
		Long idPerfil = 1L;
		String nomePerfil = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nomePerfil,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    perfil.setId(idPerfil);
	    
	    Long idPessoaPerfil = 1L;
        PessoaPerfil pessoaPerfil = new PessoaPerfil(perfil, pessoa);
         
        pessoaPerfil.setId(idPessoaPerfil);
        pessoaPerfil.setIdPessoa(pessoa.getId());
        pessoaPerfil.setIdPerfil(perfil.getId());
        
        Assert.assertEquals(pessoaPerfil.getId(), idPessoaPerfil);
    	Assert.assertEquals(pessoaPerfil.getPessoa(), pessoa);
    	Assert.assertEquals(pessoaPerfil.getPerfil(), perfil);
    	Assert.assertEquals(pessoaPerfil.getIdPessoa(),pessoa.getId());
    	Assert.assertEquals(pessoaPerfil.getIdPerfil(),perfil.getId());
    	
    	System.out.println(pessoaPerfil);
    }
    
	@Test
	public void testeConstrutor() {
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
 
		Long idPerfil = 1L;
		String nomePerfil = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nomePerfil,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    perfil.setId(idPerfil);
	    
	  
        PessoaPerfil pessoaPerfil = new PessoaPerfil(perfil, pessoa);
	    
    	Assert.assertEquals(pessoaPerfil.getPessoa(), pessoa);
    	Assert.assertEquals(pessoaPerfil.getPerfil(), perfil);
	}
	
	@Test
	public void testeHashCode() {
    	Long idPessoa = 1L;
    	String nome = "José";
    	String email = "email";
    	LocalDate dataNascimento = LocalDate.now();
    	Boolean situacao = Boolean.TRUE;
    	String caminhoFoto= "caminhoFoto";
    	Set<Endereco> enderecos = new HashSet<Endereco>();
    	Set<Perfil> perfis = new HashSet<Perfil>();
    	enderecos.add(new Endereco("78545220","DF","Brasilia","Taguatinga","Casa 98","Qn",(long) 1));
    	perfis.add(new Perfil("usuario", "usuario comum", LocalDateTime.now(), LocalDateTime.now()));
    	
    	
    	Pessoa pessoa = new Pessoa(idPessoa,nome,email,dataNascimento,situacao,caminhoFoto);
    	pessoa.setEnderecos(enderecos);
    	pessoa.setPerfils(perfis);
 
		Long idPerfil = 1L;
		String nomePerfil = "Usuário";
		String descricao = "Usuário Padrão";
		LocalDateTime dataHoraInclusao = LocalDateTime.now();
		LocalDateTime dataHoraAlteracao = LocalDateTime.now();
	    Perfil  perfil = new Perfil( nomePerfil,  descricao, dataHoraInclusao,  dataHoraAlteracao) ;
	    perfil.setId(idPerfil);
	    
	    Long id = 1L;
        PessoaPerfil pessoaPerfil = new PessoaPerfil(perfil, pessoa);
         
        pessoaPerfil.setId(id);
        pessoaPerfil.setIdPessoa(pessoa.getId());
        pessoaPerfil.setIdPerfil(perfil.getId());
			
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idPerfil == null) ? 0 : idPerfil.hashCode());
		result = prime * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());

		int resultado = pessoaPerfil.hashCode();
			
		Assert.assertEquals(resultado, result);
	}
}

