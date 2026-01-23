package ch13.sec01;
/*
<T> 제네리그 T문자열은 아무거나 해도된다.
Type이라는 의미로 T를 많이 쓴다.
T 자리에 타입이 들어간다. 즉, 아직 타입이 정해지지 않았다.

 */
public class Box <T>{
    private T content;

    public void  setContent(T content){
        this.content = content;
    }

    public T getContent(){
        return  content;
    }

}
