package chuong2;

import java.util.Scanner;

public class TongMang {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Tổng của các phần tử trong mảng là: " + sum);
    }
}
