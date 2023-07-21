import math


def solution(n):
    sqrt = math.sqrt(n)

    if sqrt % 1 == 0:
        return 1

    return 2