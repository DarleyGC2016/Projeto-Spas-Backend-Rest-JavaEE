package com.stefanini.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stefanini.resource.util.ObjectMapperContextResolver;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "co_seq_perfil")
    private Long id;
    /**
     *
     */
    @NotNull
    @Column(name = "no_perfil")
    private String nome;
    /**
     *
     */
    @NotNull
    @Column(name = "ds_perfil")
    private String descricao;
    /**
     *
     */
    @Column(name = "dt_hora_inclusao")
    @NotNull
    private LocalDateTime dataHoraInclusao = LocalDateTime.now();
    /**
     *
     */
    @Column(name = "dt_hora_alteracao")
    
    private LocalDateTime dataHoraAlteracao = LocalDateTime.now();
    
    //private ObjectMapperContextResolver resolver = new ObjectMapperContextResolver();

//    /**
//     * Mapeamento de Pessoa
//     */
//    @ManyToMany(mappedBy = "perfils")
//    private Set<Pessoa> pessoas;


    public Perfil() {
    }

    public Perfil(Long id) {
        this.id = id;
    }

    public Perfil(@NotNull String nome, @NotNull String descricao, @NotNull LocalDateTime dataHoraInclusao, LocalDateTime dataHoraAlteracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataHoraInclusao = dataHoraInclusao;
        this.dataHoraAlteracao = dataHoraAlteracao;
        
//        this.pessoas = pessoas;
    }

//    public Set<Pessoa> getPessoas() {
//        return pessoas;
//    }
//
//    public void setPessoas(Set<Pessoa> pessoas) {
//        this.pessoas = pessoas;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraInclusao() {
        return dataHoraInclusao;
    }

    public void setDataHoraInclusao(LocalDateTime dataHoraInclusao) {
        this.dataHoraInclusao = dataHoraInclusao;
    }

    public LocalDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }

    
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHoraAlteracao == null) ? 0 : dataHoraAlteracao.hashCode());
		result = prime * result + ((dataHoraInclusao == null) ? 0 : dataHoraInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (dataHoraAlteracao == null) {
			if (other.dataHoraAlteracao != null)
				return false;
		} else if (!dataHoraAlteracao.equals(other.dataHoraAlteracao))
			return false;
		if (dataHoraInclusao == null) {
			if (other.dataHoraInclusao != null)
				return false;
		} else if (!dataHoraInclusao.equals(other.dataHoraInclusao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataHoraInclusao=" + dataHoraInclusao +
                ", dataHoraAlteracao=" + dataHoraAlteracao +
//                ", pessoas=" + pessoas +
                '}';
    }
}
