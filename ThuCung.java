/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package johnt75.tranquangha;

/**
 *
 * @author home
 */
public class ThuCung {
        private String maThuCung;
        private String ten;
        private double canNang;
        public ThuCung() {
        }
        public ThuCung(String maThuCung, String ten, double canNang) {
                this.maThuCung = maThuCung;
                this.ten = ten;
                this.canNang = canNang;
        }
        public void displayThuCung() {
                System.out.println(maThuCung + " - " + ten + " - " + canNang);
        }
}
