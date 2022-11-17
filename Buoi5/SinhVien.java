
package Buoi5;

import java.util.Scanner;

public class SinhVien {
    private static int cnt=0;
    private int MSV;
    private String hoTen;
    private String diaChi;
    private int sdt;
    private float diemSo;
    public SinhVien(){
        this.MSV = ++cnt;
    }
    public SinhVien(String hoTen,String diaChi,int sdt,float diemSo){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.diemSo = diemSo;
    }
    public int getMSV(){
        return MSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public int getSdt(){
        return sdt;
    }
    public void setSdt(int sdt){
        this.sdt = sdt;
    }
    public float getDiemSo(){
        return diemSo;
    }
    public void setDiemSo(float diemSo){
        this.diemSo = diemSo;
    }
    
    @Override
    public String toString(){
        return String.format("%-10d %-20s %-20s %-10d %-10f\n",MSV,hoTen,diaChi,sdt,diemSo);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.print("So dien thoai: ");
        setSdt(sc.nextInt());
        System.out.print("Diem so: ");
        setDiemSo(sc.nextFloat());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for(int i=0;i<n;i++){
            sv[i] = new SinhVien();
            sv[i].input();
        }
        System.out.println("-----MENU-----");
        System.out.println("1. Xuat danh sach theo thu tu tang dan cua diem");
        System.out.println("2. Tim kiem theo ten");
        System.out.println("3. Sap xep danh sach theo ten");
        System.out.println("4. Thoat khoi chuong trinh");
        int type = 0;
        while (type!=4) {
            System.out.print("Lua chon: ");
            type = sc.nextInt();
            switch (type) {
                case 4:
                    break;
                case 1:
                    type1(sv,n);
                    break;
                case 2:
                    type2(sv,n);
                    break;
                case 3:
                    type3(sv,n);
                    break;
            }
        }
    }
    public static void type1(SinhVien[] sv,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(sv[i].getDiemSo()>sv[j].getDiemSo()){
                    SinhVien tmp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = tmp;
                }
            }
        }
        for(SinhVien x:sv){
            System.out.print(x.toString());
        }
    }
    public static void type2(SinhVien[] sv,int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten can tim kiem: ");
        String ten = sc.nextLine();
        boolean ok = false;
        for(SinhVien x:sv){
            if(x.getHoTen().equals(ten)){
                System.out.print(x.toString());
                ok = true;
            }
        }
        if(ok==false) System.out.println("Khong tim thay ket qua");
    }
    public static void type3(SinhVien[] sv,int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sap xep theo: 1. Tang dan   2.Giam dan");
        System.out.print("Lua chon sap xep: ");
        int sx = sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(sv[i].getHoTen().compareTo(sv[j].getHoTen())>0){
                    SinhVien tmp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = tmp;
                }
            }
        }
        if(sx == 1){
            for(SinhVien x:sv){
                System.out.print(x.toString());
            }
        }else{
            for(int i=n-1;i>=0;i--){
                System.out.print(sv[i].toString());
            }
        }
    }
}
