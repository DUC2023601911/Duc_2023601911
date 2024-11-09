package chuong2;

import java.util.Scanner;

public class PhieuGiamGia {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào giá bán: ");
        double giaBan = scanner.nextDouble();
        System.out.print("Nhập vào phần trăm giảm giá: ");
        double phanTramGiam = scanner.nextDouble();

        double giaSauGiam = giaBan - (giaBan * phanTramGiam / 100);
        System.out.println("Giá sau khi giảm là: " + giaSauGiam);
    }
}
