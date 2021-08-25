package mentorJava;

import java.util.Calendar;

public class leftdays {

    public static void main(String[] args){
        Calendar today = Calendar.getInstance();
        Calendar endOfYear = Calendar.getInstance();
        Calendar Christmas = Calendar.getInstance();

        endOfYear.set(Calendar.MONTH,7);
        endOfYear.set(Calendar.DATE,31);
        long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis();
        System.out.println("days left:"+diff/(24*60*60*1000)+"days");

        Christmas.set(2021,12,25);
        diff = Christmas.getTimeInMillis() - today.getTimeInMillis();
        System.out.println("Days till Christmas:"+diff/(24*60*60*1000)+"days");
    }
}
