def solution(my_string):
    return "".join(ch if ch > "l" else "l" for ch in my_string)