
package Buoi3;

import java.util.Scanner;

public class Bai4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean ok = false;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(sieuNguyenTo(a[i])){
                System.out.print(a[i]+" ");
                ok=true;
            }
        }
        if(ok==false) System.out.println("NO");
    }
    
    public static boolean soNguyenTo(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static boolean sieuNguyenTo(int n){
        if(soNguyenTo(n)==false) return false;
        while(n!=0){
            int x = n%10;
            n/=10;
            if(soNguyenTo(x)==false) return false;
        }
        return true;
    }
}
