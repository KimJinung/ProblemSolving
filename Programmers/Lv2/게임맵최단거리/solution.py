from collections import deque


def solution(maps):
    row = len(maps)
    col = len(maps[0])

    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    dq = deque([(0, 0)])

    while dq:
        y, x = dq.popleft()
        cost = maps[y][x]

        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if nx < 0 or nx >= col or ny < 0 or ny >= row:
                continue
            elif maps[ny][nx] == 0:
                continue

            if maps[ny][nx] == 1 or maps[ny][nx] > cost + 1:
                maps[ny][nx] = cost + 1
                dq.append([ny, nx])


    answer = maps[row - 1][col - 1]

    return answer if answer > 1 else -1
