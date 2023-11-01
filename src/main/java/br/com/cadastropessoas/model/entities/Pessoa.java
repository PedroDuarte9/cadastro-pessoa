package br.com.cadastropessoas.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private String cpf;

    private List<Endereco> listaDeEnderecos = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, List<Endereco> listaDeEnderecos) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaDeEnderecos = listaDeEnderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Endereco> getListaDeEnderecos() {
        return listaDeEnderecos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
