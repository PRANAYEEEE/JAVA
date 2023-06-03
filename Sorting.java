public class Sorting {
    public static void BubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        // for (int i : nums) {
        //     System.out.print(i+" ");
        //     System.out.println();
        // }
    }

    public static void SelectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];    
            int index = i;
                for (int j = i+1; j < nums.length; j++) {
                    min = Math.min(min, nums[j]);    
                    if(min == nums[j]){index = j;}  
                }            
            if(min == nums[i]){continue;}
            else{
                int temp = nums[i];
                nums[i] = min;
                nums[index] = temp;
            }    

        }
        // for (int i : nums) {
            // System.out.print(i+" ");
            // System.out.println();
        // }
    }

    public static void InsertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i-1; j >= 0; j--) {
                if(nums[j]>temp){
                    nums[j+1] = nums[j];
                }
                else{break;}
            }
        }

        for (int i : nums) {
            System.out.print(i+" ");
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int[] nums = {9,4,2,3,6,5,1,7,8,0,2};
        BubbleSort(nums);
        SelectionSort(nums);
        InsertionSort(nums);
    }

    
}

class Pair{
    int a;
    int b;
    public
     Pair(int a,int b){
        this.a = a;
        this.b = b;

    }
}
