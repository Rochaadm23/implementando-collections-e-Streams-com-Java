package one.digitalinovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> filaCaixa = new LinkedList<>();

        filaCaixa.add("Juliana");
        filaCaixa.add("Pedro");
        filaCaixa.add("Carlos");
        filaCaixa.add("Larissa");
        filaCaixa.add("João");

        // exibindo os nomes da fila do caixa
            int cont = 0;
        for (String cliente: filaCaixa) {
            System.out.println((cont + 1) + "º Cliente na fila do caixa: " + cliente);
            cont++;

        }
        // filaCaixa.clear();
        // Retornando o primeiro item da fila, sem removê-lo
        String primeiroCliente = filaCaixa.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaCaixa);
        System.out.println(filaCaixa);

        String removendoPrimeiroCliente = filaCaixa.poll();
        System.out.println(removendoPrimeiroCliente);
        System.out.println(filaCaixa);

        // Inserindo novo cliente na fila
        filaCaixa.add("Daniel");

        System.out.println(filaCaixa);
        // Exibindo o tamanho da fila
        System.out.println(filaCaixa.size());
        // Verificando se a fila está vazia
        System.out.println(filaCaixa.isEmpty());
        // Verificando se o nome Carlos está na fila
        System.out.println(filaCaixa.contains("Carlos"));



    }
}
