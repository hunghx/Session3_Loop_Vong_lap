package ra;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        System.out.println("\u001B[32mHãy nhập vào 1 số");
        while (true){
           int number = new Scanner(System.in).nextInt(); // nhạp vào 1 sô
            // kiểm tra điều kiện để dừng vòng lập
            if(number>18){
                // thỏa mãn
                System.out.println("\u001B[32mSố bạn vừa nhập là : "+number);
                break;
            }
            System.out.println("\u001B[31mKhông hợp lệ , vui lòng nhập lại");
        }
    }
}
