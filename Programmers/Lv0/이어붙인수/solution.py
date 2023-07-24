def get_number_list_by_condition(num_list: list, is_odd: bool):
    if is_odd:
        return [v for v in num_list if v % 2 == 1]
    return [v for v in num_list if v % 2 == 0]


def solution(num_list):
    odd_list = get_number_list_by_condition(num_list, True)
    even_list = get_number_list_by_condition(num_list, False)

    odd_sum = "".join(map(str, odd_list))
    even_sum = "".join(map(str, even_list))

    return int(odd_sum) + int(even_sum)