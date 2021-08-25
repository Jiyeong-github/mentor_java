package mentorJava;

import java.util.Calendar;

public class calendar {
    //get() 메서드로 정보 가져오기 - 반환 타입이 int형, *월 반환 시 실제 월보다 1이 작은 값이 반환됨*

    public static void main(String[] args){
        Calendar a = Calendar.getInstance();

        int year = a.get(Calendar.YEAR);
        int month = a.get(Calendar.MONTH);
        int date = a.get(Calendar.DATE);

        System.out.println(year+month+date);
        System.out.println(a.get(Calendar.DAY_OF_WEEK));
        // 1 = sunday, 2 = monday, 7 = saturday
        System.out.println(a.get(Calendar.DAY_OF_YEAR));
        System.out.println(a.getActualMaximum(Calendar.DATE));
    }
}
