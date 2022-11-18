package array;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        convertToDecimal(number,base);

    }
    public static void convertToDecimal(int number, int base){
        int power = 1;
        int converted_value = 0;
        while(number > 0){
            int digit = number % 10;
            number /= 10;
            converted_value += digit*power;
            power *= base;
        }
        System.out.println(converted_value);
    }
}
