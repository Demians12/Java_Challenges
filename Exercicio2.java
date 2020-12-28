import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args){
        //Programa que adiciona um elemento na primeira posição de uma lista

        List<Integer> lista = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        //Criando uma lista
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            lista.add(sc.nextInt());


        }
        System.out.println(lista);

        System.out.println();

        //Adicionando número ao indice 1 da lista

        lista.add(0, 14);
        System.out.println("Lista com um elemento a mais no índice 1: " + lista);

        //Adicionando elemento ao índice 1 dinamicamente
        System.out.println();
        System.out.println("Agora digite um número que irá para a segunda posição: ");
        lista.add(1, sc.nextInt());
        System.out.println("A lista atualizada é essa: " + lista);
    }
}
