package ch06.sec09;

public class ArrayListString {
     String[] arr;

    public ArrayListString(){
        arr = new String[0];
    }
    public void add(String val){
        //전역변수 arr이 가리키고 있는 배열보다 한칸 더 큰 배열을 만든다.
        //그리고 마지막 방에 val를 넣는다.
        String [] arr1 = new String[arr.length +1];
        int lastIdx = arr.length;
        arr1[lastIdx] = val;
        for(int i=0; i<lastIdx; i++){
            arr1[i] = arr[i];
        }
        arr = arr1;
    }
    public String get(int idx){
        return arr[idx];
    }
    public String removeVal() {
        String[] arr2 = new String[arr.length - 1];
        String lastVal= get(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        arr= arr2;
        return lastVal;
    }

    public void add(int num, String val){

        String[] temp = new String[arr.length + 1];
        temp[num] = val;
        for(int i=0; i<arr.length; i++){
            temp[i<num? i: i+1] = arr[i];
        }
        arr= temp;
    }
    public String remove(int num) {
        String idx = arr[num];
        String[] temp = new String[arr.length - 1];
        for(int i=0; i< num; i++){
            temp[i] = arr[i];
        }for(int k=num; k< temp.length; k++){
            temp[k] = arr[k+1];
        }
        arr=temp;
        return idx;
    }
    public void remove(String val){
        for(int i=0;i<arr.length;i++){
            if(val==arr[i]){
                remove(i);
                return;
            }
        }
    }
}
