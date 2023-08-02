def solution(my_string, pat):
    my_string = my_string.replace("A", "C").replace("B", "A").replace("C", "B")

    return 1 if pat in my_string else 0