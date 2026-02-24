import java.util.Scanner;
public class ReverseString{

    public static String revString(String str){
        char ch[]=str.toCharArray();
        int n=ch.length;
        for(int i=0;i<n/2;i++){
            char temp=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=temp;
        }
        return new String(ch);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        String revStr=revString(str);
        System.out.println("Reversed String: "+revStr);
        
    }
}