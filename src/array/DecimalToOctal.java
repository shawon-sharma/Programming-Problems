package array;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        int base = scanner.nextInt();

        convertToAnyBase(number,base);

    }
    public static void convertToAnyBase(int number, int base){
        int power = 1;
        int converted_value=0;

        while(number>0){
            int digit= number%8;
            System.out.print("reminder: "+converted_value);
            number /=8;
            converted_value += digit * power;
            System.out.println("  after multiplication: "+converted_value);
            power=power*10;
        }
        System.out.println(converted_value);
    }
}
