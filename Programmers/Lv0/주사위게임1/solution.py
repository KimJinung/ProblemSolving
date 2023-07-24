def is_odd(num: int):
    return num % 2 == 1


def solution(a, b):
    if is_odd(a) and is_odd(b):
        return a ** 2 + b ** 2
    elif is_odd(a) or is_odd(b):
        return 2 * (a + b)

    return abs(a - b)
