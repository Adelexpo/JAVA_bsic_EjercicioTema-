package com.ejercicioTema1;

public class TiposDatos {

    public static void main(String[] args) {

            // 1. numericos

            // 1.1 Numeros enteros
            byte variable1 = 5;
            short variable2 = 10;
            int variable3 = 30;
            long variable4 = 100;

            System.out.println("Numeros enteros: " + variable1 + " , " + variable2 +  " , " + variable3 + " , " + variable4);

            // 1.2 Numeros decimales
            float variable5 = 5.5f;
            double variable6 = 10.5d;

            System.out.println("Numeros decimales: " + variable5 + " , " + variable6);



            // 2 Numeros boleanos
            boolean variable7 = false;
            boolean variable8 = true;

                System.out.println("Numeros boleanos: " + variable7 + " , " +  variable8);


            // 3. texto
            char variable9 = 'a';
            String variable10 = "Lorem ipsum dolor sit amet....";

            System.out.println("texto: " + variable9 + ", " + variable10);
    }
}
