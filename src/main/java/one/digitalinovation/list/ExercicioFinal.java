package one.digitalinovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        // Criando uma lista de nomes
        List<String> nomes = new ArrayList<>();

        // Adicionando nomes na lista
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        // Percorrendo a lista e exibindo cada nome
        for (String nomeItem: nomes) {
            System.out.println("----> " + nomeItem);

        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");

        System.out.println(nomes);

        int qtdItens = nomes.size();
        System.out.println(qtdItens);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        List<String> nomes2 =  new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println("--> " + nomes2);

        System.out.println("---->" + nomes);


        nomes.addAll(nomes2);

        System.out.println("---->" + nomes);

        Collections.sort(nomes);
        System.out.println("---*->" + nomes);

        System.out.println(nomes.isEmpty());

    }
}
