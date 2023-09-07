def solution(s):
    answer = 0
    cache = 0

    for command in s.strip().split(" "):
        if command == "Z":
            answer -= cache
        else:
            value = int(command)
            answer += value
            cache = value

    return answer