package Q74;
import java.util.Scanner;
// count no of vowels and consonents 

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        int vowel=0;
        int consonents=0;
        for (int i =0;i<str.length();i++){
            char b = str.charAt(i);
            if ((b>='A'&& b<='Z') ||(b>='a' && b<='z')){
                if(b=='A'||b=='a'||b=='e'||b=='E'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U'){
                    vowel++;
                }
                else{
                    consonents++;
                }
            }
        }
        System.out.println("count of Vowels : "+vowel);
        System.out.println("count of Consonents : "+consonents);
        sc.close();
    }
}
