package com.sonnt2005110011.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh;
        mayTinh = new MayTinh();
        mayTinh.nhaSanXuat = "intel";
        mayTinh.namSanXuat = "2000";
        mayTinh.gia = 200000000;
        mayTinh.cPU = "core I5";
        mayTinh.rAM = "12GB";
        mayTinh.heDieuHanh = "Windows";
        mayTinh.namBaoHanh = 1;
        mayTinh.inThongTinMayTinh();
    }
}
