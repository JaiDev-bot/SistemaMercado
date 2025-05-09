package model;

import java.util.ArrayList;

public class Mercado {
    private int codigo;
    private String nome;
    private ArrayList<Categoria> categorias;
    private ArrayList<Item> itens;

    public Mercado(String nome) {
        this.categorias = new ArrayList<> ();
        this.itens = new ArrayList<>();
    }
}
