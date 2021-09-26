package com.sonnt2005110011.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Nguyễn Văn tèo";
        nhanVien.ngaySinh = "20 12 2000";
        nhanVien.boPhanLamViec = "phòng kế toán";
        nhanVien.luong = 10000000;
        nhanVien.diaChi = "Tp.Hồ Chí Minh";
        nhanVien.inThongTinNhanVien();
    }
}
