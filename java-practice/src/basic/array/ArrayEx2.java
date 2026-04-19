package basic.array;

import java.util.Arrays;

public class ArrayEx2 {

    public void createArray(int count) {
        int []m = new int[count]; // [][][][][] count 만큼 배열생성
        for(int i =0; i< m.length; i++) {
            m[i] = (int)(Math.random()*100);
        }

        // fill을 쓰면, 모든게 같은 랜덤값이 들어가서 랜덤이 의미없다.
        // Arrays.fill(m, (int)Math.random()*100);
        disp(m);
    }

    public void disp(int[] data) {
        //[]data는 배열의 주소를 받는 참조변수 Parameter

        // 향상된 for문 foreach 사용
        for(int i : data) {
            System.out.printf("%5d", i);
        }
    }

    static void main(String[] args) {
        ArrayEx2 a = new ArrayEx2();
        a.createArray(5);
    }
}
