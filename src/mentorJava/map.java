package mentorJava;

import java.util.HashMap;
import java.util.Scanner;

public class map {
    //map 인터페이스는 키와 값을 쌍으로 저장하는 구조
    /*메서드:
    *boolean containsKey(Object key) - 해당 키가 있는지 여부 반환
    *boolean containsValue(Object value) - 해당 값이 있는지 여부 반환
    * V get(Object key) - 해당 key와 쌍인 값을 반환
    * boolean isEmpty() - 맵 객체에 요소가 없는지 판단
    * Set<key> keySet() - 키들을 Set 형태로 반환
    * V put(K key, V value) - 키와 값을 요소로 추가
    * V remove(Object key) - 이 키를 가진 요소를 제거
    * int size() - 전체 요소의 개수를 반환
    * */

    public static void main(String[] args){
        HashMap hm = new HashMap();
        Scanner sc = new Scanner(System.in);

        hm.put("apple","manzana");
        hm.put("paper","papier");
        hm.put("flower","flor");
        String voca;

        System.out.println("vocabulary");
        voca = sc.nextLine();

        if(hm.containsKey(voca)){
            System.out.println("meaning:"+hm.get(voca));
        }else{
            System.out.println("there's nothing like that in this database");
        }
    }
}
