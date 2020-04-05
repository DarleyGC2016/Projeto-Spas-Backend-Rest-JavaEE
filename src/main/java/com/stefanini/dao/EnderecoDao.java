package com.stefanini.dao;


import java.io.IOException;
import java.util.Optional;


import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Endereco;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class EnderecoDao extends GenericDao<Endereco, Long> {

	public EnderecoDao() {
		super(Endereco.class);
	}
	
    public Optional<Endereco> buscarCep(String cep) {
        ViaCEPClient client = new ViaCEPClient();
        Endereco endereco = new Endereco();
        try {
           ViaCEPEndereco cepEndereco = client.getEndereco(cep);
           endereco.setBairro(cepEndereco.getBairro());
           endereco.setComplemento(cepEndereco.getComplemento());
           endereco.setLocalidade(cepEndereco.getLocalidade());
           endereco.setUf(cepEndereco.getUf());
           endereco.setLogradouro(cepEndereco.getLogradouro());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Optional.of(endereco);
    }

}
