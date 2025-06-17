package a2_operator;

public class ShiftOperator {
    public static void main(String[] args) {
        // 시프트 연산자
        // >>, <<, >>>
        System.out.println(2 << 1); // 4
        // 0000 0010 = 2
        // 0000 0100 = 4
        System.out.println(4 << 1); // 8
        // 0000 1000 = 8
        System.out.println(4 >> 1); // 2
        // 0000 0010 = 2
        System.out.println(2 >> 1); // 1
        // 0000 0001 = 1
        System.out.println(3 << 1); // 6
        System.out.println(3 << 2); // 12
        System.out.println(3 << 3); // 24
        System.out.println(-3 << 1); // -6
        System.out.println(-3 << 2); // -12
        System.out.println(-3 << 3); // -24
        // << 왼쪽 시프트는 2의제곱승을 곱하는 것과 같고
        // >> 오른쪽 시프트는 2의제곱승을 나누는 것과 같다
        // 곱셈과 나눗셈의 계산을 매우 빠르게 할 수 있음.

        System.out.println(5 >> 1); // 2
        System.out.println(-5 >> 1); // -3
        // 오른쪽 시프트의 경우에는 오른쪽 비트값이 삭제되므로 정확한 계산 불가능!
        // 정밀한 나누기 계산이 필요한 곳에는 시프트연산대신 나누기를 사용해야함!
    }
}
