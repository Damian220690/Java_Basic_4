package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main3.java` napisz program, który:
//
//1. Pobierze z konsoli nazwę pliku.
//2. Wczyta dane w określonym formacie:
//
//Nazwisko Imie RokUrodzenia Płeć np:
//
//```
//Kowalski Marek 1955 M
//Krzak Marianna 1966 K
//```

//Stworzy i zwróci tablicę String (imię + nazwisko) osób które mogą przejść na emeryturę,
//sygnatura metody `static String[] retirement()`.
//Dla kobiet będzie to 60 lat, dla mężczyzn 65.

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        try {
            String [] finalArray = retirement(getPersonalInformation());
            System.out.println(Arrays.toString(finalArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getPersonalInformation() throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Please enter file name:");
        String fileName = scanner.next();
        Path path = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+fileName);
        System.out.println("Nazwisko Imie RokUrodzenia Płeć");
        File file = new File(String.valueOf(path));
        scanner = new Scanner(file);
        ArrayList<String> pensionerList = new ArrayList<String>();

        while(scanner.hasNextLine()){
            String currentLine = scanner.nextLine();
            sb.append(currentLine+"\n").toString();
            if(!divideTextLine(currentLine).equals("")) {
                pensionerList.add(divideTextLine(currentLine));
            }
        }
        System.out.println(sb.toString());
        return  pensionerList;
    }

    static String divideTextLine(String line){
        StringTokenizer st = new StringTokenizer(line , " ");
        String[] textArray = new String[st.countTokens()];
        int age = 0;
        int currentYear = Year.now().getValue();
        for(int i = 0; i < textArray.length; i++){
            textArray[i] = st.nextToken();
        }
        age = currentYear - Integer.parseInt(textArray[2]);
//        System.out.println(Arrays.toString(textArray));
        if(textArray[3].equals("M") && age >= 65){
            return textArray[0]+" "+ textArray[1];
        }
        else if(textArray[3].equals("K") && age >= 60){
            return textArray[0]+" "+ textArray[1];
        }
        else{
            return "";
        }
    }

    static String[] retirement(List pensionerList) {

       String[] pensionerArray = new String[pensionerList.size()];
       pensionerList.toArray(pensionerArray);
       System.out.println("Schedule of people who can retirement: ");
       return pensionerArray;
    }

}
