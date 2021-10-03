package com.sonnt2005110011.tuan02;

public class NhanVien {
   // thuộc tính
   String tenNhanVien;
   int luong;
   String diaChi;
   String boPhanLamViec;
   String ngaySinh;
   // Phương thức
   void inThongTinNhanVien(){
       System.out.println("Tên nhân vien: "+tenNhanVien);
       System.out.println("Lương: "+luong);
       System.out.println("Địa chỉ: "+diaChi);
       System.out.println("Bộ phận làm việc: "+boPhanLamViec);
       System.out.println("Ngày sinh: "+ngaySinh);
   }
}
