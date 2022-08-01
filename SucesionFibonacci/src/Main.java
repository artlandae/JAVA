import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int contador=0;
        int suma=0;
        int primerNumero=0;
        int segundoNumero=0;
        ArrayList<Integer> fibonacci=new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);
        System.out.println("Sucesion de Fibonacci");
        System.out.println("Secuencia infinita de numeros naturales, a partir del 0 y 1");
        System.out.println("Digite el numero de iteraciones deseadas: ");
        int iteraciones= entrada.nextInt();
        while(contador <= iteraciones){
            if (fibonacci.size()==2){
                suma=fibonacci.get(0)+fibonacci.get(1);
                fibonacci.add(suma);
            }else{
                suma=fibonacci.get((fibonacci.size()-2))+fibonacci.get((fibonacci.size()-1));
                fibonacci.add(suma);
            }
            contador++;
        }
        contador=0;
        while(contador<=iteraciones){
            System.out.println(fibonacci.get(contador));
            contador++;
        }
    return;
    }
}