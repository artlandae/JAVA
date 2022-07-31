import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu primer palabra: ");
        String cadena=entrada.nextLine();
        System.out.print("Escribe la segunda palabra: ");
        String cadenaDos=entrada.nextLine();
        int tamañoCadena=cadena.length();
        int tamañoCadenaDos=cadenaDos.length();
        if (tamañoCadena!=tamañoCadenaDos){
            System.out.println("no son anagramas");
            return;
        }else{
            int contador=0;
            boolean bandera=true;
            int contadorDos=(cadenaDos.length()-1);
            do{
                char cadenaU=cadena.charAt(contador);
                char cadenaD=cadenaDos.charAt(contadorDos);
                    if(cadenaU==cadenaD){
                        contadorDos=contadorDos-1;
                    }else {
                        bandera=false;
                        break;
                }
                contador++;
            }while(contador>=tamañoCadena);
            System.out.println(bandera);
        }

        return;
    }
}