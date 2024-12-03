package FAT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Combinations {

//     private static void combine(int[] nums, int count, int size, int start, String comb) {
//         if (count == size) {
//             System.out.println(comb);
//         } else {
//             for (int i = start; i < nums.length; i++) {
//                 combine(nums, count + 1, size, i + 1, comb + nums[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = input.nextInt();
//         }

//         Arrays.sort(nums); 
//         int k = input.nextInt();
//         input.close();

//         combine(nums, 0, k, 0, "");
//     }
// }

// import java.util.*;

// public class Combinations {
//     private static void findCombinations(int[] nums, int target, int index, List<Integer> comb) {
//         if (target == 0) {
//             for (int num : comb) System.out.print(num + " ");
//             System.out.println();
//             return;
//         }
//         for (int i = index; i < nums.length && nums[i] <= target; i++) {
//             comb.add(nums[i]); // Add current number
//             findCombinations(nums, target - nums[i], i, comb); // Recur with the same index
//             comb.remove(comb.size() - 1); // Backtrack
//         }
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input array and target
//         int n = input.nextInt();
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) nums[i] = input.nextInt();
//         int target = input.nextInt();
//         input.close();

//         Arrays.sort(nums); // Sort array for non-descending order
//         findCombinations(nums, target, 0, new ArrayList<>());
//     }
// }

public class Combinations {

    private static void findCombinations(int nums[],int target,int index, List<Integer> comb){
        if(target==0){
        for(int num: comb) System.out.print(num+" ");
        System.out.println();
        return;}

        for(int i=index;i < nums.length && nums[i] <= target; i++)
        {
            comb.add(nums[i]);
            findCombinations(nums,target-nums[i],i,comb);
            comb.remove(comb.size()-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();

        int target=sc.nextInt();

        Arrays.sort(nums);
        findCombinations(nums,target,0, new ArrayList<>());
    }
}
