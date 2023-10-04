def is_valid_h_index(citations: list, h: int) -> bool:
    target_idx = len(citations) - h
    return citations[target_idx] >= h


def solution(citations):
    citations.sort()

    for h in range(len(citations), 0, -1):
        if is_valid_h_index(citations, h):
            return h
    return 0