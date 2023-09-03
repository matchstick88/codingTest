import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelBook {
    static class DateItem {
        String datetime;

        DateItem(String date) {
            this.datetime = date;
        }
    }

    static class SortByDate implements Comparator<DateItem> {

        @Override
        public int compare(DateItem a, DateItem b) {
            return a.datetime.compareTo(b.datetime);
        }
    }

    public int solution(String[][] book_times) throws Exception {
        int answer = 1;
        Date[] date_times = new Date[book_times.length];

//        System.out.println(book_time);
        System.out.println(Arrays.deepToString(book_times));
        List<String[]> bookList = new ArrayList<>();
        bookList = Arrays.stream(book_times).toList();

        Arrays.sort(book_times, (a, b) -> a[0].compareTo(b[0]));
        System.out.println(Arrays.deepToString(book_times));
        Arrays.sort(book_times, (a, b) -> a[1].compareTo(b[1]));
        System.out.println(Arrays.deepToString(book_times));

//        SimpleDateFormat format = new SimpleDateFormat("HH:mm"); //24시간, 분
//        for(String[] book_time : book_times) {
//            try {
//                Calendar calendar = Calendar.getInstance();
//                calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(book_time[0].split(":")[0]));
//                calendar.set(Calendar.MINUTE, Integer.parseInt(book_time[0].split(":")[1]));
//                calendar.set(Calendar.SECOND, 0);
//                calendar.set(Calendar.MILLISECOND, 0);
//                Date date = calendar.getTime();
////                System.out.println(date);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println(Arrays.deepToString(book_time));
//        }

        return answer;
    }


}
