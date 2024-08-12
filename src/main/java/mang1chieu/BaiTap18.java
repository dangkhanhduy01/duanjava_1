/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang1chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap18 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử từ bàn phím (1 ≤ n ≤ 50)
        do {
            System.out.print("nhap so phan tu cua mang (1 <= n <= 50): ");
            n = sc.nextInt();
            if (n < 1 || n > 50) {
                System.out.println("so phan tu khong hop le! vui long nhap lai.");
            }
        } while (n < 1 || n > 50);

        // Cấp phát bộ nhớ cho mảng
        a = new int[n];

        // a. Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // b. Xuất mảng ra màn hình
        System.out.println("=== mang da nhap ===");
        xuatMang(a);

        // c. Liệt kê các phần tử không phải số nguyên tố
        System.out.println("=== cac phan tu khong phai so nguyen to===");
        lietKeKhongPhaiSoNguyenTo(a);

        // d. Tính giá trị trung bình của các phần tử là số nguyên tố
        double trungBinhNguyenTo = tinhTrungBinhSoNguyenTo(a);
        if (trungBinhNguyenTo == -1) {
            System.out.println("khong co so nguyen tu nso trong mang.");
        } else {
            System.out.println("gia tri trung binh cua cac nguyen la cac nguyen to: " + trungBinhNguyenTo);
        }
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Định nghĩa phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Định nghĩa phương thức liệt kê các phần tử không phải số nguyên tố
    public static void lietKeKhongPhaiSoNguyenTo(int[] a) {
        for (int x : a) {
            if (!isPrime(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    // Định nghĩa phương thức tính giá trị trung bình của các phần tử là số nguyên tố
    public static double tinhTrungBinhSoNguyenTo(int[] a) {
        int sum = 0;
        int count = 0;
        for (int x : a) {
            if (isPrime(x)) {
                sum += x;
                count++;
            }
        }
        return (count > 0) ? (double) sum / count : -1;
    }
}