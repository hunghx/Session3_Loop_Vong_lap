package ra;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        // ý 1 : nhập vào 1 chuỗi 12-20
        System.out.println("\u001B[32mHãy nhập vào 1 chuỗi");
        while (true){
            String string = new Scanner(System.in).nextLine(); // nhạp vào 1 chuỗi
            // kiểm tra điều kiện để dừng vòng lập
            if(string.length()>=12 && string.length()<=20){
                // thỏa mãn
                System.out.println("\u001B[32mChuỗi bạn vừa nhập là : "+string +" có "+string.length() + " kí tự");
                break;
            }
            System.out.println("\u001B[31mKhông hợp lệ , vui lòng nhập lại");
        }
    }
}
