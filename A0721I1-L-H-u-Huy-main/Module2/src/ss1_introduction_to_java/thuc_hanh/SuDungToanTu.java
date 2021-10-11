package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập weight");
        float weight = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập height");
        float height = Float.parseFloat(sc.nextLine());
        float area = weight * height;
        System.out.println("Dien tich la " + area);
    }
}
