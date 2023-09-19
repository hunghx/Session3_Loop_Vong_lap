package ra;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        // nhạp đến khi nhập 'O' thì dừng và  in ra toàn bộ kí tự vừa nhập
        String rs = "";

        do {
            System.out.println("\u001B[32mNhập vào 1 kí tự");
            String character = new Scanner(System.in).nextLine();
            if(character.length()==1){
                // nếu là kí tự thì kiểm tra xem có phâir kí tự 'O'
                rs+=character;
                if(character.equals("O")){
                    System.out.println("\u001B[32mChuỗi các kí tự bạn vừa nhập là : "+rs );
                    break;
                }
            }else {
                System.out.println("\u001B[31mKhông phải kí tự, vui lòng nhập lại");
            }
        }while (true);
         }
}
