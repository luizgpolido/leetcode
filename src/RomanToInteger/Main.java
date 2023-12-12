package RomanToInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Roman Numbers: ");
        String s = scanner.nextLine();

        solution(s);
    }

    public static void solution(String s){
        int number = 0;

        char[] splitedString = s.toUpperCase().toCharArray();
        int [] numb = new int[splitedString.length];

        for (int i = 0; i < splitedString.length; i++) {
            switch (splitedString[i]) {
                case 'I' -> numb[i] = 1;
                case 'V' -> numb[i] = 5;
                case 'X' -> numb[i] = 10;
                case 'L' -> numb[i] = 50;
                case 'C' -> numb[i] = 100;
                case 'D' -> numb[i] = 500;
                case 'M' -> numb[i] = 1000;
            }
        }

        for (int i = 0; i < numb.length; i++) {

        }
        System.out.println(number);

    }
}





