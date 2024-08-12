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
public class baitap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km;
        double tientra;
        Scanner sc = new Scanner(System.in);
                System.out.println("=====TINH TIEN TAXI=====");
                System.out.print("cho biết số km:");
                km = sc.nextDouble();
                if (km<=1) {
                    tientra = 15000;
                } else if(km<=5) {
                    tientra = 15000 + (km-1)*13500;
                } else 
                {
                    tientra = 15000 + 4*13500 + (km-5)*11000;
                }
                
                if(km>120)
                {
                    tientra =tientra*0.9;
                }
                System.out.println("tientra:" + tientra);
          }
    
}
