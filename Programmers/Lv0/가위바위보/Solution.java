package Lv0.가위바위보;

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);

            switch (c) {
                case '0' -> sb.append("5");
                case '2' -> sb.append("0");
                case '5' -> sb.append("2");
            }
        }
        return sb.toString();
    }
}