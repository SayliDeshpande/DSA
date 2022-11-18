public class IntersectionOfArraysII {
  
  // leetcode problem : https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
  // Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
  
   public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,3,5,6,7};
        int[] ans = intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
  
   public static int[] intersect(int[] nums1, int[] nums2) {
        
        List<Integer> ans = new ArrayList<Integer>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j= 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ret = new int[ans.size()];
        int k=0;
        for(int n : ans) ret[k++] = n;
        return ret;
    }
}
