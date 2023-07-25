from collections import deque


class Node:
    def __init__(self, acc, index):
        self.acc = acc
        self.index = index


def solution(numbers, target):
    answer = 0
    size = len(numbers)

    dq = deque([])
    dq.append(Node(0, 0))

    while dq:
        node = dq.popleft()

        if node.index == size:
            if node.acc == target:
                answer += 1
            continue

        next_index = node.index + 1
        value = numbers[node.index]

        dq.append(Node(node.acc + value, next_index))
        dq.append(Node(node.acc - value, next_index))

    return answer