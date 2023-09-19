public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        if (bmi< 18.0){
//            // gầy
//        } else if (bmi < 22.) {
//            // trung bình
//        }else {
//            // béo
//        }

        // Vòng lặp
        // các loại vòng lặp chính
        // for i
//        for (int i = 0; i < 10; i++){
//            // Khối lệnh thực thi
//            System.out.println(i);
//        }

//        int n = 1;
//
//        // while
//        while (n!=1){
//            // thực thi nếu điều kiện đúng
//            System.out.println(n);
//            n++;
//        }
//
//        // do while
//        do{
//            System.out.println(n);
//        }while (n!=1);
        int loop = 0;
        while (true){
            System.out.println(loop);
            if(loop==10){
                break;
            }
            loop++;
        }

        for (int i = 0; i < 100; i++) {
            if(i==5) {
                System.out.println("VÒng lặp thứ" +(i+1));
                continue;
            }
                System.out.println(i);
        }

        //bài 1. sử dụng cấu trúc lặp để nhập vào dữ liệu với điều kiện sau  : -
        // nhập vào 1 chuỗi đến khi thỏa mãn đủ 12 đến 20 kí tự  (.length)

        // nhập vào 1 số > 18 thì mới dừng nhập

        // nhập vào 1 kí tự đến khi nhập kí tự O (o hoa)
        // thì dừng và in ra những kí tự vừa nhập

        // Bài 2. tạo  menu như sau :
        /*    ================= Menu ===================
              1. Tính tích của 2 số.
              2. Tính giai thừa của 1 số.
              3. Khai căn và làm tròn tới 3 chữ số sau dấu phẩy.
              4. Đếm số ước của 1 số nguyên dương nhập vào.
              5. Thoát.
        */
        // sử dụng cấu trúc lặp và điều kiện để tạo menu với các chức năng trên

    }
}