package model;

import java.util.ArrayList;

public class Categoria {
    private int codigo;
    private String nome;
    private ArrayList<Item> itens;

    public Categoria( String nome) {
        this.nome = nome;
        itens = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int codigo) {
        System.out.println(itens.get(codigo)+ "foi removido com sucesso");
        itens.remove(codigo);
    }
}
