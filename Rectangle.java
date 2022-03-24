/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package johnt75.tranquangha;
/**
 *
 * @author home
 */
public class Rectangle {

        private double chieuDai;
        private double chieuRong;

        public Rectangle() {
        }

        public Rectangle(double chieuDai, double chieuRong) {
                this.chieuDai = chieuDai;
                this.chieuRong = chieuRong;
        }

        public double tinhChuVi(double chieuDai, double chieuRong) {
                return (chieuDai + chieuRong) * 2;
        }

        public double tinhDienTich(double chieuDai, double chieuRong) {
                return chieuDai * chieuRong;
        }

        public String toString() {
                return "Chieu dai: " + chieuDai + " - " + " Chieu rong: " + chieuRong + " - " + " Dien tich: " + tinhDienTich(chieuDai, chieuRong) + " - " + " Chu vi: " + tinhChuVi(chieuDai, chieuRong);
        }
}
