package Day8;
public class string_words_rev {
    public static void main(String[] args){
        String str="This is word";
        String[] arr=str.split(" ");
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            String temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for(String x : arr){
            System.out.print(x + " ");
        }
    }

}
