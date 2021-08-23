package mentorJava;

class A{}
class B extends A{}

public class instance {
/*
* instanceof 연산자는 객체의 타입을 확인하는 연산자
* 주로 조건문에서 사용. 참조변수 instanceof 클래스명 -> true or false
* */

    public static void main(String[] args){
        A a = new A();
        B b = new B();

        System.out.println("a instance of A:"+(a instanceof A));
        System.out.println("b instance of A:"+(b instanceof A));
        System.out.println("a instance of B:"+(a instanceof B));
        System.out.println("b instance of B:"+(b instanceof B));
    }
}
