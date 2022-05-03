package introductions;

import java.time.LocalDate;

/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as
 * YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 * <p>
 * Example
 * <p>
 * <p>
 * <p>
 * The method should return  as the day on that date.
 * <p>
 * image
 * <p>
 * Function Description
 * <p>
 * Complete the findDay function in the editor below.
 * <p>
 * findDay has the following parameters:
 * <p>
 * int: month
 * int: day
 * int: year
 * Returns
 * <p>
 * string: the day of the week in capital letters
 * Input Format
 * <p>
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 * <p>
 * Constraints
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * Sample Output
 * <p>
 * WEDNESDAY
 * Explanation
 * <p>
 * The day on August th  was WEDNESDAY.
 */
public class Q001JavaDateTime {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        System.out.println(findDay(9, 5, 1989));
    }
}
