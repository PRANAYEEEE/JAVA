public class Sorting {
    //This is a sample code
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

    public static void mergeSort(int[] nums){
        int length = nums.length;
        if(length<=1){return;}

        int mid = length/2;
        int l[] = new int[mid];
        int r[] = new int[length-mid];

        int i=0,j=0;

        for(;i<length;i++){
            if(i<mid){
                l[i] = nums[i];
            }
            else{
                r[j] = nums[i];
                j++;    
            }
        }
        mergeSort(l);
        mergeSort(r);
        merge(l, r, nums);

    }
    public static void merge(int left[],int right[],int[] nums){
        int ls = nums.length/2;
        int rs = nums.length-ls;
        int i=0,l=0,r=0;

        while(l<ls && r<rs){
            if(left[l] < right[r]){
                nums[i] = left[l];
                i++;l++;
            }
            else{
                nums[i] = right[r];
                i++;r++;
            }
        }
        while(l<ls){nums[i] = left[l];i++;l++;}
        while(r<rs){nums[i] = right[r];i++;r++;}

    }


    public static void main(String[] args) {
        int[] nums = {9,4,2,3,6,5,1,7,8,0,2};
        // BubbleSort(nums);
        // SelectionSort(nums);
        // InsertionSort(nums);
        mergeSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
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
