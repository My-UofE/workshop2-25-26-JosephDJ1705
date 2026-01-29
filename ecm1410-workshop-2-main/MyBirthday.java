// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = 2; 
        int currentDate = 7; 
        int myBirthdayDate = 23; 

        // value below is a constant
        final int DAYS_A_WEEK = 7; 

        int daystobirthday = myBirthdayDate - currentDate;
        System.out.println("Days to birthday from current date: " + daystobirthday);

        // second task
        int dayofthebirthday = (currentDay + daystobirthday) % DAYS_A_WEEK;
        System.out.println("the day of the week on which the birthday falls is: " + dayofthebirthday);
    }
}