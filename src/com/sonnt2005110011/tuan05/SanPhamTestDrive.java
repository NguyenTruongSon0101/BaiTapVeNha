package com.sonnt2005110011.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPhamTestDrive {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <SanPham> list = new ArrayList<SanPham>();
    static void nhap(){
        scanner.nextLine();
        while(true){
            SanPham sanPham = new SanPham();
            System.out.print("Nhập tên sản phẩm: ");
            sanPham.tenSanPham = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            sanPham.donGia = scanner.nextDouble();
            System.out.println("Giá được giảm: ");
            sanPham.giamGia = scanner.nextDouble();
            System.out.println("Thuế nhập khẩu: ");
            sanPham.thueNhapKhau = scanner.nextDouble();
            list.add(sanPham);
            scanner.nextLine();
            System.out.print("Nhập thêm (y/n)?: ");
            if(scanner.nextLine().equals("n"))
                break;
        }
    }
    static void xuat(){
        scanner.nextLine();
        for (SanPham a : list){
            a.inThongTin();
        }
    }
    static void sapXepGiamDan(){
        
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        xuat();   
    }
    static void xoa(){
        scanner.nextLine();
        System.out.print("Nhập tên cần xoá: ");
        String name = scanner.nextLine();
        for (SanPham a : list) {
            if((a.tenSanPham).equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }    
    }
    static void tinhTrungBinh(){
        double tong = 0;
        double trungBinh = 0;
        for (SanPham x : list) {
            tong += x.donGia;
        }
        trungBinh = tong/list.size();
        System.out.println("Giá trung bình của các sản phẩm là: "+trungBinh);
    }
     
    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void main(String[] args) {
        int suLuaChon;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Nhập danh sách sản phẩm.");
            System.out.println("2. Xuất danh sách vừa nhập.");
            System.out.println("3. Sắp xếp giảm dần theo giá.");
            System.out.println("4. Tìm và xóa sản phẩm.");
            System.out.println("5. Xuất giá trung bình các sản phẩm.");
            System.out.print("Chọn chức năng: ");
            System.out.println("------------------MENU------------------");
            suLuaChon = scanner.nextInt();
            switch(suLuaChon){
                case 1:nhap();break;
                case 2:xuat();break;
                case 3:sapXepGiamDan();break;
                case 4:xoa();break;
                case 5:tinhTrungBinh();break;
                default: System.out.println("kết thúc chương trình");
            }}while(suLuaChon >= 1 && suLuaChon <= 5);
    }
}
