def solution(n):
    return len([1 for i in range(1, n + 1) if n % i == 0])
