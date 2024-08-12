/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang1chieu;

import java.util.Scanner;

public class BaiTap20 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử từ bàn phím (1 ≤ n ≤ 20)
        do {
            System.out.print("nhap cac so phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("so phan tu khong hop le!nhap lai.");
            }
        } while (n < 1 || n > 20);

        // Cấp phát bộ nhớ cho mảng
        a = new int[n];

        // Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // a. Nhập số nguyên x và kiểm tra xem x có xuất hiện trong mảng không
        System.out.print("nhap so nguyen x: ");
        int x = sc.nextInt();
        int viTri = timViTriX(a, x);
        if (viTri != -1) {
            System.out.println("So " + x + " xuat hien trong mang o vi tri dau tien: " + viTri);
        } else {
            System.out.println("So " + x + " khong xuat hien trong mang.");
        }

        // b. Kiểm tra mảng có tính chất tăng dần không
        if (kiemTraTangDan(a)) {
            System.out.println("mang co tinh chat tang dan.");
        } else {
            System.out.println("mang hong co tinh chat tang dan.");
        }
    }

    // Phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Phương thức tìm vị trí đầu tiên của số x trong mảng
    public static int timViTriX(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1; // Nếu không tìm thấy
    }

    // Phương thức kiểm tra mảng có tính chất tăng dần
    public static boolean kiemTraTangDan(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

