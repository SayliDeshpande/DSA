//leetcode 349: https://leetcode.com/problems/intersection-of-two-arrays/
//  Each element in the result must be unique and you may return the result in any order.

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,3,5,6,7};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
  
   private static int[] intersection(int[] nums1, int[] nums2) {
       /* List<Integer> res = new ArrayList<Integer>();
        Set<Integer> setnum1 = new HashSet<Integer>();
        for(int n1 : nums1) setnum1.add(n1);
        Set<Integer> setnum2 = new HashSet<Integer>();
        for(int n2 : nums2) setnum2.add(n2);

        for(int s: setnum1){
            if(setnum2.contains(s)){
                res.add(s);
            }
        }
        int[] ret = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ret[i]= res.get(i);
        }
        return ret;*/

//using two pionter approach
       Set<Integer> res = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        while(i< nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int k=0;

        int[] ret = new int[res.size()];
        for(int n: res) ret[k++]=n;

        return ret;
   }
}
