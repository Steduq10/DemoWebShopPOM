package util;

public class EmailGenerator {

    EmailGenerator(){

    }
    public static String generateEmail() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String email = letters[(int) (Math.random() * letters.length)] + letters[(int) (Math.random() * letters.length)]
                +letters[(int) (Math.random() * letters.length)] + letters[(int) (Math.random() * letters.length)]+
                letters[(int) (Math.random() * letters.length)] + letters[(int) (Math.random() * letters.length)];



        return email + "@mail.com";
    }
}
