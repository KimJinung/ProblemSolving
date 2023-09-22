def solution(nums: list):
    answer = 0
    choose_count = len(nums) // 2
    pocketmon_dict = {}

    for pocketmon in nums:
        if not pocketmon_dict.get(pocketmon):
            pocketmon_dict[pocketmon] = True
            answer += 1
            choose_count -= 1

            if choose_count == 0:
                return answer

    return answer
