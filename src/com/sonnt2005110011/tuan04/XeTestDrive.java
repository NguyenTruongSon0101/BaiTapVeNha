package com.sonnt2005110011.tuan04;

import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe[] dSXe = new Xe[2];
        Scanner nhapXe = new Scanner(System.in);
        System.out.println("Nhập danh sách Xe");
        for(int i = 0 ; i< dSXe.length; i++){
            System.out.println("nhập xe thứ "+(i+1));
            System.out.print("Tên chủ xe: ");
            String tenChuXe = nhapXe.nextLine();
            System.out.print("Hãng sản xuất: ");
            String hangSanXuat = nhapXe.nextLine();
            System.out.print("Dòng xe: ");
            String dong = nhapXe.nextLine();
            System.out.println("Số giấy phép: ");
            int giayPhep = nhapXe.nextInt();
            nhapXe.nextLine();
            System.out.println("Dung tích xăng: ");
            String dungTichXang = nhapXe.nextLine();
            dSXe[i] = new Xe(tenChuXe,hangSanXuat,dong,giayPhep,dungTichXang);
            
        }
        System.out.println("In thông tin Xe");
        for (Xe xe : dSXe) {
            xe.inThongTinXe();
        }
    }
}
