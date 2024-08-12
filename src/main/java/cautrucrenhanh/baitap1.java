/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;


public class baitap1 {
    public static void main(String[] args) {
       double a,b;
       String kq="";
       Scanner sc = new Scanner(System.in);
               System.out.println("===GIAI PHUONG TRINH BAC 1: ax+b=0=");
              System.out.print("nhap so a:");
              a=sc.nextDouble();
              System.out.print("nhap so b:"); 
       b=sc.nextDouble();
       if(a==0)
       {
           if(b==0){
               kq="phuong trinh VSN";
           }
           else{
               kq="phuong trinh vo nghiem";
           }
       }else
       {
           kq="phuong trinh co nghiemx=" + (-b/a);
       }
       System.out.println(kq);
    }
    
}
