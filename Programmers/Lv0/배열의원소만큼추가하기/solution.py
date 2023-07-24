def method(x: list, a: int):
    for _ in range(a):
        x.append(a)

    return x

def solution(arr):
    x = []

    for v in arr:
        x = method(x, v)

    return x