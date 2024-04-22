//Display the number of days in the month for all the months in the year
// if the months having the same number of days, it must be print together using switch case
package basics.practice;

public class DaysInMonth {
    public static void main(String[] args) {
        for (int month = 1; month <= 12; month++) {
            int daysInMonth;
            String monthName;

            switch (month) {
                case 1:
                    monthName = "January";
                    daysInMonth = 31;
                    break;
                case 2:
                    monthName = "February";
                    daysInMonth = 28;
                    break;
                case 3:
                    monthName = "March";
                    daysInMonth = 31;
                    break;
                case 4:
                    monthName = "April";
                    daysInMonth = 30;
                    break;
                case 5:
                    monthName = "May";
                    daysInMonth = 31;
                    break;
                case 6:
                    monthName = "June";
                    daysInMonth = 30;
                    break;
                case 7:
                    monthName = "July";
                    daysInMonth = 31;
                    break;
                case 8:
                    monthName = "August";
                    daysInMonth = 31;
                    break;
                case 9:
                    monthName = "September";
                    daysInMonth = 30;
                    break;
                case 10:
                    monthName = "October";
                    daysInMonth = 31;
                    break;
                case 11:
                    monthName = "November";
                    daysInMonth = 30;
                    break;
                case 12:
                    monthName = "December";
                    daysInMonth = 31;
                    break;
                default:
                    monthName = "Invalid";
                    daysInMonth = 0;
            }
            System.out.println(monthName + " has " + daysInMonth + " days.");
        }
    }
}
