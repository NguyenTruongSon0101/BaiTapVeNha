package com.sonnt2005110011.kiemtragiuaky;

public class Apple {
    public static Apple themTao;
    String ma;
    double khoiLuong;
    String mauSac;

    Apple(){}

    
    Apple(String maTao,double khoiLuongTao,String mauSacTao){
        ma = maTao;
        khoiLuong = khoiLuongTao;
        mauSac = mauSacTao;
    }

    void inDanhSachTao(){
        System.out.println("Mã Táo: "+ma);
        System.out.println("khối lượng táo: "+khoiLuong);
        System.out.println("Màu sắc: "+mauSac);
    }
    
}
