package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args){
        // 자바에서 배열만드는 방법 중 하나
        //자바에서도 배열은 객체이다.
        //진리!! primitive 변수를 제외한 모든 것을든 참조변수
        //[](대괄호)가 붙으면 primitive 변수가 아니다. 참조변수
        //주소값을 저장한다. 주소값을 알면 객체에 접근할수 있다.
        //int a; primitive 타입(일반변수)
        //변수 - 값을 저장하는 공간. 계속 변경이 가능해서 변수. 바꿀수 없다면 상수.
        //아래는 모두 reference 타입(참조변수)이라고 부른다.
        // 각방마다 타입을 뜻한다. int=1, int=2...등 arr1은 int배열타입
        int[] arr1 ={1,2,3};
        int[] arr2 ={1,2,3};
        int[] arr3 = arr1; // 주소값 복사 >> 얕은 복사 shallow copy

        // arr1.length = 10;  자바의 배열의 length 속성은 상수이다.
        //레퍼런스 타입끼리의 == 비교는 주소값비교이다.
        //레퍼런스 타입끼리의 == 비교는 동일성 비교이다. 즉, 같은 주소인가?를 물어보는 것.
        //프라머티브 타입끼리의 == 비교는 리터럴 값 비교
        System.out.println("arr1 == arr2:" +(arr1 == arr2));
        System.out.println("arr1 == arr3:" +(arr1 == arr3));
    }
}
