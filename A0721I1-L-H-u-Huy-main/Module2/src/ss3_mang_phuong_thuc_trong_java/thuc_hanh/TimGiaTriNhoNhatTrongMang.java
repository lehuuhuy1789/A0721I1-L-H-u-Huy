package ss3_mang_phuong_thuc_trong_java.thuc_hanh;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 32, 0, -6, 76, 65};
        System.out.println("The smallest element in the array is: " + minValue(arr));
    }

    public static int minValue(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
