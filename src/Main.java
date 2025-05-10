import model.Categoria;
import model.Item;
import model.Mercado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Categoria alimentos = new Categoria("Alimentos");
        Categoria bebidas = new Categoria("Bebidas");
        Categoria higieneCorporal = new Categoria("Higiene");
        Categoria limpeza = new Categoria("Limpeza");

        Item bolo = new Item("bolo", 26);
        Item arroz = new Item("Arroz", 10);
        Item feijao = new Item("Feijão", 12);

        Item cafe = new Item("café", 30);
        Item cocaCola = new Item("coca-cola", 15);
        Item cachaca51 = new Item("cachaca", 50);

        Item detergente = new Item("detergente", 10);


        Item pastaDental = new Item("pasta dental", 7);
        Item cremeCorporal = new Item("creme corporal", 10);
        Item desodorante = new Item("Desodorante", 15);


        alimentos.adicionarItem(bolo);
        alimentos.adicionarItem(arroz);
        alimentos.adicionarItem(feijao);

        bebidas.adicionarItem(cafe);
        bebidas.adicionarItem(cocaCola);
        bebidas.adicionarItem(cachaca51);

        limpeza.adicionarItem(detergente);

        higieneCorporal.adicionarItem(pastaDental);
        higieneCorporal.adicionarItem(cremeCorporal);
        higieneCorporal.adicionarItem(desodorante);


        Mercado jaassai = new Mercado("Jassai");
        jaassai.adicionarCategoria(alimentos);
        jaassai.adicionarCategoria(bebidas);
        jaassai.adicionarCategoria(limpeza);
        jaassai.adicionarCategoria(higieneCorporal);

        System.out.println("Apresente todas as categorias cadastradas no mercado");
        jaassai.apresentarCategoria();

        System.out.println("Mostre todos os itens "  );
        jaassai.apresentarItens();

        /*
        Mercado jaifood = new Mercado("Jaifood");
        jaifood.adicionarCategoria(alimentos);
        jaifood.adicionarCategoria(bebidas);
        jaifood.adicionarCategoria(limpeza);

        Mercado jaitacadao = new Mercado("Jaitacaodo");
        jaitacadao.adicionarCategoria(alimentos);
        jaitacadao.adicionarCategoria(bebidas);
        jaitacadao.adicionarCategoria(limpeza);
        jaitacadao.adicionarCategoria(higieneCorporal);


        Mercado jaifour = new Mercado("Jaifour");
        jaifour.adicionarCategoria(alimentos);
        jaifour.adicionarCategoria(bebidas);
        jaifour.adicionarCategoria(limpeza);
        jaifour.adicionarCategoria(higieneCorporal);
        */

    }
}