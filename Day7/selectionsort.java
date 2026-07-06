package Day7;

public class selectionsort{
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int [] arr={21,56,34,12,32};
        selectionsort(arr);
        for(int i:arr){
            System.out.println(i+"");
        }
    }
}
