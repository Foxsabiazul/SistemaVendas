/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.companymodelo;

/**
 *
 * @author rosa.3950
 */
public class ModCategoria {
    private int id;
    private String nome;
    private String descrição;
    
    public ModCategoria(){
    }

    public ModCategoria(int id, String nome, String descricao){
    this.id = id;
    this.nome = nome;
    this.descrição = descrição;
}

    public int getId(){
     return id;
}

public void setId(int id) {
        this.id = id;
}

public String getNome() {
        return nome;
}

public void setNome(String nome) {
        this.nome = nome;
}

public String getDescricao() {
        return descrição;
}

public void setDescricao(String descricao) {
        this.descrição = descricao;
}

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + ", descricao=" + descrição + '}';
    }
}