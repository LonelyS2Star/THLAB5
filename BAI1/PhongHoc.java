/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB5.BAI1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Ngoc Nhi
 */

public class PhongHoc {
    int maPo;
    String dayNha;
    double dienTich;
    int soBĐ;

    public PhongHoc(int maPo, String dayNha, double dienTich, int soBĐ) {
        this.maPo = maPo;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBĐ = soBĐ;
    }

    public int getMaPo() {
        return maPo;
    }

    public void setMaPo(int maPo) {
        this.maPo = maPo;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBĐ() {
        return soBĐ;
    }

    public void setSoBĐ(int soBĐ) {
        this.soBĐ = soBĐ;
    }

    @Override
    public String toString() {
        return "Mã phòng :" + maPo + ", dãy nhà :" + dayNha + ", diện tích :" + dienTich + ", số bóng đèn :" + soBĐ;
    }
    
}
