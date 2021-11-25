import java.util.Scanner;

/*
 * Create the Encrypter class here.
 */

class Encrypter {
    public static String getEncryptedName(String name) {
        // if (name != null){
        Validator myValidator = new Validator();
        if (myValidator.validate(name)) {
            String lowercase = new String(name).toLowerCase();
            StringBuilder output = new StringBuilder(lowercase).reverse();
            return output.toString();
            // name.toLowerCase();
            // return name
        } else {
            throw new IllegalArgumentException("Try again with valid name");
        }
    }
}

class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

public class Solution1 {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();

        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}