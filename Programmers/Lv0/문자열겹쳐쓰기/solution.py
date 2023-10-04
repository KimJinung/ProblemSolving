def solution(my_string, overwrite_string, s):
    answer = ''
    end = s + len(overwrite_string) - 1

    for i in range(len(my_string)):
        if i < s or i > end:
            answer += my_string[i]
        else:
            answer += overwrite_string[i - s]

    return answer