package ch06.sec08;

public class PracticeMethod {
    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random(int num) {
        int result = (int) (Math.random() * num);
        return result;
    }

    public int random(int min, int max) {
        int result = (int) (Math.random() * (max - min)) + min;
        return result;
    }

    public String getGrade(int num2) {

        if (90 < num2) {
            return "A";
        } else if (80 < num2) {
            return "B";
        } else {
            return "C";
        }
    }

    public void printStar(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public void printStarTriangle(int tri) {
        for (int i = 0; i < tri; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    /*
    public void printStarTriangle(int tri){
        for(int j=0; j<=tri; j++) {
           printStar(j);
        }

     */
    }
    public void printStarRectangle(int rec) {
        for (int i = 0; i < rec; i++) {
            for (int j =1; j <= rec; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    /*
    public void printStarRectangle(int rec){
        for(int j=0; j<=rec; j++) {
           printStar(rec);
        }

     */
    }
    public void gugudan(int dan){
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", dan,i,dan*i);
        }
    }
    public void gugudan(int n1, int n2){
        for(int i=n1; i<=n2; i++){
            gugudan(i);
        }
    }
    public int sum(int n3, int n4){
        int sum= 0;
        for(int i=n3; i<=n4; i++) {
            sum += i;
        }
        return sum;
    }

}
