def solution(num_list):
    last_element = num_list[-1]
    target_element = num_list[-2]

    if last_element > target_element:
        num_list.append(last_element - target_element)
    else:
        num_list.append(last_element * 2)

    return num_list
