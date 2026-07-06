package Day8;


import java.util.Arrays;
public class exam {
    public static void main(String[] args){
        int[] arr = {1,2,2,2,2,3,4,5,6,6};
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        int j = 0;
        int[] newarr = new int[count];
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                newarr[j] = arr[i];
                j++;
            }
            newarr[j]=arr[arr.length-1];
        }
        System.out.println("new array"+Arrays.toString(newarr));
    }
}
