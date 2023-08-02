def solution(todo_list, finished):
    return [todo_list[i] for i, b in enumerate(finished) if not b]