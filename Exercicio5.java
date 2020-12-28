import java.util.*;

  public class Exercise5{
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ")
            lista.add(sc.nextInt());

        }
        System.out.print(lista);
        Collections.sort(lista);

        System.out.println("Os numeros ordenados são: " + lista);

        }
       }
