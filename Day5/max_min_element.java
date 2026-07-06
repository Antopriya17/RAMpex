package Day5;



import java.util.Scanner;

public class max_min_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={7,3,2,9,10};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<5;i++){
            while(arr[i]>max){
                max=arr[i];
            }
            while(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min:"+min);
        System.out.println("max:"+max);

    }
}