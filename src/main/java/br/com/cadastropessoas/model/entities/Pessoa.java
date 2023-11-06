package br.com.cadastropessoas.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Para dizer que o valor de id é gerado pelo banco
    @Column(name = "pessoa_id")
    private Long id;
    @Column(name = "pessoa_nome")
    private String nome;
    @Column(name = "pessoa_cpf")
    private String cpf;
    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> listaDeEnderecos = new ArrayList<>();

    public Pessoa() {
        super();
    }

    public Pessoa(Long id, String nome, String cpf, Endereco listaDeEnderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        setListaDeEnderecos(getListaDeEnderecos());
    }

    public Long getId() {
        return id;
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

    public void setListaDeEnderecos(List<Endereco> listaDeEnderecos) {
        this.listaDeEnderecos = listaDeEnderecos;
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
