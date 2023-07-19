from functools import reduce


def solution(num_list):
    s = sum(num_list)
    m = reduce(lambda a, b : a * b, num_list, 1)

    return 1 if m < s ** 2 else 0