/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class baitap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int thang, nam;
        int kq;
        Scanner sc = new Scanner(System.in);
        System.out.println("===chuong trinh tinh so ngay cua thang trong nam===");
        System.out.print("cho biet thang");
        thang = sc.nextInt();
            System.out.print("cho biet thang");
        nam = sc.nextInt();
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
             kq = 31;
                break;
            case 2:
                if (nam%4==0) {
                    kq = 29;
                } else {
                    kq = 28;
                }
                break;
            default:
                throw new AssertionError();
        }
          System.out.print("so ngay ca");
         }
    
}
