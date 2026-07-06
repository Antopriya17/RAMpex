package Day8;



public class longestword_string {
    public static void main(String[] args){
        String str="This is the longest word";
        String[] arr=str.split(" ");
        String longest=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i].length() > longest.length() ){
                longest=arr[i];
            }
        }
        System.out.println(longest);
    }
}