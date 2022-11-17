//package org.example;
//
//public class countCommonWordsWithOneOccurrence {
//    class Solution {
//        public int countWords(String[] words1, String[] words2) {
//            if (words1.length > words2.length) {
//                return countWords(words2, words1);
//            }
//            Map<String, Integer> map = new HashMap<>();
//            for (String words : words1) {
//                map.putIfAbsent(words, 0);
//                map.put(words, map.get(words) + 1);
//            }
//
//            for (String words : words2) {
//                if (map.containsKey(words)) {
//                    if (map.get(words) > 1) {
//                        map.remove(words);
//                    } else {
//                        map.put(words, map.get(words) - 1);
//                        if (map.get(words) < 0) {
//                            map.remove(words);
//                        }
//                    }
//
//                }
//            }
//            int count = 0;
//            for (Map.Entry<String, Integer> pair : map.entrySet()) {
//                if (pair.getValue() == 0) {
//                    count++;
//                }
//            }
//            return count;
//        }
//    }
//}
