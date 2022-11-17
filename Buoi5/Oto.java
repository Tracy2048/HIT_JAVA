
package Buoi5;

import java.util.Scanner;

public class Oto {
    private String chuSH;
    private String tenXe;
    private String hang;
    private long gia;
    private int namMua;
    public Oto(){
    }
    public Oto(String chuSH, String tenXe, String hang, long gia, int namMua){
        this.chuSH = chuSH;
        this.tenXe = tenXe;
        this.hang = hang;
        this.gia = gia;
        this.namMua = namMua;
    }
    public String getChuSH(){
        return chuSH;
    }
    public void setChuSH(String chuSH){
        this.chuSH = chuSH;
    }
    public String getTenXe(){
        return tenXe;
    }
    public void setTenXe(String tenXe){
        this.tenXe = tenXe;
    }
    public String getHang(){
        return hang;
    }
    public void setHang(String hang){
        this.hang = hang;
    }
    public long getGia(){
        return gia;
    }
    public void setGia(long gia){
        this.gia = gia;
    }
    public int getNamMua(){
        return namMua;
    }
    public void setNamMua(int namMua){
        this.namMua = namMua;
    }
    public int namSD(){
        return 2022-namMua;
    }
    public long giaTri(){
        if(gia<1000000000){
            return gia - (gia*namSD()*7/100);
        }else if(gia<=2000000000){
            return gia - (gia*namSD()*5/100);
        }
        return gia - (gia*namSD()*3/100);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chu so huu: ");
        setChuSH(sc.nextLine());
        System.out.print("Ten xe: ");
        setTenXe(sc.nextLine());
        System.out.print("Hang: ");
        setHang(sc.nextLine());
        System.out.print("Gia: ");
        setGia(sc.nextLong());
        System.out.print("Nam mua: ");
        setNamMua(sc.nextInt());
    }
    public void display(){
        System.out.printf("%-20s %-15s %-15s %-15d %-15d %-20d\n",chuSH,tenXe,hang,gia,namSD(),giaTri());
    }
    
    // Phuong thuc sap xep theo gia tri hien tai
    public static void sort(Oto[] oto,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(oto[i].giaTri()<oto[j].giaTri()){
                    Oto tmp = oto[i];
                    oto[i] = oto[j];
                    oto[j] = tmp;
                }
            }
        }
    }
    
    // Phuong thuc in ra cac oto da het gia tri
    public static void display2(Oto[] oto,int n){
        System.out.println("\nCAC OTO DA HET GIA TRI:");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s %-20s\n","Chu so huu","Ten xe","Hang","Gia","Nam su dung","Gia tri hien tai");
        for(int i=0;i<n;i++){
            if(oto[i].giaTri()<=0){
                oto[i].display();
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So oto: ");
        int n = sc.nextInt();
        Oto[] oto = new Oto[n];
        for(int i=0;i<n;i++){
            oto[i] = new Oto();
            oto[i].input();
        }
        Oto.sort(oto,n);
        System.out.printf("%-20s %-15s %-15s %-15s %-15s %-20s\n","Chu so huu","Ten xe","Hang","Gia","Nam su dung","Gia tri hien tai");
        for(Oto x:oto){
            x.display();
        }
        Oto.display2(oto, n);
    }
}
