package mentorJava;

public class bit {
    /*비트 연산자는 개발자가 직접 비트를 조작할 수 있는 연산자.
    연산하는 수를 이진수로 표현했을 때 규칙에 따라 알맞은 결과 반환
    & | ^ ~(부정)
     */
    public static void main(String[] args){
        int a = 15;
        int b = 5;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);

        System.out.println(a>>2);
        System.out.println(b<<4);
    }
}
