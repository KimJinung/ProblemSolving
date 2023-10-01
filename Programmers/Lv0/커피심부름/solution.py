import re


LATTE = "cafelatte"

def solution(orders):
    answer = 0;

    for order in orders:
        order = re.sub("hot|ice", "", order)

        if order == LATTE:
            answer += 5000
        else:
            answer += 4500

    return answer