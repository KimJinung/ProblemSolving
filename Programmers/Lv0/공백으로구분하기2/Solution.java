package Lv0.공백으로구분하기2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");

    }
}