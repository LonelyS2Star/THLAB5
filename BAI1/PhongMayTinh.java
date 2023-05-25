/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5.BAI1;

/**
 *
 * @author Ngoc Nhi
 */
public class PhongMayTinh extends PhongHoc {
    int mayTinh;

    public PhongMayTinh(int maPo, String dayNha, double dienTich, int soBĐ) {
        super(maPo, dayNha, dienTich, soBĐ);
    }

    

    public int getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(int mayTinh) {
        this.mayTinh = mayTinh;
    }
    
    
}
