import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        HotelBook hb = new HotelBook();
        String[][] book_time = {
                {"15:00", "17:00"},
                {"16:40", "18:20"},
                {"14:20", "15:20"},
                {"14:10", "19:20"},
                {"18:20", "21:20"}};

        hb.solution(book_time);



        Expire expire = new Expire();
        String args1 = "2020.01.01";
        String[] args2 = {"Z 3", "D 5"};
        String[] args3 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] result = expire.solution(args1, args2, args3);

        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}