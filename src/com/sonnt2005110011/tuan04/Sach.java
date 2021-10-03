package com.sonnt2005110011.tuan04;

public class Sach {
    // thuộc tính
    String gia;
    String nhaXuatBan;
    int namXuatBan;
    int giaBan;
    int soLuong;
    String loai;

    public Sach(){}
    public Sach(String giaSach,String nhaXB,int namXB,int giaBanSach, int sLuong, String theLoai){
        gia = giaSach;
        nhaXuatBan = nhaXB;
        namXuatBan = namXB;
        giaBan = giaBanSach;
        soLuong = sLuong;
        loai = theLoai;
    }
    // Phương thức
    void inThongTinSach(){
        System.out.println("sách nằm ở giá: "+gia);
        System.out.println("nhà xuất bản: "+nhaXuatBan);
        System.out.println("năm xuất bản: "+namXuatBan);
        System.out.println("giá bán: "+giaBan);
        System.out.println("số lượng: "+soLuong);
        System.out.println("thể loại: "+loai);
    }
}
