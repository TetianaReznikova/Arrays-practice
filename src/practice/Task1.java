package practice;


public class Task1 {
    static double[] temperature;
    static int day;

    public static void main(String[] args) {
        temperature = new double[] {30.5, 32.6, 29.8, 20, 25.5, 29, 33.4, 35, 34.2, 28};

        System.out.println("Day" + " " + "Temperature");

        for (double tem : temperature){
            day++;

            System.out.printf(" %d      %.1f%n",
                    day, tem);
        }
    }
}
