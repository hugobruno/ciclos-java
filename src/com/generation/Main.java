package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Ciclo for
        /*
        for(contador = 0; contador < numero; contador++){
        //codigo que se repite
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();
        sc.close();
        for(int i = 1; i<=10; i++){
            System.out.println(numero + "x" + i + " = "+(numero*i));
        }
    }
}*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      /* int n; //Fibonacci
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese número límite: ");
        n = reader.nextInt();

        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else {
            if (n >= 1) {
                System.out.printf("0 ");
            }
            if (n >= 2) {
                System.out.printf("1 ");
            }
            long anterior = 0;
            long actual = 1;
            int i;
            for (i = 3; i <= n; i++) {
                long copia_actual = actual;
                actual = actual + anterior;
                anterior = copia_actual;
                System.out.printf("%d ", actual);
            }
        }
    }
}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto. Ingresa el numero");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while (numero != numeroSecreto) {
            System.out.println("Adivina el numero secreto. Ingresa un numero");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("Felicidades adivinaste el numero secreto");
    }
}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int factorial= 1;
        System.out.println("Ingresa numero");
        int numero = sc.nextInt();

        while(numero !=0){
                factorial = factorial * numero;
                numero = numero - 1;
            }
        System.out.println("El factorial es: "+ factorial);
    }
}