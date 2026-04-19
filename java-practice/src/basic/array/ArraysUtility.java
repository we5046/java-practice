package basic.array;

import java.util.Arrays;

public class ArraysUtility {
    static void main() {
        int[] numbers = {5, 2, 9, 1, 3};

        // 배열 정렬
        Arrays.sort(numbers);
        System.out.println(numbers);    // 그냥 출력하면 참조값 나옴
        System.out.println(numbers[0]);
        System.out.println("정렬된 배열: " + Arrays.toString(numbers));

        // 배열 복사
        int[] copied = Arrays.copyOf(numbers, numbers.length);
        System.out.println("복사된 배열: " + Arrays.toString(copied));

        // 배열 검색 (이진 탐색)
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("9의 인덱스: " + index);

        // 2차원 배열일때
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Arrays.toString(arr));   // 이상하게 나옴
        System.out.println(Arrays.deepToString(arr));
    }
}
