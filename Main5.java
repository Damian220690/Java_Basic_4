package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main5.java` stwórz metodę o sygnaturze `static void printTriangle()`.
//
//1. Uzupełnij ciało metody tak, aby wczytała z konsoli wartość typu int.
//2. Wypisze na konsoli trójkąt zbudowany ze znaku `x`, w którym obie przyprostokątne będą równe wczytanej wartości
//Przykład dla wczytanej wartości równej 5.
//
//````
//x
//x x
//x x x
//x x x x
//x x x x x
//````

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        printTriangle();
    }

    static void printTriangle(){
        Scanner scanner = scanner = new Scanner(System.in);
        int cathetusValue = 0;
        System.out.println("Please enter the cathetus value:");
            try {
                cathetusValue = scanner.nextInt();
            }
           catch (InputMismatchException e){
               System.out.println("Please insert numerical value!!!!");
           }

        String [][] triangleArray= new String[cathetusValue][cathetusValue];

        for(int i = 0; i < triangleArray.length; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }

}
