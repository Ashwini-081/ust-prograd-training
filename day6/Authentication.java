/* Write a java program that let the user choose his/her username and password.
The program verifies whether the chosen username and password are valid.
If either one of them is invalid, it notifies the user by raising
exception and explain the cause of invalidity.
 The rules for choosing valid usernames and passwords are:
 a. A username must be of length 6-15 characters.
 b. A username must start with an uppercase English alphabet A to Z.
 c. A password must not be shorter than 8 characters but must not exceed 256.
 d. There cannot be any types of parentheses or whitespaces in a valid username or password.
 e. A password cannot contain or be the same as its associated username*/


import java.util.*;

class InputInvalidException extends Exception {
    public InputInvalidException(String message) {
        super(message);
    }

}
public class Authentication {
    public static void main(String[] args) throws Exception {
        String username, password;
        //int i ;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter User name:");
            username = scanner.nextLine();
            if (username.length() < 6 || username.length() > 15)
                throw new InputInvalidException("Username length is 6-15 ");
            if (!Character.isUpperCase(username.charAt(0)))
                throw new InputInvalidException("username start weith upper case letter");
            for (int i = 0; i < username.length(); i++)
                if (username.charAt(i) == ' ' || username.charAt(i) == ')' || username.charAt(i) == '(')
                    throw new InputInvalidException("user canot contain paranthisis or whitespaces");
            System.out.println("enter passward");
            password = scanner.nextLine();
            if (password.length() < 8 || password.length() > 256)
                throw new InputInvalidException("password length is 8 ");

            for (int i = 0; i < password.length(); i++)
                if (password.charAt(i) == ' ' || password.charAt(i) == ')' || password.charAt(i) == '(')
                    throw new InputInvalidException("password canot contain paranthisis or whitespaces");
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == username.charAt(i))
                    i++;
                else
                    i = 0;
                if (i == username.length()) {
                    throw new InputInvalidException("passward cant contain user name");
                }
            }
            if (password.equals(username))
                throw new InputInvalidException("passward cant same as user name");
            System.out.println("username and passward is valid");
        } catch (InputInvalidException ie) {
            System.out.println(ie);
        }
    }
}








