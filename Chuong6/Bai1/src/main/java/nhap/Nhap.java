/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap mot chuoi: ");
        String str = sc.nextLine();
        System.out.printf("nhap mot ky tu: ");
        char chr = sc.next().charAt(0);
        System.out.printf("Nhap mot so nguyen: ");
        int i = sc.nextInt();
        System.out.printf("nhap mot so thuc: ");
        float f = sc.nextFloat();
        try {
            FileWriter fw = new FileWriter("exp.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str+"\t"+chr+"\t" + i+"\t" + f);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
}
