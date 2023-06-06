package Programmers.Lv2.쿼드압축후개수세기;

/*
문제가 요구하는 것
1. 특정 영역 S내 모든 값이 같으면 해당 값으로 압축할 수 있다.
2. 불가능 하다면 정확히 4개의 균일한 정사각형으로 분리한다.

1~2번이 반복 된다. -> 재귀

재귀
상태: (x, y, size) 시작 위치로부터 사이즈만큼 검사할 수 있어야 한다.
종료 조건: 2차원 배열에서 현재 값이 시작 값과 다르다면 종료
점화식: (x, y, size) =
(x, y, size / 2)
+ (x + size / 2, y, size / 2)
+ (x, y + size / 2, size / 2)
+ (x + size / 2, y + size / 2, size / 2)
*/


class Solution {
    private static class Quad {
        public final int zero;
        public final int one;

        public Quad(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Quad add(Quad partialQuad) {
            return new Quad(zero + partialQuad.zero, one + partialQuad.one);
        }

    }

    private Quad compress(int offsetX, int offsetY, int size, int[][] arr) {
        int nextSize = size / 2;

        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return compress(offsetX, offsetY, nextSize, arr)
                            .add(compress(offsetX + nextSize, offsetY, nextSize, arr))
                            .add(compress(offsetX, offsetY + nextSize, nextSize, arr))
                            .add(compress(offsetX + nextSize, offsetY + nextSize, nextSize, arr));
                }
            }
        }
        if (arr[offsetY][offsetX] == 1) {
            return new Quad(0, 1);
        }
        return new Quad(1, 0);
    }

    public int[] solution(int[][] arr) {
        Quad quad = compress(0, 0, arr.length, arr);
        return new int[] {quad.zero, quad.one};
    }
}