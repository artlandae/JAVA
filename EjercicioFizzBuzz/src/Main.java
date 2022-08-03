public class Main {
    public static void main(String[] args) {
        int numeros = 1;
        int contador = 0;
        int contadorCinco = 0;

        while(numeros <= 100) {
            int multiplo = 1;
            if (numeros != multiplo) {
                for(; multiplo <= numeros; ++multiplo) {
                    if (numeros == multiplo * 3) {
                        contador = multiplo * 3;
                    }
                }
            }

            multiplo = 1;
            if (numeros != multiplo) {
                for(; multiplo <= numeros; ++multiplo) {
                    if (numeros == multiplo * 5) {
                        contadorCinco = multiplo * 5;
                    }
                }
            }

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
            } else {
                ++numeros;
            }
        }

        return;
    }
}