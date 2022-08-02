import java.util.Scanner;

public class Main {
    static double areaPoligono(int poligono){
        Scanner entrada=new Scanner(System.in);
        double lado=0;
        double altura=0;
        switch (poligono){
            case 1:
                System.out.println("Digita el tamaño de la base del triangulo: ");
                lado=entrada.nextDouble();
                System.out.println("Digita el tamaño de la altura del triangulo: ");
                altura=entrada.nextDouble();
                return ((lado*altura)/2);
            case 2:
                System.out.println("Digita el tamaño del lado del cuadrado: ");
                lado=entrada.nextDouble();
                return lado*lado;
            case 3:
                System.out.println("Digita el tamaño del lado del rectangulo: ");
                lado=entrada.nextDouble();
                System.out.println("Digita el tamaño de la altura del rectangulo: ");
                altura=entrada.nextDouble();
                return lado*altura;
            default:
                System.out.print("No existe esa opcion: ");
        }
        return poligono;
    };
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int poligono=0;
        System.out.println("Calcula el area de alguno de los siguientes poligonos: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        poligono=entrada.nextInt();
        System.out.println(areaPoligono(poligono));

        return;
    }
}

