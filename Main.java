/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 VV*/
package johnt75.tranquangha;

import java.util.Scanner;

public class Main {

        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
                while (true) {
                        System.out.println("+------------------+");
                        System.out.println("1. Bai 1");
                        System.out.println("2. Bai 2");
                        System.out.println("3. Bai 3");
                        System.out.println("0. Thoat");
                        System.out.println("+------------------+");
                        int luaChon = sc.nextInt();
                        switch (luaChon) {
                                case 1:
                                        Bai1();
                                        break;
                                case 2:
                                        Bai2();
                                        break;
                                case 3:
                                        Bai3();
                                        break;
                                case 0:
                                        System.exit(0);
                                default:
                                        System.out.println("Khong co chuc nang nay");

                        }
                }
        }

        public static void Bai3() {
                System.out.println("Nhap rollNumber: ");
                int rollNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ten: ");
                String ten = sc.nextLine();
                System.out.println("Nhap tuoi: ");
                int tuoi = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap dia chi: ");
                String diaChi = sc.nextLine();
                System.out.println("Nhap so tien luong: ");
                double tienLuong = sc.nextDouble();
                System.out.println("Nhap tong so gio lam: ");
                int tongSoGioLam = sc.nextInt();
                NhanVien nhanvien = new NhanVien(rollNumber, ten, tuoi, diaChi, tienLuong, tongSoGioLam);
                System.out.println(nhanvien.printInfo());

        }

        public static void Bai2() {
                System.out.println("Nhap chieu dai: ");
                double chieuDai = sc.nextDouble();
                System.out.println("Nhap chieu rong");
                double chieuRong = sc.nextDouble();
                Rectangle rectangle = new Rectangle(chieuDai, chieuRong);
                System.out.println(rectangle.toString());

        }

        public static void Bai1() {
                sc.nextLine();
                System.out.println("Nhap ma thu cung: ");
                String maThuCung = sc.nextLine();
                System.out.println("Nhap ten thu cung: ");
                String ten = sc.nextLine();
                System.out.println("Nhap can nang: ");
                double canNang = sc.nextDouble();
                ThuCung thucung = new ThuCung(maThuCung, ten, canNang);
                thucung.displayThuCung();
        }
}
