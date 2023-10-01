# Brown = 2 * (width + height - 2)
# Yellow = width * height - Brown

# Min case [3, 3]
"""
Max case

Brown = 2 * (width + height - 2) <= 5000
= 2 * (width + 3 -2) <= 5000
= width = 2499

* height가 최소일 때, width가 최대가 될 수 있고,
갈색 카펫의 개수가 최대 5000개임을 이용해서 maxWidth를 구할 수 있음
"""

def solution(brown, yellow):
    max_width = 2499

    for w in range(3, 2500):
        for h in range(3, w + 1):
            brown_capet = 2 * (w + h - 2)
            yellow_capet = w * h - brown_capet

            if (brown_capet == brown and yellow_capet == yellow):
                return [w, h]
