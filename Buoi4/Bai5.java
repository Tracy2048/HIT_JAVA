
package Buoi4;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        int I = 1;
//        int V = 5;
//        int X = 10;
//        int L = 50;
//        int C = 100;
//        int D = 500;
//        int M = 1000;
        int res = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='I'){
                res++;
            }
            if(str.charAt(i)=='V'){
                if(i>0&&str.charAt(i-1)=='I'){
                    res+=3;
                }else res+=5;
            }
            if(str.charAt(i)=='X'){
                if(i>0&&str.charAt(i-1)=='I'){
                    res+=8;
                }else res+=10;
            }
            if(str.charAt(i)=='L'){
                if(i>0&&str.charAt(i-1)=='X'){
                    res+=30;
                }else res+=50;
            }
            if(str.charAt(i)=='C'){
                if(i>0&&str.charAt(i-1)=='X'){
                    res+=80;
                }else res+=100;
            }
            if(str.charAt(i)=='D'){
                if(i>0&&str.charAt(i-1)=='C'){
                    res+=300;
                }else res+=500;
            }
            if(str.charAt(i)=='M'){
                if(i>0&&str.charAt(i-1)=='C'){
                    res+=800;
                }else res+=1000;
            }
        }
        System.out.println(res);
    }
}
