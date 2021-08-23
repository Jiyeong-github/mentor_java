package mentorJava;

public class overloading {
    //오버로딩은 매개변수의 개수와 타입은 다르지만 이름이 같은 메서드를 여러 개 정의하는 것

    static int sum(int a, int b){
        System.out.println("인자가 둘일 경우 호출");
        return a+b;
    }

    static int sum(int a, int b, int c){
        System.out.println("인자가 셋일 경우 호출");
        return a+b+c;
    }
}
