package basic;

public class OperatorPractice {
    public static void main (String args[]) {
        double dnum;
        int num, assign;
        System.out.println("Operator Practice");
        /* 연산자의 우선순위가 지켜지는지 확인 */
        dnum = 12.3 + 34.5 * 12.3;

        /* print 와 println의 차이는 커서가 다음 줄로 이동하는가의 차이 */
        System.out.print("12.3 + 34.5 * 12.3 = ");
        System.out.println(dnum);

        /* 증감 연산자의 전후 배치에 따른 차이 확인 */
        num = 10;
        System.out.println("num = 10");
        assign = num++;
        System.out.print("After assign = num++ : assign = ");
        System.out.println(assign);
        assign = ++num;
        System.out.print("After assign = ++num : assign = ");
        System.out.println(assign);

        /* 관계 연산자 확인 */
        System.out.print("10 > 5 : ");
        System.out.println(10 > 5);

        /* 조건연산자 확인 */
        assign = (num > 5) ? 10 : 20;
        System.out.print("(num > 5) ? 10 : 20 = ");
        System.out.println(assign);
    }
}
