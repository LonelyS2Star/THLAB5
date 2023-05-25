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
public class List {
     private ArrayList<PhongHoc> pohoc = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
public void displayMenu() {
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm phòng học mới");
            System.out.println("2. Tìm kiếm phòng học theo mã");
            System.out.println("3. In toàn bộ danh sách");
            System.out.println("4. In danh sách phòng đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách tăng dần theo cột dãy nhà");
            System.out.println("6. Sắp xếp danh sách giảm dần theo cột diện tích");
            System.out.println("7. Sắp xếp danh sách tăng dần theo cột số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy");
            System.out.println("9. Xóa phòng học theo mã");
            System.out.println("10.In danh sách phòng máy có 60 máy");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng
            switch (choice) {
            case 1:
            
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
            System.out.println();
        } while (choice != 0);
    }

}
 private void displayPhongHoc() {
        System.out.println("===== DANH SÁCH PHÒNG HỌC =====");
        for (PhongHoc phonghoc : pohoc) {
            System.out.println(pohoc);
        }
    }

   