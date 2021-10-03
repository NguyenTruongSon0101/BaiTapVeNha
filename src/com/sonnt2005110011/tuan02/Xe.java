package com.sonnt2005110011.tuan02;

public class Xe {
     // thuộc tính
     String tenChuXe;
     String hangSanXuat;
     String dong;
     int giayPhep;
     String dungTichXang;
     // Phương thức
     void inThongTinXe(){
         System.out.println("Chủ xe: "+tenChuXe);
         System.out.println("Hãng sản xuất: "+hangSanXuat);
         System.out.println("Dòng: "+dong);
         System.out.println("Số giấy phép: "+giayPhep);
         System.out.println("Dung tích xăng :"+dungTichXang);
     }
}
