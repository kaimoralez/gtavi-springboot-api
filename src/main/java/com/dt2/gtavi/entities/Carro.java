package com.dt2.gtavi.entities;

import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String marca;
    private String categoria;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Carro(int id, String nome, String categoria, String marca, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Carro(String nome, String marca, String imagem, String categoria, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.imagem = imagem;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Carro() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
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

    public void setMarca(String marca) {
        this.marca = marca;
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
