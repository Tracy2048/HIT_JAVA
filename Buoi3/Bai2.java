
package Buoi3;

import java.util.Scanner;

public class Bai2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean ok=true;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            a[i]++;
            while(a[i]!=a[i+1]){
                ok=false;
                System.out.print(a[i]+" ");
                a[i]++;
            }
        }
        if(ok){
            System.out.println("YES");
        }
    }
    
}
