
package Buoi4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        while(str.contains("  ")){
            str = str.replace("  "," ");
        }
        for(int i=0;i<=9;i++){
            char a = (char)(i+'0');
            String s = String.valueOf(a);
            str = str.replace(s,"");
        }
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==' '){
                arr[i] = Character.toUpperCase(arr[i]);
            }else{
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        str = String.valueOf(arr);
        System.out.println(str);
    }
}
