cheat = {
    "0": "5",
    "2": "0",
    "5": "2"
}

def solution(rsp):
    return "".join(cheat[v] for v in rsp)