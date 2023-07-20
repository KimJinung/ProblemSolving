def condition(num: int):
    if num >= 50 and num % 2 == 0:
        return num // 2
    elif num < 50 and num % 2 != 0:
        return num * 2
    return num


def solution(arr):
    return [condition(n) for n in arr]