import java.util.Scanner;
public class Ejercicio3 {
    public static void main( String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero n de multiplos: ");
        int n = scan.nextInt();
        if (esPrimo(n))
            System.out.println("Es primo.");
        else
           System.out.println("No es primo.");
        scan.close();
    }
    public static boolean esPrimo(int m){
        int contador=0;
        for (int i =1; i<=m; i++){
            if(m%i==0)
                contador++;
        }
        System.out.println(contador);
        if(contador==2)
            return true;
        else
            return false;
    }
}