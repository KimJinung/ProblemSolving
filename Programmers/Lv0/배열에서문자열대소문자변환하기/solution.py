def solution(str_arr):
    for i in range(0, len(str_arr)):
        if i % 2 == 0:
            str_arr[i] = str_arr[i].lower()
        else:
            str_arr[i] = str_arr[i].upper()

    return str_arr