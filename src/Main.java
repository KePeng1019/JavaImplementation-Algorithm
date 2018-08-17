import implementation.IntersectionOfTwoArraysII;

public class Main {

    public static void main(String[] args) {
        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
        int[] nums1 = {};
        int[] nums2 = {1};
        int[] res = intersectionOfTwoArraysII.intersect(nums1, nums2);
        for (int val : res) {
            System.out.println(val);
        }
    }
}
