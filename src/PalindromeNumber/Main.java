package PalindromeNumber;

public class Main {
    public static void main(String[] args) {
        int x = -121;

        String string = String.valueOf(x);

        String reversedString = new StringBuilder(string).reverse().toString();

        System.out.println(string);
        System.out.println(reversedString);

        if (string.contains(reversedString)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
