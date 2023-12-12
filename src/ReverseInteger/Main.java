package ReverseInteger;

public class Main {
    public static void main(String[] args) {
        int x = 1534236469;

        String string = String.valueOf(x);

        String reversedString = new StringBuilder(string).reverse().toString();


        try {
            if (reversedString.length() > 1){
                if (reversedString.charAt(0) == '0'){
                    reversedString = reversedString.substring(1);
                }

                if (reversedString.length() > 0){
                    if (reversedString.charAt(reversedString.length()-1) == '-' && x != 0){
                        reversedString = "-" + reversedString.substring(0, reversedString.length()-1);
                        int teste = Integer.parseInt(reversedString);
                    }
                }
            }
        } catch (NumberFormatException e){
            x = 0;
        }





    }
}
