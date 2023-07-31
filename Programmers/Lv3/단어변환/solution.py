"""
문제가 요구하는 것
1. 주어진 단어(begin)에서 한 철자씩 변경하면서 target까지 도달하는 최소 단계

풀이
1. 최소 단계 이므로 BFS 알고리즘을 사용할 수 있다.
2. Words 리스트를 순회
- 현재 단어에서 변경 가능 여부와 사용 여부를 체크한다.
- 모든 단어를 사용하고도 찾을 수 없는 경우 0을 반환한다.
"""

from collections import deque


class Word:
    def __init__(self, word, depth):
        self.word = word
        self.depth = depth


def BFS(begin: str, target: str, words: list) -> int:
    begin_word = Word(begin, 0)
    dq = deque([begin_word])
    is_used = {word: False for word in words}

    while dq:
        word = dq.popleft()

        if word.word == target:
            return word.depth

        for next_word in words:
            if is_used.get(next_word): continue
            if is_convertable(word.word, next_word):
                dq.append(Word(next_word, word.depth + 1))
                is_used[next_word] = True

    return 0


def is_convertable(origin: str, target: str) -> bool:
    diff_count = 0

    for i in range(len(origin)):
        if origin[i] != target[i]:
            diff_count += 1

    return diff_count == 1


def solution(begin, target, words):
    return BFS(begin, target, words)