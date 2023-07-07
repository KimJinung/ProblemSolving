def solution(s1, s2):
    string_dict = {key: True for key in s1}
    return sum(1 for key in s2 if string_dict.get(key))