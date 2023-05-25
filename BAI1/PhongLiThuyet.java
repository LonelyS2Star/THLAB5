/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5.BAI1;

/**
 *
 * @author Ngoc Nhi
 */
public class PhongLiThuyet extends PhongHoc {
    boolean mayChieu;

    public PhongLiThuyet(boolean mayChieu, int maPo, String dayNha, double dienTich, int soBĐ) {
        super(maPo, dayNha, dienTich, soBĐ);
        this.mayChieu = mayChieu;
    }

   
    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
}
