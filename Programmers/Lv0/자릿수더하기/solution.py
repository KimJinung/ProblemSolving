def solution(n):
    answer = 0

    while (n > 0):
        value = n % 10
        n //= 10
        answer += value

    return answer