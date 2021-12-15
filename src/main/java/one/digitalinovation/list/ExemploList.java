package one.digitalinovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);

        nomes.set(2, "Laricia");

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("João");

        System.out.println(nomes);

        String nome = nomes.get(0);

        System.out.println(nome);

        int tamanho =  nomes.size();
        System.out.println(tamanho);

        boolean temFernando = nome.contains("");
        System.out.println(temFernando);


        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeItem: nomes) {
            System.out.println("----> " + nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("---> " + iterator.next());
        }
        nomes.clear();

        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);




    }
}
