def is_empty(arr: list) -> bool:
    return not arr


def solution(s):
    stk = []

    for br in s:
        if br == '(':
            stk.append(br)
        else:
            if not stk or stk[-1] != '(':
                return False
            stk.pop()

    return is_empty(stk)