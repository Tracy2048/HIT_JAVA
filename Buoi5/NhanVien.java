
package Buoi5;

import java.util.Scanner;

public class NhanVien {
    private static int cnt = 0;
    private int id;
    private String hoTen;
    private String kieuNV;
    private int soNgayLam;
    private int namVaoLam;
    public NhanVien(String hoTen, String kieuNV, int soNgayLam, int namVaoLam){
        this.id = ++cnt;
        this.hoTen = hoTen;
        this.kieuNV = kieuNV;
        this.soNgayLam = soNgayLam;
        this.namVaoLam = namVaoLam;
    }
    public int getId(){
        return id;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getKieuNV(){
        return kieuNV;
    }
    public int getSoNgayLam(){
        return soNgayLam;
    }
    public int getNamVaoLam(){
        return namVaoLam;
    }
    public int luong(){
        if(getKieuNV().equals("San xuat")){
            return soNgayLam*350000;
        }else{
            return soNgayLam*400000;
        }
    }
    public int phuCap(){
        return 100000 + (2022-namVaoLam)*200000;
    }
    public int tongTien(){
        return luong()+phuCap();
    }
    public void setId(int id){
        this.id=id;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public void setKieuNV(String kieuNV){
        this.kieuNV=kieuNV;
    }
    public void setSoNgayLam(int soNgayLam){
        this.soNgayLam=soNgayLam;
    }
    public void setNamVaoLam(int namVaoLam){
        this.namVaoLam=namVaoLam;
    }
    public void display(){
        System.out.printf("%-10d %-20s %-15s %-15d %-15d %-15d %-15d %-20d \n",getId(),getHoTen(),getKieuNV(),getSoNgayLam(),getNamVaoLam(),luong(),phuCap(),tongTien());
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So nhan vien: ");
        int n = sc.nextInt();
        NhanVien[] a = new NhanVien[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Kieu nhan vien: ");
            String kieuNV = sc.nextLine();
            System.out.print("So ngay lam: ");
            int soNgayLam = sc.nextInt();
            System.out.print("Nam vao lam: ");
            int namVaoLam = sc.nextInt();
            a[i] = new NhanVien(hoTen,kieuNV,soNgayLam,namVaoLam);
        }
        System.out.printf("%-10s %-20s %-15s %-15s %-15s %-15s %-15s %-20s \n","Id","Ho ten","Kieu nhan vien","So ngay lam","Nam vao lam","Luong","Phu cap","Tong tien");
        for(int i=0;i<n;i++){
            a[i].display();
        }
    }
}
