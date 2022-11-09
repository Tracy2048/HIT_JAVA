
package Buoi4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] cnt = new int[26];
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                cnt[str.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(cnt[i]!=0){
                System.out.println((char)(i+'a')+" : "+cnt[i]);
            }
        }
    }
}
