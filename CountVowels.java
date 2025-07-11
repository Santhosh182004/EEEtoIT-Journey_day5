import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       
        char ch[]=str.toCharArray();
        int sp=0;
        int vow_count=0;
        int cons_count=0;
        for(int i=0;i<str.length();i++){
// Here the Character.isLetter(ch[i]) checks whether only characters are letter only or not 
            if(Character.isLetter(ch[i])){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'
            || ch[i]=='A' || ch[i]=='E' || ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U'){
                  vow_count++;
            }
           
            else{
                  cons_count++;
            }
        }}
        System.out.println("The Vowels Count : "+vow_count);
        System.out.println("The consonants Count : "+cons_count);
    }
}
