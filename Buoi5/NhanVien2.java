
package Buoi5;

import java.util.Scanner;

public class NhanVien2 {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private int hoursWorked;
    private int hourlyRate;
    public NhanVien2(){
        
    }
    public NhanVien2(String hoTen,int tuoi,String gioiTinh,String diaChi,int hoursWorked,int hourlyRate){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public String getGioiTinh(){
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh){
        this.gioiTinh = gioiTinh;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public float getSalary(){
        float time = getHoursWorked();
        if(time>45){
            time = 45+(time-45)*3/2;
        }
        return hoursWorked*time;
    }
    public float getTax(){
        if(getSalary()>300){
            return getSalary()/5;
        }
        return 0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.print("So gio lam viec: ");
        setHoursWorked(sc.nextInt());
        System.out.print("So tien tra cho 1h: ");
        setHourlyRate(sc.nextInt());
    }
    public void display(){
        System.out.printf("%-20s %-10d %-15s %-20s %-20d %-20d %-20f %-20f\n",hoTen,tuoi,gioiTinh,diaChi,hoursWorked,hourlyRate,getSalary(),getTax());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NhanVien2[] nv = new NhanVien2[100];
        int cnt=0;
        System.out.println("-----MENU-----");
        System.out.println("1. Them moi nhan vien");
        System.out.println("2. Hien thi danh sach cac nhan vien");
        System.out.println("3. Hien thi top 3 nhan vien lam viec cham chi nhat");
        System.out.println("4. Tim kiem theo ho ten");
        System.out.println("5. Thoat khoi chuong trinh");
        int type=0;
        while (type!=5) {
            System.out.print("Lua chon: ");
            type=sc.nextInt();
            switch (type) {
                case 1:{
                    nv[cnt] = new NhanVien2();
                    nv[cnt].input();
                    cnt++;
                    break;
                }
                case 2:{
                    System.out.printf("%-20s %-10s %-15s %-20s %-20s %-20s %-20s %-20s\n","Ho ten","Tuoi","Gioi tinh","Dia chi","So gio lam viec","So tien tra cho 1h","Luong","Thue");
                    for(int i=0;i<cnt;i++){
                        nv[i].display();
                    }   
                    break;
                } 
                case 3:
                    type3(nv,cnt);
                    break;
                case 4:
                    type4(nv,cnt);
                    break;
                case 5:
                    break;
            }
        }
    }
    public static void type3(NhanVien2[] nv,int cnt){
        for(int i=0;i<cnt-1;i++){
            for(int j=i+1;j<cnt;j++){
                if(nv[i].getHoursWorked()<nv[j].getHoursWorked()){
                    NhanVien2 tmp = nv[i];
                    nv[i] = nv[j];
                    nv[j] = tmp;
                }
            }
        }
        System.out.printf("%-20s %-10s %-15s %-20s %-20s %-20s %-20s %-20s\n","Ho ten","Tuoi","Gioi tinh","Dia chi","So gio lam viec","So tien tra cho 1h","Luong","Thue");
        for(int i=0;i<Math.max(cnt, 3);i++){
            nv[i].display();
        }
    }
    public static void type4(NhanVien2[] nv,int cnt){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten can tim kiem: ");
        String name = sc.nextLine();
        boolean ok=true;
        System.out.printf("%-20s %-10s %-15s %-20s %-20s %-20s %-20s %-20s\n","Ho ten","Tuoi","Gioi tinh","Dia chi","So gio lam viec","So tien tra cho 1h","Luong","Thue");
        for(int i=0;i<cnt;i++){
            if(nv[i].getHoTen().equals(name)){
                nv[i].display();
                ok=false;
            }
        }
        if(ok) System.out.println("Khong tim thay ket qua");
    }
}
