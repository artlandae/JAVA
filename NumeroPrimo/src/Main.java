public class Main {
    public static void main(String[] args) {
        double resultado=0;
        int divisor=2;
        int dividendo=1;
        int primo;
        System.out.println("Estos son los numeros primos entre el 1 y el 100: ");

        while(divisor<=100){
            primo=0;
            dividendo=1;
            while(dividendo<=divisor){
                if(divisor%dividendo==0){
                    primo++;
                }
                if(primo==3){
                    primo++;
                    break;
                }
                dividendo++;
            }
            if(primo==2){
                System.out.println("Este es un numero primo: "+divisor);
            }
            divisor++;
        }


        return;

    }
}