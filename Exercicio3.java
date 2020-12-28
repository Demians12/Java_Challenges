import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        // Write a Java program to retrieve an element (at a specified index) from a given array list

        //Creating a list
        for(int i = 0; i < 4; i++){
            System.out.println("Digite um número: ");
            lista.add(sc.nextInt());
        }
        System.out.println(lista);

        //Retrieving an element from the list at 1 index
        System.out.println("The first element is: ");
        int novaLista = lista.get(0);
        System.out.println(novaLista);

    }
}
