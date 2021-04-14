import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month of your Birth date");
        int month = sc.nextInt();
        System.out.println("Enter the day of your Birth date2");
        int day = sc.nextInt();

        if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
            System.out.println("Capricorn");
            System.out.println("You are humble and open minded");
        } else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17)) {
            System.out.println("Aquarius");
            System.out.println("You are Different and Unique person");
        } else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19)) {
            System.out.println("Pisces");
            System.out.println();
        } else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
            System.out.println("Aries");
            System.out.println("You are Brave and Strong");
        } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
            System.out.println("Taurus");
            System.out.println("You are calm and cool");
        } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("Gemini");
            System.out.println("You are smart and talkative");

        } else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
            System.out.println("Cancer");
            System.out.println("you are nurturing and Caring");

        } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
            System.out.println("Leo");
            System.out.println("You are loyal and warm");
        }
        else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
            System.out.println("Virgo");
            System.out.println();
        }
        else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
            System.out.println("Libra");
            System.out.println("You are Friendly and classy");
        }
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)){
            System.out.println("Scorpio");
            System.out.println("You are mysterious and deep");
    }
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
            System.out.println("Sagittarius");
            System.out.println("You are Funny and Open Minded");
        }
        else
            System.out.println("Illegal date");

    }

}
