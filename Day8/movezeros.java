package Day8;



public class movezeros {
    public static void main(String[] args){
        int[] nums={1,2,3,5,0,3,0,1};
        int num=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!= 0) {
                nums[num++]=nums[i];
            }
        }
        while(num<nums.length) {
            nums[num++]=0;
        }
        for(int x : nums){
            System.out.print(x + " ");
        }

    }

}