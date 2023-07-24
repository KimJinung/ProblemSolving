def solution(arr, n):
    size = len(arr)
    condition = size % 2

    for i in range(size):
        if i % 2 != condition:
            arr[i] += n

    return arr