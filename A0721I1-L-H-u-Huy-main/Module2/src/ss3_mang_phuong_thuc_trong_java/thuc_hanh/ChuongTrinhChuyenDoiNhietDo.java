package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            input = scanner.nextInt();
            switch(input) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Input Fahrenheit");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input celsius");
                    double celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
            }
        } while(input != 0);

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = 0.5555555555555556D * (fahrenheit - 32.0D);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = 1.8D * celsius + 32.0D;
        return fahrenheit;
    }
}
