package chuong2;

import java.util.Scanner;

public class TongGiay {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập vào số giờ: ");
	        int hours = scanner.nextInt();

	        System.out.print("Nhập vào số phút: ");
	        int minutes = scanner.nextInt();

	        System.out.print("Nhập vào số giây: ");
	        int seconds = scanner.nextInt();

	        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

	        System.out.println("Tổng số giây là: " + totalSeconds);
	    }
	}

