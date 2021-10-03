package TrenLop;

public class Mang {
    public static void main(String[] args) {
        
        Dog[] danhSachDog = new Dog[7];
        Dog dog0 = new Dog(5,"xám","kiki");
        Dog dog1 = new Dog(10,"đen","mực");
        Dog dog2 = new Dog(7,"trắng","tuyết");

        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[2].inThongTin();
    }
}
