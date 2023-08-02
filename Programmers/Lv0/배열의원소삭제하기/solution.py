def solution(arr, delete_list):
    delete_dict = {v: True for v in delete_list}

    return [v for v in arr if not delete_dict.get(v)]