package basic;

public class ArrayPractice {
    static void main() {
        int []intnum = new int[5];
        int length_of_array;

        intnum[0] = 1;
        intnum[1] = 2;
        intnum[2] = intnum[0] + intnum[1];
        intnum[3] = intnum[1] + intnum[2];
        intnum[4] = intnum[2] + intnum[3];

        length_of_array = intnum.length;

        System.out.println("Array Practice Program");
        System.out.println("Fifth Integer Number");
        System.out.println(intnum[4]);
        System.out.println("Array Size");
        System.out.println(length_of_array);
    }
}
