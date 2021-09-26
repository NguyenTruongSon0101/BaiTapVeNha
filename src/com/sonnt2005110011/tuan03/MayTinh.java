package com.sonnt2005110011.tuan03;

public class MayTinh {
    // thuộc tính
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String rAM;
    String cPU;
    int gia;
    int namBaoHanh;

    // Phương thức
    void inThongTinMayTinh(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("Ram: "+rAM);
        System.out.println("CPU: "+cPU);
        System.out.println("Giá bán: "+gia);
        System.out.println("Năm bảo hành: "+namBaoHanh);
    }
}
