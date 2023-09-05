import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelBook {
    public int solution(String[][] book_times) {

        Arrays.sort(book_times, (a, b) -> a[0].compareTo(b[0]));
        List<Integer> rooms = new ArrayList<>();
        for (String[] book_time : book_times) {
            boolean not_change = true;
            Integer startTime = Integer.parseInt(book_time[0].split(":")[0]) * 60 + Integer.parseInt(book_time[0].split(":")[1]);
            Integer endTime = Integer.parseInt(book_time[1].split(":")[0]) * 60 + Integer.parseInt(book_time[1].split(":")[1]) + 10;
            if (rooms.size() < 1) {
                rooms.add(endTime);
            } else {
                for (int i = 0; i < rooms.size(); i++) {
                    if (rooms.get(i) <= startTime) {
                        rooms.set(i, endTime);
                        not_change = false;
                        break;
                    }
                }
                if (not_change)
                    rooms.add(endTime);
            }
        }
//        System.out.println(book_time);
//        System.out.println(Arrays.deepToString(book_times));
//        List<String[]> bookList = new ArrayList<>();


//        bookList = Arrays.stream(book_times).toList();


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

        return rooms.size();
    }


}
