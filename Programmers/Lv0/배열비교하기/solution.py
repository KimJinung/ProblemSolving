def solution(arr1, arr2):
    arr1_size = len(arr1)
    arr2_size = len(arr2)

    if arr1_size > arr2_size:
        return 1
    elif arr2_size > arr1_size:
        return -1
    else:
        arr1_sum = sum(arr1)
        arr2_sum = sum(arr2)

        if arr1_sum > arr2_sum:
            return 1
        elif arr2_sum > arr1_sum:
            return -1

    return 0