package Day7;




public class sorting {
    public static void main(String[] args){
        int[] arr={3,2,8,4,9,6};
        sorting(arr);
        for(int num:arr){
            System.out.print(num+"");
        }
    }
    public static void sorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-i;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
