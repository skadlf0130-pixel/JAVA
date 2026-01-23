package ch16.sec01;

@FunctionalInterface
// 이 애노테이션의 역할은 추상 메소드가 2개 있으면 에러난다.

public interface Calculable {
    void calculable (int x, int y);
}
