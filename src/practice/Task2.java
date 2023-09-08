package practice;
import java.util.Scanner;
public class Task2 {
    static String[] group1;
    static String[] group2;
    static String[] workingDay;
    static int day;

    public static void main(String[] args) {
        group1 = new String[] {"John", "Mark", "Maggie"};
        group2 = new String[] {"Alice" ,"Stive", "Michael"};
        workingDay = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
Scanner sc = new Scanner(System.in);
        System.out.println("Please input working day: ");
String weekDay = sc.nextLine();

        switch (weekDay.trim()){
            case "Mon": case "Wed": case "Fri":
                System.out.printf("You can contact to our managers:%n%s%n%s%n%s",
                        group1[0],group1[1],group1[2]);
                break;
            case "Tue": case "Thu": case"Sat":
                System.out.printf("You can contact to our managers:%n%s%n%s%n%s",
                        group2[0],group2[1],group2[2]);
                break;
            default:
                System.out.println("It's a non-working day");
        }

    }
}
