package a2_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자 (&&, ||, ^, !)
        // 발음은 순서대로 앰퍼샌드, 파이프, 캐럿, 니게이션
        // ampersand, pipe, caret, negation(=not)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
    }
}
