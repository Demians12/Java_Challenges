import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        List<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

       System.out.println("Adicione cores à lista");
       System.out.println();
       for(int i = 0; i < 3; i++){
           System.out.println("Digite uma cor");
           lista.add(sc.nextLine());
       }
        System.out.println("As cores digitadas são: " + lista);

    }
}
