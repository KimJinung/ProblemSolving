def DFS(fatigue: int, dungeons: list, is_used: list, size: int) -> int:
    result = 0

    for i in range(size):
        need_fatigue = dungeons[i][0]
        use_fatigue = dungeons[i][1]

        if not is_used[i] and fatigue >= need_fatigue:
            is_used[i] = True
            result = max(1 + DFS(fatigue - use_fatigue, dungeons, is_used, size), result)
            is_used[i] = False

    return result


def solution(k, dungeons):
    size = len(dungeons)
    is_used = [False for _ in range(size)]
    return DFS(k, dungeons, is_used, size)
