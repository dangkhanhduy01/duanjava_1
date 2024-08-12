/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang1chieu;



import java.util.Scanner;

public class BaiTap17 {

    public static void main(String[] args) {
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử từ bàn phím (1 ≤ n ≤ 20)
        do {
            System.out.print("nhap so phan tu cua mang (1 <= n <= 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("nhap so phan tu cua mang");
            }
        } while (n < 1 || n > 20);

        // Cấp phát bộ nhớ cho mảng
        a = new double[n];

        // a. Nhập giá trị cho mảng từ bàn phím
        nhapMang(a, sc);

        // b. Xuất mảng ra màn hình
        System.out.println("=== Mang da nhap ===");
        xuatMang(a);

        // c. Tính trung bình giá trị của mảng
        double trungBinh = tinhTrungBinh(a);
        System.out.println("gia tri chung binh cua mang: " + trungBinh);

        // d. Tìm phần tử có giá trị nhỏ nhất trong mảng
        double min = timMin(a);
        System.out.println("phan tu co gia tri nho nhat mang: " + min);
    }

    // Định nghĩa phương thức nhập mảng
    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    // Định nghĩa phương thức xuất mảng
    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Định nghĩa phương thức tính trung bình giá trị của mảng
    public static double tinhTrungBinh(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }

    // Định nghĩa phương thức tìm phần tử có giá trị nhỏ nhất trong mảng
    public static double timMin(double[] a) {
        double min = a[0];
        for (double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
