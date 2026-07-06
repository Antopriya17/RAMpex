package Day5;



import java.util.Scanner;

public class sum_avg_arry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,2,3,4,5};
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        float avg=sum/5;
        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);
    }
}