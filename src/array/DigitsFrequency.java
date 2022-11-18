package array;
// Given a number n, and a digit d, you are required to calculate the frequency of digit d in number n.


import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        int digit =scanner.nextInt();
        int frequency = getFrequency(number,digit);
        System.out.println(frequency);
    }

    public static int getFrequency(int number, int digit){
        int counter = 0;
        while(number>0){
            int temp = number % 10;
            number /= 10;

            if(temp==digit)
                counter++;
        }

        return counter;
    }
}
