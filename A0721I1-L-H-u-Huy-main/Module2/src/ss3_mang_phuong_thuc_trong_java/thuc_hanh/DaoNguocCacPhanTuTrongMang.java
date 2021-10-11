package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Chiều dài mảng không vượt quá 20");
            }
        } while(size > 20);

        int[] array = new int[size];

        for(int i = 0; i < array.length; ++i) {
            System.out.println("Nhập phần từ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
        }

        System.out.printf("Phần từ của mảng: ");

        int j;
        for(j = 0; j < array.length; ++j) {
            System.out.print(array[j] + " ");
        }

        for(j = 0; j < array.length / 2; ++j) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("\nMảng sau khi đảo ngược phần tử là: ");

        for(j = 0; j < array.length; ++j) {
            System.out.print(array[j] + " ");
        }
    }
}
