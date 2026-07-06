package Day8;

public class stringuse {
    public static void main(String[] args) {
        String str="hEllo";
        String Strg=str.toLowerCase();
        int countv=0;
        int countc=0;
        char[] ch=Strg.toCharArray();
        for(char num:ch){
            if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u'){
                countv++;
            }
            else{
                countc++;
            }

        }
        System.out.println("number of vowels:"+countv);
        System.out.println("Numberof consonats:"+countc);
    }
}


