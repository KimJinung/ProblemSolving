from collections import deque


class CustomProcess:
    def __init__(self, pid: int, is_target: bool):
        self.pid = pid
        self.is_target = is_target

    def get_pid(self) -> int:
        return self.pid

    def is_target_location(self) -> bool:
        return self.is_target


def solution(priorities, location):
    answer = 1

    queue = deque([])
    pq = deque(sorted(priorities, reverse=True))

    for i in range(len(priorities)):
        target = location == i
        job = CustomProcess(priorities[i], target)
        queue.append(job)

    target_priority = pq.popleft()

    while queue:
        current_job = queue.popleft()

        if current_job.get_pid() == target_priority:
            if current_job.is_target_location():
                return answer
            target_priority = pq.popleft()
            answer += 1
        else:
            queue.append(current_job)

    return answer

