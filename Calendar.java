package by.homework.task9;

public class Calendar {
    public static void main(String[] args) {
        String dmy = nextDay(28, 2, 2019);
        System.out.println(dmy);
    }

    public static String nextDay (int d, int m, int y){
        int highYear = y % 4; //высокосный ли год, если =0, то после 28.02 будет 29.02, а за 29.02 - 01.03, иначе за 28.02 - 01.03
        int day = 0;
        int month = 0;
        int year = 0;
        switch (m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (d == 31){
                    day = 1; month = m + 1; year = y;
                } else {
                    day = d + 1; month = m; year = y;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (d == 30){
                    day = 1; month = m + 1; year = y;
                } else {
                    day = d + 1; month = m; year = y;
                }
                break;
            case 2:
                if (highYear == 0){
                    if (d == 28) {
                        day = 29; month = m; year = y;
                    } else if (d == 29){
                        day = 1; month = 3; year = y;
                    } else if (1 <= d && d <= 27){
                        day = d + 1; month = m; year = y;
                    }
                } else {
                    if (d == 28){
                        day = 1; month = 3; year = y;
                    } else {
                        day = d + 1; month = m; year = y;
                    }
                }
                break;
            case 12:
                if (d == 31){
                    day = 1; month = 1; year = y + 1;
                } else {
                    day = d + 1; month = m; year = y;
                }
                break;
        }
        String DMY = "Сегодня у нас " + d + "." + m + "." + y +"!!!" + "\n" + "А завтра будет: " + day + "." + month + "." + year + " :D";
        return DMY;
    }
}
