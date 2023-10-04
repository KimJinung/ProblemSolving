def method(arr: list, i: int, j: int, k: int) -> int:
    return sorted(arr[i - 1: j])[k - 1]


def solution(array, commands):
    answer = []

    for command in commands:
        result = method(array, command[0], command[1], command[2])
        answer.append(result)

    return answer