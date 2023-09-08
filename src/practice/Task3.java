package practice;

public class Task3 {
    static int[] ticketNumber;


    public static void main(String[] args) {
        ticketNumber = new int[]{2432, 4851, 6455, 1234, 3453};
        System.out.print("The winners are owners of tickets with numbers:\n");
        int count = 0;
        for (int num: ticketNumber){
            if(num % 2 == 0) {
            count++;

                System.out.printf("%d) %d%n",
                        count, num);
            }
        }

    }
}
