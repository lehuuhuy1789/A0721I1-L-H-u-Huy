package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

import java.util.Scanner;

public class ChayLopFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopFan fan1 = new LopFan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        LopFan fan2 = new LopFan();
        fan2.setSpeed(2);
        System.out.println(fan2.toString());
    }
}
