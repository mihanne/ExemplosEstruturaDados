package br.com.exemplo.lista;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;

public class Exemplo_ListaLinkedList {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> lista = new LinkedList<String>();
        try (Scanner scanner = new Scanner(new File("/home/michelle/Documentos/Codigo_fonte/Exemplo_lista3/src/br/com/exemplo/lista/deputadosfederais.txt"))) {
            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }
            System.out.println("***Lista de Deputados Federais***");
            Iterator iterator = lista.iterator();

            while (iterator.hasNext()) {
                System.out.print(iterator.next() + "\n");
            }
            //remove o primeiro elemento da Lista
            System.out.println();
            System.out.println("***Lista de Deputados Federais***");
            lista.remove(0);
            //outra modo de fazer um print
            for (String elemento : lista) {
                System.out.println(elemento);
            }

        }
    }

}
