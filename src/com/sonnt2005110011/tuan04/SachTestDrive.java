package com.sonnt2005110011.tuan04;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Sach[] dSSach = new Sach[2];
        Scanner nhapSach = new Scanner(System.in);
        System.out.println("Nhập danh sách Sách");
        for(int i = 0 ; i< dSSach.length; i++){
            System.out.println("nhập quyển sách thứ "+(i+1));
            System.out.print("Giá sách: ");
            String gia = nhapSach.nextLine();
            System.out.print("Nhà xuất bản: ");
            String nhaXuatBan = nhapSach.nextLine();
            System.out.print("năm xuất bản: ");
            int namXuatBan = nhapSach.nextInt();
            nhapSach.nextLine();
            System.out.println("giá bán: ");
            int giaBan = nhapSach.nextInt();
            nhapSach.nextLine();
            System.out.println("số lượng: ");
            int soLuong = nhapSach.nextInt();
            nhapSach.nextLine();
            System.out.println("Thể loại sách: ");
            String loai = nhapSach.nextLine();
            dSSach[i] = new Sach(gia, nhaXuatBan, namXuatBan, giaBan, soLuong,loai);
        }
        System.out.println("In thông tin sách");
        for (Sach sach : dSSach) {
            sach.inThongTinSach();
        }
}
}