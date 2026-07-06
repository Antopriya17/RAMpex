package Day8;


public class tochar {
    public static void main(String[] args){
        String str="hello world";
        char[] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
        String name=new String(ch);
        System.out.println(name);
    }


}