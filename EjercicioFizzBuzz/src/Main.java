public class Main {
    static int multiploTres(int multiplo, int numeros){

        int contador =0;
        if (numeros != multiplo) {
            for(; multiplo <= numeros; ++multiplo) {
                if (numeros == multiplo * 3) {
                    contador = multiplo * 3;
                }
            }
        }
        return contador;
    }

    static int multiploCinco(int multiplo, int numeros){
        int contadorCinco=0;
        if (numeros != multiplo) {
            for(; multiplo <= numeros; ++multiplo) {
                if (numeros == multiplo * 5) {
                    contadorCinco = multiplo * 5;
                }
            }
        }
        return contadorCinco;
    }

    static int FizzBuzz(int contador,int contadorCinco,int numeros){
        if (numeros == contador && numeros == contadorCinco) {
            System.out.println("FIZZBUZZ");
        } else if (numeros == contador) {
            System.out.println("FIZZ");
        } else if (numeros == contadorCinco) {
            System.out.println("BUZZ");
        }
        if (numeros != contador && numeros != contadorCinco) {
            System.out.println(numeros);
            ++numeros;
        }
        else {
            numeros++;
        }
        return numeros;
    }
    public static void main(String[] args) {
        int numeros = 1;

        while(numeros <= 100) {
            numeros=FizzBuzz(multiploTres(1,numeros),multiploCinco(1,numeros),numeros);
        }
        return;
    }
}