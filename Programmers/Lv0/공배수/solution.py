def is_common_multiple(value: int, div: int):
    return value % div == 0


def solution(number, n, m):
    return 1 if is_common_multiple(number, n) and is_common_multiple(number, m) else 0