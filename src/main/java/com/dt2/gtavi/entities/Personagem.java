package com.dt2.gtavi.entities;

import jakarta.persistence.*;

@Entity
public class Personagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String apelido;
    private String categoria;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Personagem(int id, String nome, String categoria, String apelido, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.apelido = apelido;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem(String nome, String apelido, String imagem, String categoria, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.imagem = imagem;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Personagem() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
