def solution(numbers, target):
    answer = 0

    def dfs(index, limit, numbers, target, acc):
        if index == limit:
            if target == acc:
                nonlocal answer
                answer += 1
            return

        dfs(index + 1, limit, numbers, target, acc + numbers[index])
        dfs(index + 1, limit, numbers, target, acc - numbers[index])

    dfs(0, len(numbers), numbers, target, 0)

    return answer