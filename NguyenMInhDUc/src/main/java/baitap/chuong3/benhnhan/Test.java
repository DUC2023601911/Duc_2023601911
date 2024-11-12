/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benhnhan;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        BenhNhan benhnhan = new BenhNhan();
        System.out.println("nhap thong tin ");
        benhnhan.nhap();
        
        System.out.println("thong tin benh nhan: " + benhnhan.toString());
    }
}
