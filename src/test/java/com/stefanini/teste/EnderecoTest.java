package com.stefanini.teste;


import org.junit.Assert;
import org.junit.Test;

import com.stefanini.model.Endereco;


import mockit.Tested;

public class EnderecoTest {
	@Tested
	Endereco endereco;

	    
    @Test
    public void testarEndereco(){
    	
        String cep = "78545220";
       
    	String uf = "DF";
    	
		String localidade = "Brasilia";
		String bairro = "Taguatinga";
		String complemento = "Casa 98";
		String logradouro = "Qn";
		Long idPessoa = 1L;
		Long id = 1L;
		Endereco endereco = new Endereco(cep,uf ,localidade ,bairro ,complemento ,logradouro ,idPessoa );
        endereco.setId(id);
        
    	Assert.assertEquals(endereco.getIdPessoa(), idPessoa);
    	Assert.assertEquals(endereco.getCep(), cep);
    	Assert.assertEquals(endereco.getUf(),uf);
    	Assert.assertEquals(endereco.getLocalidade(),localidade);
    	Assert.assertEquals(endereco.getBairro(), bairro);
    	Assert.assertEquals(endereco.getComplemento(), complemento);
    	Assert.assertEquals(endereco.getLogradouro(),logradouro);
    	Assert.assertEquals(endereco.getId(), id);
    	System.out.println(endereco);
    }
    
	@Test
	public void testeConstrutor() {
		   String cep = "78545220";	       
	    	String uf = "DF";	    	
			String localidade = "Brasilia";
			String bairro = "Taguatinga";
			String complemento = "Casa 98";
			String logradouro = "Qn";
			Long idPessoa = 1L;
		
			Endereco endereco = new Endereco(cep,uf ,localidade ,bairro ,complemento ,logradouro ,idPessoa );
		
	    	Assert.assertEquals(endereco.getIdPessoa(), idPessoa);
	    	Assert.assertEquals(endereco.getCep(), cep);
	    	Assert.assertEquals(endereco.getUf(),uf);
	    	Assert.assertEquals(endereco.getLocalidade(),localidade);
	    	Assert.assertEquals(endereco.getBairro(), bairro);
	    	Assert.assertEquals(endereco.getComplemento(), complemento);
	    	Assert.assertEquals(endereco.getLogradouro(),logradouro);
	}
	
	@Test
	public void testeHashCode() {
		    Long id = 1L;
		    String cep = "78545220";	       
	    	String uf = "DF";	    	
			String localidade = "Brasilia";
			String bairro = "Taguatinga";
			String complemento = "Casa 98";
			String logradouro = "Qn";
			Long idPessoa = 1L;
		
			Endereco endereco = new Endereco(cep,uf ,localidade ,bairro ,complemento ,logradouro ,idPessoa );
		
			endereco.setId(id);
			
			final int prime = 31;
			int result = 1;
			result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
			result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());

			 int resultado = endereco.hashCode();
			
		    Assert.assertEquals(resultado, result);
	}
}
