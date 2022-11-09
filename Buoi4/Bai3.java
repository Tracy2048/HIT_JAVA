
package Buoi4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        float sum = 0;
        int cnt = 0;
        boolean ok = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                ok = true;
                sum += str.charAt(i)-'0';
                cnt++;
            }
        }
        if(ok){
            System.out.println("true");
            System.out.println(Math.round(sum/cnt*1000)/1000.0);
        }else System.out.println("false");
    }
}
