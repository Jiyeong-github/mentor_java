package mentorJava;

import java.util.Arrays;

public class array {
    /*
    * 타입[] 배열 이름 = new 타입[] {요소 1, 요소 2, 요소 3, 요소 4};
    * int[] ar = null;
    * ar = new int[]{1,2,3}; //new 타입[] 생략 가능
    * 타입[] 배열 이름 = {요소 1, 요소 2, 요소 3, 요소 4};
    * */
    public static void main(String[] args){
        //길이가 5인 배열 생성, 배열 길이 생략
        int[] a = new int[]{10,20,4,25,18};

        //길이가 7인 배열 생성, new int[] 생략 가능
        int[] b = {1,2,3,4,5,6,7};

        //for문으로 배열 초기화
        int[] c = new int[10];
        for(int i=0; i<c.length; i++){
            c[i] = i;
        }

        //for문을 이용한 출력
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }

        System.out.println("");
        System.out.println(Arrays.toString(c));
        //Arrays.toString() 메서드 사용
    }
}

/*
* 배열의 복사
* System.arraycopy(src, srcPos, dest, destPos, length);
* src는 복사할 배열 srcPos 복사 시작할 인덱스 dest 덮어 쓸 배열 destPos 덮어 쓰기 시작항 인덱스 length
* foreach : for(배열의 타입 변수 이름: 배열 이름){//실행 구문}*/