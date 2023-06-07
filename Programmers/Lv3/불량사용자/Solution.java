package Programmers.Lv3.불량사용자;

/*
1. 각 불량 사용자 아이디에 매칭될 수 있는 유저 id를 배열로 생성한다.
    - [fr*d*: {frodo, fradi}, abc1** : {abc123}]
2. 생성한 배열을 가지고 재귀 태운다.
    - fr*d*에 올 수 있는 케이스 하나 태우고 다음 재귀
        - frodo + abc1**
        - fradi + abc1**


점화식
상태: (idx, banned_id idx)
종료 조건: 인덱스가 banned_id 마지막에 도착했을 때
점화식: (idx, banned_id idx, []) =
(idx + 1, banned_id, [user_id])
*/

import java.util.*;

class Solution {

    private void count(int idx, String[][] bans, Set<String> banned, Set<Set<String>> banSet) {
        if (idx == bans.length) {
            banSet.add(new HashSet<>(banned));
            return;
        }

        for (String id: bans[idx]) {
            if (banned.contains(id)) continue;
            banned.add(id);
            count(idx + 1, bans, banned, banSet);
            banned.remove(id);
        }
    }

    public int solution(String[] user_id, String[] banned_id) {
        String[][] bans = Arrays.stream(banned_id)
                .map(banned -> banned.replace('*', '.'))
                .map(banned -> Arrays.stream(user_id).filter(id -> id.matches(banned)).toArray(String[]::new))
                .toArray(String[][]::new);

        Set<Set<String>> banSet = new HashSet<>();
        count(0, bans, new HashSet<>(), banSet);

        return banSet.size();
    }
}
