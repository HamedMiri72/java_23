package class16_ternartOperator.com;

public class Main {

    public static void main(String[] args){


        int score = 70;
//
//        if(score >= 60){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAILED");
//        }


        String passOrFail = (score >= 60) ? "PASS" : "FAILED";
        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(timeOfDay);

        int income = 60000;

        double taxRate = (income >= 4000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
