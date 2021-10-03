package com.sonnt2005110011.tuan04;

import java.util.Scanner;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh[] mangMayTinh = new MayTinh[2];
        Scanner nhapTTMayTinh = new Scanner(System.in);
        System.out.println("Nhập danh sách máy tính:");

        for(int i = 0; i < mangMayTinh.length; i++){
            System.out.println("Nhập máy tính thứ " + (i+1));
            System.out.println("Nhà sản xuất ");
            String nhaSanXuat = nhapTTMayTinh.nextLine();
            System.out.print("Năm sản xuất: ");
            String namSanXuat = nhapTTMayTinh.nextLine();
            System.out.print("Hệ điều hành: ");
            String heDieuHanh = nhapTTMayTinh.nextLine();
            System.out.print("Ram ");
            String rAM = nhapTTMayTinh.nextLine();
            System.out.print("CPU ");
            String cPU = nhapTTMayTinh.nextLine();
            System.out.print("Giá bán: ");
            int gia = nhapTTMayTinh.nextInt();
            nhapTTMayTinh.nextLine();
            System.out.print("Năm bảo hành: ");
            int namBaoHanh = nhapTTMayTinh.nextInt();
            nhapTTMayTinh.nextLine();
            mangMayTinh[i] = new MayTinh(nhaSanXuat,namSanXuat,heDieuHanh,rAM,cPU,gia,namBaoHanh);
        }
        System.out.println("Thông tin máy tính");
        for (MayTinh mayTinh : mangMayTinh) {
            mayTinh.inThongTinMayTinh();
        }
    }
}
