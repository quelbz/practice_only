import java.sql.SQLOutput;
import java.util.Scanner;

public class Day_1_practice {
    public static void main(String[] args) {
        String [][] names = {
                {"quelbz","quelbz123"},
                {"obet","obet123"},
                {"tantin","tantin123"},
                {"nek","nek123"},
                {"akel","akel123"}
        };

        String[] uName = {"quelbz","obet","tantin","nek","raqeul"};
        String[] pWord = {"quelbz123","obet123","tantin123","nek123","akel123"};

       for (int x = 0; x < 5; x++) {
            if (uName[x].equals("tantin") && pWord[x].equals("tantin123")) {
                System.out.println("Welcome!");
                break;
            }
            else System.out.println("Wrong LogIn");
       }
    }
}
