def solution(code):
    answer = ""
    mode = False

    for i in range(len(code)):
        if code[i].isalpha():
            if (not mode and i % 2 == 0):
                answer += code[i]
            elif (mode and i % 2 == 1):
                answer += code[i]
        else:
            mode = not mode

    return answer if answer != "" else "EMPTY"
