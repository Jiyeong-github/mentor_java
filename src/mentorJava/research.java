package mentorJava;

import java.util.Scanner;

public class research {
    /*
    * Scanner input = new Scanner(System.in);
    * String tmp = input.nextLine();
    * 참조 변수를 이용해서 input.nextLine() 부분에서 사용자에게 입력을 받음.
    * 입력을 받은 후 tmp이라는 문자형 변수에 입력 내용이 저장됨.
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String answer = "Y"; //while이 시작될 수 있도록 응답 값을 초기화
        int count = 0;

        while(answer.equals("Y"))//사용자의 응답 검사
        {
            System.out.println("음악을 재생하시겠습니까");
            answer = scanner.nextLine();

            if(answer.equals("Y")){
                System.out.printf("음악을 %d번 재생했습니다 %n", ++count);
            }
        }
        System.out.println("재생 종료");
    }
}
