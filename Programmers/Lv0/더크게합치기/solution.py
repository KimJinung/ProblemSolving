def custom_sum(value1: int, value2: int) -> int:
    return int(str(value1) + str(value2))


def solution(a, b):
    return max(custom_sum(a, b), custom_sum(b, a))

