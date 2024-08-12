/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautruclap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class baitap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       int s;
       Scanner sc = new Scanner(System.in);
       System.out.println("===TINH TONG DAY SO : 1+2+3+...+n===");
       System.out.print("nhap gia tri n");
       n= sc.nextInt();
       s=0;
       for (int i =1; i<=n; i++){
           s =s + i; // s+=i;
       }
       System.out.println("tong day so:" + s);
         
    }
    
}
