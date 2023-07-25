def solution(n, computers):
    visited = {i: False for i in range(n)}

    def dfs(start, computers):
        nonlocal visited
        stk = [start]

        while stk:
            node = stk.pop()

            if visited.get(node):
                continue

            visited[node] = True
            for next_node, connected in enumerate(computers[node]):
                if next_node == node: continue
                if not connected: continue

                if not visited.get(next_node):
                    stk.append(next_node)


    answer = 0
    for node in range(n):
        if not visited.get(node):
            dfs(node, computers)
            answer += 1

    return answer
