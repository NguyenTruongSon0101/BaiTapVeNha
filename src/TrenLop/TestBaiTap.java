package TrenLop;

import java.util.Arrays;
import java.util.Scanner;

public class TestBaiTap {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        //lab1bai1
        /*System.out.println("Nhập vào họ tên SV: ");
        String hoTen = bienNhap.nextLine();
        System.out.println("Nhập vào điểm trung bình: ");
        double dTB = bienNhap.nextDouble();
        System.out.printf("%s %.2f",hoTen,dTB);*/

        //lab1bai2
        /*System.out.println("Nhập vào chiều dài: ");
        int chieuDai = bienNhap.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = bienNhap.nextInt();
        int chuVi = (chieuDai + chieuRong)*2;
        int dienTich = chieuDai * chieuRong;
        System.out.printf("Chu vi hình chữ nhật : %d",chuVi);
        System.out.printf("\nDien tich hình chữ nhật: %d",dienTich);
        int canhNhoNhat = Math.min(chieuDai, chieuRong);
        System.out.printf("\ncạnh nhỏ nhất: %d",canhNhoNhat);*/

        //lab1bai3
        /*System.out.println("Nhập vào cạnh của khối lập phương:");
        int canh = bienNhap.nextInt();
        double theTichLP = Math.pow(canh, 3);
        System.out.printf("thể tich khối lập phương: %.2f",theTichLP);*/

        //lab2bai1
        /*System.out.println("nhập vào số a: ");
        int soA = bienNhap.nextInt();
        System.out.println("Nhập vào số b: ");
        int soB = bienNhap.nextInt();
        double nghiem = (double)-soB/soA;
        if(soA == 0){
            if(soB == 0){
                System.out.println("Phương trình vô số nghiệm");
            }else 
                System.out.println("Phương trình vô nghiệm");
        }else
            System.out.printf("Phương trình có nghiệm x = %.2f",nghiem);*/
        
        //lab2bai2

        //kiem tra so nguyen to
        /*System.out.println("Nhập vào 1 số nguyên: ");
        int soNguyen = bienNhap.nextInt();
        boolean kiemTra = true;
        for(int i = 2; i < soNguyen; i++){
            if(soNguyen % i == 0){
                kiemTra = false;
            }
        }
        if(kiemTra == true){
            System.out.println("số đã nhập là số nguyên tố");

        }else
            System.out.println("số đã nhập không phải số nguyên tố");*/

        //mảng

        //nhập mảng
        int[] mangSoNguyen = new int[5];
        for(int i = 0; i<mangSoNguyen.length;i++){
            System.out.println("Nhập vào phần tử thứ:"+(i+1));
            mangSoNguyen[i] = bienNhap.nextInt();
        }

        //xuất mảng đã sắp xếp
        Arrays.sort(mangSoNguyen);
        System.out.println("\nmảng vừa nhập");
        for (int i : mangSoNguyen) {
            System.out.println(i);
        }
        
        //xuất số nhỏ nhất ra màn hình
        int min = mangSoNguyen[0];
        for(int i = 0; i < mangSoNguyen.length ; i++){
            min = Math.min(min,mangSoNguyen[i]);
        }
        System.out.printf("số nhỏ nhất là %d",min);

        //trung bình cộng các số chia hết cho 3
        int tong = 0;
        int dem = 0;
        for(int i = 0 ; i < mangSoNguyen.length; i++){
            if(mangSoNguyen[i] % 3 == 0){
                tong = tong + mangSoNguyen[i];
                dem = dem + 1;
            }
        }
        double ketQua = (double)tong/dem;
        System.out.printf("\ntrung bình cộng các số chia hết cho 3 : %f",ketQua);  
    }
}
