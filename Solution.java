import java.util.*;
import java.io.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int N = nums1.length;
        int M = nums2.length;
        Set<Integer> arr = new HashSet<>();
        
        for(int i =0; i <N; i++){
            for(int j = 0; j < M; j++){
                if(nums1[i] == nums2[j]){
                   arr.add(nums1[i]);
                }
            }
        }
        int n = arr.size();
        int[] nums3 = new int[n];
        int k = 0;
        for(int p : arr){
            nums3[k] = p;
            k = k +1;
        }
        return nums3;
       
        
       
    }
}
