package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main7.java` stwórz metodę o sygnaturze `static boolean rewrite()`.
//1. Uzupełnij ciało metody tak, aby wczytała z konsoli  nazwę pliku.
//2. Sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi plik z sufiksem "_2",
// do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.
//
//Przykład:
//wczytana nazwa pliku `text1.txt`, z zawartością abc, zostanie utworzony plik o nazwie `text1_2.txt`
// o zawartości:
//````
//abc
//abc
//````

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main7 {

    public static void main(String[] args) {
        try {
            rewrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean rewrite() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of file:");
        String fileName = scanner.next();
        Path path = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+fileName);

        StringTokenizer st = new StringTokenizer(fileName,".");
        String rowFileName = st.nextToken();
        String extension = st.nextToken();

        if(Files.exists(path)){

            Path path2 = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                    "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+rowFileName+"_2."+extension);
            Files.createFile(path2);
            writeTextToNewFile(path, path2);
        }
        else{
            System.out.println("This file doesn't exist!!!");
        }
        return false;
    }

    static void writeTextToNewFile(Path path,Path path2) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 2; i++) {
            for (String line : Files.readAllLines(path)) {
                list.add(line);
            }
        }
        Files.write(path2, list);
    }

}
