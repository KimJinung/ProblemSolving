def solution(my_string, pat):
    my_string = my_string.lower()
    pat = pat.lower()

    return 1 if pat in my_string else 0