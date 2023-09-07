def is_composition(number: int) -> bool:
    cnt = 0

    for i in range(1, number + 1):
        if number % i == 0:
            cnt += 1

    return cnt >= 3


def solution(n):
    answer = 0

    for i in range(4, n + 1):
        if is_composition(i):
            answer += 1

    return answer
