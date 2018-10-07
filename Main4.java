package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main4.java` stwórz metodę o sygnaturze `static int[] sortedArray()`.
//
//1. Uzupełnij ciało metody tak, aby wczytała z konsoli ile liczb należy wylosować.
//2. Stworzy tablicę oraz umieść w niej losowe wartości z zakresu [0,100].
//3. Posortuje elementy tablicy a następnie ją zwróci.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        for(int s : sortedArray()) {
            System.out.println(s);
        }
    }

    static int[] sortedArray(){
        System.out.println("Enter the number of values: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        int [] numbersArray = new int[result];
        Random random = new Random();
        System.out.println("Array before sort:");
        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = (int) random.nextInt(100);
            System.out.println(numbersArray[i]);
        }
        System.out.println(" ");
        int [] sortedArray = numbersArray.clone();
        Arrays.sort(sortedArray);

        return sortedArray;
    }
}
