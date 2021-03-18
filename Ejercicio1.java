import java.util.Scanner;
public class Ejercicio1 {

    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero n: ");
        int n = scan.nextInt();
        for (int i = 0 ; i<=n; i++){
            if(esPar(i))
                System.out.println(i);
        }
    }
    public static boolean esPar(int x){
        return x%2==0;
    }
}
