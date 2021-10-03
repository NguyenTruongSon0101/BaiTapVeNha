package com.sonnt2005110011.tuan04;

import java.util.Scanner;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien[] dSNhanVien = new NhanVien[2];
        Scanner nhapNhanVien = new Scanner(System.in);
        System.out.println("Nhập danh sách nhân viên");
        for(int i = 0 ; i< dSNhanVien.length; i++){
            System.out.println("nhập nhân vien thứ "+(i+1));
            System.out.print("Tên nhân viên: ");
            String tenNhanVien = nhapNhanVien.nextLine();
            System.out.print("Lương: ");
            int luong = nhapNhanVien.nextInt();
            nhapNhanVien.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = nhapNhanVien.nextLine();
            System.out.println("Bộ phận làm việc: ");
            String boPhanLamViec = nhapNhanVien.nextLine();
            System.out.println("Ngày sinh: ");
            String ngaySinh = nhapNhanVien.nextLine();
            dSNhanVien[i] = new NhanVien(tenNhanVien,luong,diaChi,boPhanLamViec,ngaySinh);
        }
        System.out.println("In thông tin nhân viên");
        for (NhanVien nhanVien : dSNhanVien) {
            nhanVien.inThongTinNhanVien();
        }
    }
}
