package chuong2;

import java.util.Scanner;

public class DiemSinhVie {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số sinh viên: ");
        int n = scanner.nextInt();
        int[] diem = new int[n];

        System.out.println("Nhập điểm của từng sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Điểm sinh viên " + (i + 1) + ": ");
            diem[i] = scanner.nextInt();
        }

        System.out.println("Điểm của các sinh viên vừa nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.print(diem[i] + " ");
        }
    }
}
