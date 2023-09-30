from collections import deque


class Work:
    def __init__(self, start_progress: int, speed: int):
        self.progress = start_progress
        self.speed = speed

    def update(self) -> None:
        self.progress += self.speed

    def is_done(self) -> bool:
        return self.progress >= 100


def solution(progresses, speeds):
    queue = deque([])
    stk = []

    for i in range(len(progresses)):
        instance = Work(progresses[i], speeds[i])
        queue.append(instance)

    while queue:
        done_count = 0

        for work in queue:
            work.update()

        while queue and queue[0].is_done():
            queue.popleft()
            done_count += 1

        if done_count:
            stk.append(done_count)

    return stk