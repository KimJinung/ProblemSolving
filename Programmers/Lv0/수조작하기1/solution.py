def move(n: int, ch: str):
    # python 3.10부터 match case가 추가되었음
    if ch == 'w':
        return n + 1
    elif ch == 's':
        return n - 1
    elif ch == 'd':
        return n + 10
    elif ch == 'a':
        return n - 10

    return n


def solution(n, control):
    for c in control:
        n = move(n, c)

    return n