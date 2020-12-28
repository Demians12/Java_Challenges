import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args){

        //Write a Java program to update specific array element by given element.

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < 4; i++){
            System.out.println("Digite um número: ");
            lista.add(sc.nextInt());
        }
        System.out.println(lista);

        //Updating the list
        lista.remove(2);
        System.out.println("O terceiro elemento da lista foi removido.");
        System.out.println();
        System.out.println("A lista atualizada é: " + lista);

    }
}
