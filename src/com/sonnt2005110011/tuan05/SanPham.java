package com.sonnt2005110011.tuan05;

public class SanPham {
    String tenSanPham;
    double donGia;
    double giamGia;
    double thueNhapKhau;

    SanPham(){}

    
    SanPham(String ten,double gia,double giam,double thue){
        tenSanPham = ten;
        donGia = gia;
        giamGia = giam;
        thueNhapKhau = thue;
    }

    void inThongTin(){
        System.out.println("Tên sản phẩm: "+tenSanPham);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Giảm giá: "+giamGia);
        System.out.println("Thuế nhập khẩu: "+thueNhapKhau);
    }
}
