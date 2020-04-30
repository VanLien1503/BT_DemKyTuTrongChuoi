package BT_DemKyTuTrongChuoi;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        // Tạo 1 Chuỗi
        String value="Toi Hoc Java";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Ký Tự Muốn Kiểm Tra");
        char input=0;
        input=scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<value.length();i++){
            if (value.charAt(i)==input){
                count++;
            }
        }
        System.out.println("Tìm Thấy Ký tự : "+ input+" Có Trong Chuỗi = "+count);
    }
}
