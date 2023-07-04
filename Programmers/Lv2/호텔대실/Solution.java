package Lv2.호텔대실;

import java.time.LocalTime;
import java.util.*;


class Solution {

    LocalTime lastOutTime = LocalTime.parse("23:50");

    public int solution(String[][] book_time) {
        int roomCount = 0;

        Arrays.sort(book_time, Comparator.comparing(b -> b[0]));

        PriorityQueue<LocalTime> pq = new PriorityQueue<>();

        for (String[] book : book_time) {
            LocalTime inTime = LocalTime.parse(book[0]);
            LocalTime outTime = LocalTime.parse(book[1]);

            if (outTime.isBefore(lastOutTime)) {
                outTime = outTime.plusMinutes(10);
            }

            if (pq.isEmpty()) {
                pq.add(outTime);
                roomCount++;
            }
            else if (pq.peek().isAfter(inTime)) {
                pq.add(outTime);
                roomCount++;
            } else if (pq.peek().isBefore(inTime) || pq.peek().equals(inTime)){
                pq.poll();
                pq.add(outTime);
            }
        }

        return roomCount;
    }
}