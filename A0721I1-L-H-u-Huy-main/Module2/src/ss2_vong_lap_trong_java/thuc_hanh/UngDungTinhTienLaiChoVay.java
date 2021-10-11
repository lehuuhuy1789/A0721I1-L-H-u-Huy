package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        double soTienGui = scanner.nextDouble();
        System.out.println("Nhập tỉ lệ lãi suất/năm");
        double tiLe = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi");
        int soThang = scanner.nextInt();
        double tongLai = 0.0D;

        for(int i = 1; i <= soThang; ++i) {
            tongLai += soTienGui * (tiLe / 100.0D) / 12.0D * (double)soThang;
        }

        System.out.println("Tổng lãi là " + tongLai);
    }
}
