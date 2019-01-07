import java.util.Scanner;

public class Calendar {

    class Date {
        private int day;
        private int month;
        private int year;
        private int dayOfYear;
        public int getDay() {
            return day;
        }
        public int getMonth() {
            return month;
        }
        public int getYear() {
            return year;
        }
        public void setDay(int Day) {
            day = Day;
        }
        public void setMonth(int Month) {
            month = Month;
        }
        public void setYear(int Year) {
            year = Year;
        }
        public void dayOfYear(Date d1) {
            if (month == 1) {
                // January has 31 days
                dayOfYear = d1.day;
            }
            else if (month == 2) {
                // February has 28 days non leap year
                dayOfYear = d1.day + 31;
            }
            else if (month == 3) {
                // March has 31 days 
                dayOfYear = d1.day + 59;
            }
            else if (month == 4) {
                // April has 30 days
                dayOfYear = d1.day + 90;
            }
            else if (month == 5) {
                // May has 31 days
                dayOfYear = d1.day + 120;
            }
            else if (month == 6) {
                // June has 30 days
                dayOfYear = d1.day + 151;
            }
            else if (month == 7) {
                // July has 31 days
                dayOfYear = d1.day + 181;
            }   
            else if (month == 8) {
                // August has 31 days
                dayOfYear = d1.day + 212;
            }
            else if (month == 9) {
                // September has 30 days
                dayOfYear = d1.day + 243;
            }
            else if (month == 10) {
                // October has 31 days
                dayOfYear = d1.day + 273;
            }
            else if (month == 11) {
                // November has 30 days
                dayOfYear = d1.day + 304;
            }
            else {
                // December has 31 days
                dayOfYear = d1.day + 334;
            }
            if ((year % 4) == 0 && month > 2) {
                // One more day in case of leap year
                dayOfYear += 1;
            }
        }

        public Date() {
            day = 1;
            month = 1;
            year = 2000;
        }

        public Date(int d) {
            day += d;
        }
    
        public Date(int d, int m, int y) {
            day = d;
            month = m;
            year = y;
        }
        
    }

    public void today(int d, int m, int y) {
        //prints todays date
        System.out.print(d + "/" + m + "/" + y);
    }

    public int timeLeft(Date d1, Date d2) {
        //time between two set dates
        if(d1.year > d2.year) {
            if(d1.month > d2.month) {
                return ((d1.year - d2.year)(365) + (d1.dayOfYear - d2.dayOfYear));
            }
            else if(d2.month > d1.month) {
                return ((d1.year - d2.year)(365) + (d2.dayOfYear - d1.dayOfYear));
            }
            else {
               if(d1.day > d2.day) {
                    return ((d1.year - d2.year)(365) + (d1.dayOfYear - d2.dayOfYear));
                }
                else if(d2.day > d1.day) {
                    return ((d1.year - d2.year)(365) + (d1.dayOfYear - d2.dayOfYear));
                }
                else {
                    return ((d1.year - d2.year)(365));
            }
        }
        else if(d2.year > d1.year) {
             if(d1.month > d2.month) {
                return ((d2.year - d1.year)(365) + (d1.dayOfYear - d2.dayOfYear));
            }
            else if(d2.month > d1.month) {
                return ((d2.year - d1.year)(365) + (d2.dayOfYear - d1.dayOfYear));
            }
            else {
               if(d1.day > d2.day) {
                    return ((d2.year - d1.year)(365) + (d1.dayOfYear - d2.dayOfYear));
                }
                else if(d2.day > d1.day) {
                    return ((d2.year - d1.year)(365) + (d2.dayOfYear - d1.dayOfYear));
                }
                else {
                    return ((d2.year - d1.year) * 365);
                }
            }
        }
        else {
            if(d1.month > d2.month) {
                return d1.dayOfYear - d2.dayOfYear;
            }
            else if(d2.month > d1.month) {
                return d2.dayOfYear - d1.dayOfYear;
            }
            else {
               if(d1.day > d2.day) {
                    return d1.dayOfYear - d2.dayOfYear;
                }
                else if(d2.day > d1.day) {
                    return d2.dayOfYear - d1.dayOfYear;
                }
                else {
                    return 0;
                }
            }
        }
    }

    public void future(int n) {
        Date future = new Date(n);
    }

    public void dayOfYear(Date d1) {
        if (d1.month == 1) {
            // January has 31 days
            d1.dayOfYear = d1.day;
        }
        else if (d1.month == 2) {
            // February has 28 days non leap year
            d1.dayOfYear = d1.day + 31;
        }
        else if (d1.month == 3) {
            // March has 31 days 
            d1.dayOfYear = d1.day + 59;
        }
        else if (d1.month == 4) {
            // April has 30 days
            d1.dayOfYear = d1.day + 90;
        }
        else if (d1.month == 5) {
            // May has 31 days
            d1.dayOfYear = d1.day + 120;
        }
        else if (d1.month == 6) {
            // June has 30 days
            d1.dayOfYear = d1.day + 151;
        }
        else if (d1.month == 7) {
            // July has 31 days
            d1.dayOfYear = d1.day + 181;
        }   
        else if (d1.month == 8) {
            // August has 31 days
            d1.dayOfYear = d1.day + 212;
        }
        else if (d1.month == 9) {
            // September has 30 days
            d1.dayOfYear = d1.day + 243;
        }
        else if (d1.month == 10) {
            // October has 31 days
            d1.dayOfYear = d1.day + 273;
        }
        else if (d1.month == 11) {
            // November has 30 days
            d1.dayOfYear = d1.day + 304;
        }
        else {
            // December has 31 days
            d1.dayOfYear = d1.day + 334;
        }
        if ((d1.year % 4) == 0 && d1.month > 2) {
            // One more day in case of leap year
            d1.dayOfYear += 1;
        }
    }
}