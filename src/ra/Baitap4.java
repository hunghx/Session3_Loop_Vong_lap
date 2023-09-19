package ra;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        // Bài 2. tạo  menu như sau :
        /*    ================= Menu ===================
              1. Tính tích của 2 số.
              2. Tính giai thừa của 1 số.
              3. Khai căn và làm tròn tới 3 chữ số sau dấu phẩy.
              4. Đếm số ước của 1 số nguyên dương nhập vào.
              5. Thoát.
        */
        Scanner sc = new Scanner(System.in);
        byte n ;
        do {
            // hiển thị menu
            System.out.println(" ================= Menu ===================\n" +
                    "              1. Tính tích của 2 số.\n" +
                    "              2. Tính giai thừa của 1 số.\n" +
                    "              3. Khai căn và làm tròn tới 3 chữ số sau dấu phẩy.\n" +
                    "              4. Đếm số ước của 1 số nguyên dương nhập vào.\n" +
                    "              5. Thoát.");
            System.out.println("Nhập vào lựa chọn của bạn");
            n = sc.nextByte();
            switch (n){
                case 1:
                    // tính tích
                    System.out.println("Nhập vào số a = ");
                    double a = sc.nextDouble();
                    System.out.println("Nhập vào số b = ");
                    double b = sc.nextDouble();
                    System.out.printf("Tích của 2 số %.2f và %.2f = %.2f \n",a,b,a*b);
                    break;
                case 2:
                    // tính giai thừa
                    System.out.println("Nhập vào số n = ");
                    int number = sc.nextInt();
                    if(number < 0){
                        System.out.println("Số âm không tinh được giai thừa");
                    }else {
                        int multi = 1;
                        for (int i = 2; i <= number ; i++) {
                            multi *= i;
                        }
                        System.out.println("Giai thừa của "+number+" = "+multi);
                    }
                    break;
                case 3:
//                    khai căn
                    System.out.println("Nhập vào số n = ");
                    double d = sc.nextDouble();
                    if(d < 0){
                        System.out.println("Số âm không tinh được căn bậc 2");
                    }else {
                        double can = Math.sqrt(d);
                        System.out.printf("Căn bậc 2 của %.3f = %.3f\n",d,can);
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào số nguyên dương n = ");
                    int duong = sc.nextInt();
                    if(duong < 0){
                        System.out.println("Số âm");
                    }else {
                        int count = 0;
                        for (int i = 1; i <= duong ; i++) {
                            if(duong%i==0){
                                count++;
                            }
                        }
                        System.out.printf("Số %d có %d ước\n",duong,count);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ, vui lòng nhập lại");
            }
        }while (n!=5);


    }
}
