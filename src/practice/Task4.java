package practice;
import java.util.Scanner;
public class Task4 {
    static String[] fruit;

    public static void main(String[] args) {
        fruit = new String[]{"Oranges", "Apples", "Bananas", "Pears", "Pineapples", "Limes"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your question\n");
        System.out.print("Have you bought some: ");
        String boughtFruit = sc.nextLine();
        for (String fr : fruit) {
            if (fr.equals(boughtFruit))
                System.out.printf("Yes, I have. I've bought some %s",
                        fr);

        }
        sc.close();
    }
}
