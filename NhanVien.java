package johnt75.tranquangha;

import java.util.Scanner;

public class NhanVien {
        public NhanVien() {
        }
        public NhanVien(int rollNumber, String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
                this.rollNumber = rollNumber;
                this.ten = ten;
                this.tuoi = tuoi;
                this.diaChi = diaChi;
                this.tienLuong = tienLuong;
                this.tongSoGioLam = tongSoGioLam;
        }
        private int rollNumber;
        private String ten;
        private int tuoi;
        private String diaChi;
        private double tienLuong;
        private int tongSoGioLam;

        public double tinhLuong(int tongSoGioLam, double tienLuong) {
                if (tongSoGioLam >= 200) {
                        return tienLuong = tienLuong + (tienLuong * 0.2);
                }
                if (tongSoGioLam < 200 && tongSoGioLam >= 100) {
                        return tienLuong = tienLuong + (tienLuong * 0.1);
                }
                if (tongSoGioLam < 100) {
                        return tienLuong += 0;
                }
                return tienLuong;
        }
        public String printInfo() {
                return rollNumber + " - " + ten + " - " + tuoi + " - " + diaChi + " - " + tienLuong + " - " + tongSoGioLam + "\n" + "Tinh luong cua nhan vien duoc thuong them la: " + tinhLuong(tongSoGioLam, tienLuong) + " VND";
        }
}
