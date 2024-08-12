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
public class baitap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 double toan,van,anh;
 double dtb;
 String kq="";
    Scanner sc = new Scanner(System.in);
    System.out.println("===XEP LAOIJ HOC LUC");
      System.out.println("===GIAI PHUONG TRINH BAC 1: ax+b=0=");
              System.out.print("nhap diem toan:");
              toan=sc.nextDouble();
              System.out.print("nhap diem van:");
              van=sc.nextDouble();
              System.out.print("nhap diem anh:");
              anh=sc.nextDouble();
              
              dtb=(toan+van+anh)/3;
              
              if (dtb<4){
                  kq="yeu";
              } else if (dtb<6.5) {
                  kq="kha";
              }else
              {
                  kq="gioi";
              }
              System.out.println("DTB:" +- dtb + " - xep loai:" + kq);
    }
    
}
