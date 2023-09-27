student_cheat = [
    [1, 2, 3, 4, 5],
    [2, 1, 2, 3, 2, 4, 2, 5],
    [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
]


def get_answer_by_student(student_number: int, problem_number: int):
    length = len(student_cheat[student_number])
    return student_cheat[student_number][problem_number % length]


def solution(answers):
    answer_count = [0, 0, 0]

    for problem_number, correct_answer in enumerate(answers):
        for student in [0, 1, 2]:
            if get_answer_by_student(student, problem_number) == correct_answer:
                answer_count[student] += 1

    high_score = max(answer_count)
    return [student + 1 for student, score in enumerate(answer_count) if score == high_score]
