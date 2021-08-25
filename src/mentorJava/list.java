package mentorJava;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class list {
    /*ArrayList - 요소를 추가하면 0번 인덱스부터 차례대로 요소가 저장됨.
    *LinkedList List 인터페이스를 구현합면서 Queue 인터페이스도 함께 구현.
    *  */
    public static void main(String[] args){
        ArrayList list = new ArrayList(10);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("initial:");
        System.out.println(list);

        list.add(1,"bb");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(2));
    }
}
