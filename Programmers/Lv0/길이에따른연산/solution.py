from functools import reduce


def solution(num_list):
    size = len(num_list)

    if size > 10:
        return sum(num_list)

    return reduce(lambda x, y : x * y, num_list, 1)
