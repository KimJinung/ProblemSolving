import java.time.LocalTime;
import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int result = 0;

        Arrays.sort(book_time, Comparator.comparing(b -> b[0]));

        PriorityQueue<LocalTime> pq = new PriorityQueue<>();

        for (String[] book : book_time) {
            LocalTime inTime = LocalTime.parse(book[0]);
            LocalTime outTime = LocalTime.parse(book[1]);

            if (outTime.isBefore(LocalTime.parse(("23:50")))) {
                outTime = outTime.plusMinutes(10);
            }

            if (pq.isEmpty()) {
                pq.add(outTime);
                result++;
            }
            else if (pq.peek().isAfter(inTime)) {
                pq.add(outTime);
                result++;
            } else if (pq.peek().isBefore(inTime) || pq.peek().equals(inTime)){
                pq.poll();
                pq.add(outTime);
            }

        }

        return result;
    }
}