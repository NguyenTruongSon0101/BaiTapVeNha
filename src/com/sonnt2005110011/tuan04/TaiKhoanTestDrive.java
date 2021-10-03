package com.sonnt2005110011.tuan04;

import java.util.Scanner;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan[] dSTaiKhoan = new TaiKhoan[2];
        Scanner nhapTaiKhoan = new Scanner(System.in);
        System.out.println("Nhập danh sách tài khoản");
        for(int i = 0 ; i< dSTaiKhoan.length; i++){
            System.out.println("nhập tài khoản thứ "+(i+1));
            System.out.print("Chủ tài khoản: ");
            String chuTaiKhoan = nhapTaiKhoan.nextLine();
            System.out.print("Số tài khoản: ");
            String soTaiKhoan = nhapTaiKhoan.nextLine();
            System.out.print("số dư tài khoản: ");
            int soDuTaiKhoan = nhapTaiKhoan.nextInt();
            nhapTaiKhoan.nextLine();
            dSTaiKhoan[i] = new TaiKhoan(chuTaiKhoan,soTaiKhoan,soDuTaiKhoan);
            
        }
        System.out.println("In thông tin tài khoản");
        for (TaiKhoan taiKhoan : dSTaiKhoan) {
            taiKhoan.inThongTinTaiKhoan();
        }
    }
}
