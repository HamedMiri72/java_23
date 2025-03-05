package class_13_stringmethods.com;

public class Main {
    public static void main(String[] args){

        String name = "    Bro code    ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastINdex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim(); //space before and after will be taken
        name = name.replace("o", "a");

        /*
        if(name.isEmpty()){
            System.out.println("tour name is empty");
        }else{
            System.out.println("hello " + name);
        }
         */

        /*
        if(name.contains(" ")){
            System.out.println("your name contain spaces!");
        }else{
            System.out.println("your name dosent contain any spaces!");
        }

         */

        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
        }else{
            System.out.println("hello"+ name);
        }





        System.out.println(name);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastINdex);
    }
}
