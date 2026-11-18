package com.dt2.gtavi.entities;

import jakarta.persistence.*;

@Entity
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String fabricante;
    private String categoria;
    @Column(columnDefinition = "TEXT")
    private String imagem;
    private String descricao;

    public Arma(int id, String nome, String categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Arma(String nome, String fabricante, String imagem, String categoria, String descricao) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Arma() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
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

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
