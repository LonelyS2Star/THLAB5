/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5.BAI1;

/**
 *
 * @author Ngoc Nhi
 */
public class PhongThiNghiem extends PhongHoc {
    String ttcn;
    int sucChua;
    boolean bonRua;
    
    public PhongThiNghiem(int maPo, String dayNha, double dienTich, int soBĐ) {
        super(maPo, dayNha, dienTich, soBĐ);
    }
    public String getTtcn() {
        return ttcn;
    }

    public void setTtcn(String ttcn) {
        this.ttcn = ttcn;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }
    
    
}

