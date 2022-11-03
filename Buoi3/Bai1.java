
package Buoi3;

import java.util.Scanner;

public class Bai1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[100];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for(int i=0;i<100;i++){
            if(cnt[i]!=0){
                System.out.println(i+" : "+cnt[i]);
            }
        }
    }
}
