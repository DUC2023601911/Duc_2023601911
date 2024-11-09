package chuong2;

import java.util.Scanner;

public class TienDien {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập vào tổng thu nhập của gia đình: ");
    double tongThuNhap = scanner.nextDouble();

    double thue = 0;
    if (tongThuNhap <= 5000000) {
        thue = tongThuNhap * 0.05;
    } else if (tongThuNhap <= 10000000) {
        thue = tongThuNhap * 0.1;
    } else if (tongThuNhap <= 18000000) {
        thue = tongThuNhap * 0.15;
    } else {
        thue = tongThuNhap * 0.2;
    }

    System.out.println("Thuế thu nhập phải đóng là: " + thue);
}

}
