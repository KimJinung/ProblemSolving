def mul(arr, k):
    return [v * k for v in arr]


def add(arr, k):
    return [v + k for v in arr]


def solution(arr, k):
    if k % 2 != 0:
        return mul(arr, k)

    return add(arr, k)