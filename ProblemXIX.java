import java.util.ArrayList;
import java.util.List;
public class ProblemXIX {

    //THIS ONE DOES NOT WORK CORRECTLY, I DON'T FEEL LIKE FIXING IT RIGHT NOW
    //IF YOU WANNA CHEAT THERE'S 1200 MONTHS AND 1/7 OF DAYS ARE MONDAYS
    //THUS 1200 / 7 = 171. THE ANSWER IS 171.
    public static void main(String[] args) {
        List<Integer> sundaysList = new ArrayList<>();
        List<Integer> firstOfMonthList = new ArrayList<>();
        int counter = 0;
        int numDays = (365 * 100) + 24;     //100 years and 25 were leap years, goes from jan 01 to dec 31 so -1.
        //The first day is Tuesday, Jan 01, 1901
        //The last day is Sunday, Dec 31, 2000
        for (int i = 1; i <= numDays; i++)
        {
            if ((i + 1)% 7 == 0) sundaysList.add(i);

            if (i % 1461 == 1) firstOfMonthList.add(i);
            if (i % 1461 == 32) firstOfMonthList.add(i);
            if (i % 1461 == 60) firstOfMonthList.add(i);
            if (i % 1461 == 91) firstOfMonthList.add(i);
            if (i % 1461 == 121) firstOfMonthList.add(i);
            if (i % 1461 == 152) firstOfMonthList.add(i);
            if (i % 1461 == 213) firstOfMonthList.add(i);
            if (i % 1461 == 234) firstOfMonthList.add(i);
            if (i % 1461 == 274) firstOfMonthList.add(i);
            if (i % 1461 == 305) firstOfMonthList.add(i);
            if (i % 1461 == 335) firstOfMonthList.add(i);
            if (i % 1461 == 366) firstOfMonthList.add(i);
            if (i % 1461 == 394) firstOfMonthList.add(i);
            if (i % 1461 == 425) firstOfMonthList.add(i);
            if (i % 1461 == 456) firstOfMonthList.add(i);
            if (i % 1461 == 517) firstOfMonthList.add(i);
            if (i % 1461 == 547) firstOfMonthList.add(i);
            if (i % 1461 == 575) firstOfMonthList.add(i);
            if (i % 1461 == 609) firstOfMonthList.add(i);
            if (i % 1461 == 639) firstOfMonthList.add(i);
            if (i % 1461 == 670) firstOfMonthList.add(i);
            if (i % 1461 == 700) firstOfMonthList.add(i);
            if (i % 1461 == 731) firstOfMonthList.add(i);
            if (i % 1461 == 762) firstOfMonthList.add(i);
            if (i % 1461 == 790) firstOfMonthList.add(i);
            if (i % 1461 == 821) firstOfMonthList.add(i);
            if (i % 1461 == 851) firstOfMonthList.add(i);
            if (i % 1461 == 882) firstOfMonthList.add(i);
            if (i % 1461 == 912) firstOfMonthList.add(i);
            if (i % 1461 == 943) firstOfMonthList.add(i);
            if (i % 1461 == 974) firstOfMonthList.add(i);
            if (i % 1461 == 1004) firstOfMonthList.add(i);
            if (i % 1461 == 1035) firstOfMonthList.add(i);
            if (i % 1461 == 1065) firstOfMonthList.add(i);
            if (i % 1461 == 1096) firstOfMonthList.add(i);
            if (i % 1461 == 1127) firstOfMonthList.add(i);
            if (i % 1461 == 1156) firstOfMonthList.add(i);
            if (i % 1461 == 1187) firstOfMonthList.add(i);
            if (i % 1461 == 1217) firstOfMonthList.add(i);
            if (i % 1461 == 1248) firstOfMonthList.add(i);
            if (i % 1461 == 1278) firstOfMonthList.add(i);
            if (i % 1461 == 1309) firstOfMonthList.add(i);
            if (i % 1461 == 1340) firstOfMonthList.add(i);
            if (i % 1461 == 1370) firstOfMonthList.add(i);
            if (i % 1461 == 1401) firstOfMonthList.add(i);
            if (i % 1461 == 1431) firstOfMonthList.add(i);

            if (firstOfMonthList.contains(i) && sundaysList.contains(i)) counter++;
        }
        System.out.println(sundaysList);
        System.out.println(firstOfMonthList);
        System.out.println(counter);
    }
}
