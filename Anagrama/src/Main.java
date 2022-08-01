import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int contador=0;
        System.out.println("¿Es un Anagrama?");
        System.out.println("Escribe la primer palabra: ");
        String palabra = entrada.nextline();
        System.out.println("Escribe la segunda palabra: ");
        String anagrama = entrada.nextline();

        if (palabra.length()!=anagrama.length()){
            System.out.println("No tienen la misma cantidad de letras por ende no son anagramas;");

        }else {
            while(contador>=palabra.length){
                System.out.println("Son anagramas!");
            }

        }



        return;
    }
}