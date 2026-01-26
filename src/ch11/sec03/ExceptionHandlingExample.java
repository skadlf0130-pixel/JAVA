package ch11.sec03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = { "100", "1AA"};

        for(int i=0; i<=arr.length; i++){
            try{

                int value = Integer.parseInt(arr[i]);
                System.out.printf("arr[%d]: %d\n", i, value);

            } catch (ArrayIndexOutOfBoundsException e){ // 예외마다 다른 처리를 하고 싶을때 사용.
                System.out.println("배열 인덱스가 초과: " +e.getMessage());
            } catch (NumberFormatException e){ // 예외마다 다른 처리를 하고 싶을때 사용.
                System.out.println("숫자로 변환할 수 없음: " +e.getMessage());
            } catch (Exception e){
                // catch (Exception e)는 항상 젤 아래에 있어야 한다.
                // 위에 있으면 밑에 실행이 안된다. 안전장치로 아래에 적어주면 된다.
                System.out.println("예외 발생: " +e.getMessage());
            }
        }
    }
}
