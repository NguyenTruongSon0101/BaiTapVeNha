package com.sonnt2005110011.tuan04;

public class TaiKhoan {
  
    String chuTaiKhoan;
    String soTaiKhoan;
    int soDuTaiKhoan;

    public TaiKhoan(){}
    public TaiKhoan(String chuTK,String soTK,int soDu){
        chuTaiKhoan = chuTK;
        soTaiKhoan = soTK;
        soDuTaiKhoan = soDu;
    }
    void inThongTinTaiKhoan(){
        System.out.println("Chủ tài khoản: "+chuTaiKhoan);
        System.out.println("Số tài khoản: "+soTaiKhoan);
        System.out.println("Số dư: "+soDuTaiKhoan);
    }
}
