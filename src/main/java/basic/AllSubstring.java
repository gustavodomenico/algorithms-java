package basic;

import java.util.ArrayList;
import java.util.List;

public class AllSubstring {
    public List<String> solution(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }
        return list;
    }
 }
