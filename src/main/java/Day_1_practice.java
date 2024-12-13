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

       for (String row[]: names) {
           for (String info: row) {
               if (info.equals("tantin")) {
                   System.out.println(info);
                   break;
               }
               else {
                   System.out.println("Not Matched");
               }
           }
       }
    }
}
