package TanjidIslam;
import java.util.Scanner;

public class Main {
    /*
    Name: Tanjid Islam
    Id: 2012020147
    Section: D
    Email: cse_2012020147@lus.ac.bd
    Date: 15/10/2021
     */

    public static void main(String[] args) {
        Info info = new Info();
        Hobby hobby = new Hobby();

        System.out.println("Student's Name: "+info.name);
        System.out.println("Student's ID: "+info.id);
        System.out.println("Hobby: "+hobby.hobbyName);

        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter Section: ");
        section = input.nextLine();

        System.out.println("Section: "+section);

    }
}
