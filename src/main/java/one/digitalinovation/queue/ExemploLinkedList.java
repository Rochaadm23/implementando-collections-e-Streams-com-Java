package one.digitalinovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");
        filaDeBanco.add("Carlos");

        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);

        //filaDeBanco.clear();

        // Retorna o primeiro elemento da fila, mas não remove
        String primeiroCliente = filaDeBanco.peek();

        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

       // Não remove o primeiro elemento, mas retorna uma exceção se a fila estiver vazia
        String primeiroClienteErro = filaDeBanco.element();

        System.out.println(primeiroClienteErro);

        for (String client: filaDeBanco) {
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println(filaDeBanco.size());

        System.out.println(filaDeBanco.isEmpty());

    }
}
