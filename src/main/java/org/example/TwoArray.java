//package org.example;
//
//public class TwoArray {
//
//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            return intersect(nums2, nums1);
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums1) {
//            map.putIfAbsent(num, 0);
//            map.put(num, map.get(num) + 1);
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        for (int num : nums2) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) - 1);
//                ans.add(num);
//                if (map.get(num) == 0) {
//                    map.remove(num);
//                }
//            }
//        }
//
//        int[] answ = new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++) {
//            answ[i] = ans.get(i);
//        }
//
//        return answ;
//    }
//}
