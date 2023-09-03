import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Expire {
    static final SimpleDateFormat format2 = new SimpleDateFormat("yyyy.MM.dd");
    //today "2022.05.19"
    //terms ["A 6", "B 12", "C 3"]
    //privacies ["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
//    public int[] solution(String[] terms, String[] privacies) throws ParseException {
//        String today;
//        return this.solution(today, terms, privacies);
//    }
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {

        List<Integer> result = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date date = format.parse(today); // date 형식

        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            termsMap.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date); //today
        for (int i = 0; i < privacies.length; i++) {
            Date startDate = format.parse(privacies[i].split("\\s")[0]);
            int validMonth = termsMap.get(privacies[i].split(" ")[1]);

            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(startDate);
//            System.out.println("beforeDate: " + format.format(cal2.getTime()));
            cal2.add(Calendar.MONTH, validMonth);   //end day
//            System.out.println("afterDate: " + format.format(cal2.getTime()));

            if (cal2.compareTo(cal1) <= 0) {
                result.add(i+1);
            }
        }
        //result must be [1, 3]
        return result.stream().mapToInt(i -> i).toArray();
    }
}