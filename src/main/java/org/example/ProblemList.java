package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProblemList {

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path: paths) {
            String[] contentPath = path.split(" ");
            String catalog = contentPath[0];
            for (int i = 1; i < contentPath.length; i++) {
                String file = contentPath[i];
                int start = file.indexOf('(');
                int end = file.length();
                String content = file.substring(start + 1, end);

                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(catalog + '/' + file.substring(0, start));
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (var s: map.entrySet()) {
            if (s.getValue().size() > 1) {
                ans.add(s.getValue());
            }
        }
        return ans;
    }
}