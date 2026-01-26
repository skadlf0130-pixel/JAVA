package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//(Map -> * *은 모든 파일은 인폴트하는거라
// *로 적으면 map을 인폴트하는거랑 같다)

public class HashMapExample {
    public static void main(String[] args) {
        // 제네릭 첫번째 타입 : key타입
        // 제네릭 두번째 타입 : Value 타입


        Map<String, Integer> map= new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        System.out.println("value0-0: " + map.get("홍길동")); //90
        map.put("홍길동", 95); //추가되지 않고 덮어쓰기 된다.
        System.out.println("value0-1: " + map.get("홍길동")); //95

        int value1= map.get("신용권");
        System.out.println("value1: "+ value1);
        System.out.println("value2: "+ map.get("홍길동"));
        System.out.println("value3: "+ map.get("크크크"));

        System.out.println("size: "+ map.size());

        //Set은 value만 저장하고 중복값 저장 X.
        Set<String> keySet = map.keySet();
        // key값들만 빼내서 Set으로 만든 것.

        //Set객체를 이용하여 Iterator 반복자를 생성한다.(반복하기 위해)
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            // 다음을 가리켰을 때 데이터가 있으면 true 없으면 false
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n" ,k ,v);
        }
    }
}
