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

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(int codigo) {
        System.out.println(categorias.get(codigo)+ "foi removido com sucesso");
        categorias.remove(codigo);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int codigo) {
        System.out.println(itens.get(codigo)+ "foi removido com sucesso");
        itens.remove(codigo);
    }

    public void apresentarCategoria() {
       for (int i = 0; i < categorias.size(); i++) {
           System.out.println("código: " + i + "Nome da categoria: " + categorias.get(i).getNome());
       }
    }

    public void apresentarItens() {
        for (int i = 0; i < itens.size(); i++) {
            System.out.println("código: " + i + "Nome do Item: " + itens.get(i).getNome());
        }
    }

    public void apresentarCategoriaPorCodigo(int codigo) {
        for (int i = 0; i < categorias.size(); i++) {
            if (codigo == 0){
                for (int j = 0; j <categorias.get(0).getItens().size() ; j++) {
                    System.out.println(categorias.get(0).getItens().get(j).getNome());
                }
                i= categorias.size();
            }else if (codigo == 1){
                for (int j = 0; j <categorias.get(1).getItens().size() ; j++) {
                    System.out.println(categorias.get(1).getItens().get(j).getNome());
                }
                i= categorias.size();
            }else if (codigo == 2){
                for (int j = 0; j <categorias.get(2).getItens().size() ; j++) {
                    System.out.println(categorias.get(2).getItens().get(j).getNome());
                }
            }

        }
    }

}

