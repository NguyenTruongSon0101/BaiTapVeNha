package com.sonnt2005110011.tuan04;

public class MayTinh {
        // thuộc tính
        String nhaSanXuat;
        String namSanXuat;
        String heDieuHanh;
        String rAM;
        String cPU;
        int gia;
        int namBaoHanh;
    
        public MayTinh(){}

        public MayTinh(String nhaSX, String namSX, String hDH, String rAM1, String cPU1, int giaBan, int soNamBH){
        nhaSanXuat = nhaSX;
        namSanXuat = namSX;
        heDieuHanh = hDH;
        rAM = rAM1;
        cPU = cPU1;
        gia = giaBan;
        namBaoHanh = soNamBH;
    }
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
