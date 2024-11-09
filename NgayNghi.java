package chuong2;

import java.util.Scanner;

public class NgayNghi {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập vào số ngày nghỉ: ");
	        int soNgayNghi = scanner.nextInt();

	        int donGia;
	        if (soNgayNghi == 1) {
	            donGia = 1484;
	        } else if (soNgayNghi >= 2 && soNgayNghi <= 4) {
	            donGia = (int) (1484 * 0.8);
	        } else if (soNgayNghi >= 5 && soNgayNghi <= 10) {
	            donGia = (int) (1484 * 0.6);
	        } else {
	            donGia = (int) (1484 * 0.4);
	        }

	        System.out.println("Đơn giá phòng là: " + donGia);
	    }
}
