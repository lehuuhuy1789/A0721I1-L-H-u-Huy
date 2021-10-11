package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while(size > 20);

        int[] array = new int[size];

        for(int i = 0; i < array.length; ++i) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Property list: ");

        int max;
        for(max = 0; max < array.length; ++max) {
            System.out.print(array[max] + "\t");
        }

        max = array[0];
        int index = 1;

        for(int j = 0; j < array.length; ++j) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
