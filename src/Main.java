import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TEUS;
        System.out.println(weekDay);

        //Two methods we can use in the Enum
        // name(), ordinal()
        System.out.printf("Day of the week is %s, its ordinal value is %s%n", weekDay.name(), weekDay.ordinal());


        //getRandom() ->
        System.out.printf("%20s %n", "getRandom()");
        for (int i = 1; i <= 7; i++){
            weekDay = getRandomDay();
            System.out.printf("Day of the week is %s %n", weekDay);

            if (weekDay == DayOfTheWeek.FRI){
                System.out.println("-".repeat(5));
                System.out.println("TGIF!");
                System.out.println("-".repeat(5));
            }
            if (weekDay == DayOfTheWeek.SUN){
                System.out.println("-".repeat(5));
                System.out.println("Seeing Father Today! Plus It's Match-day :)");
                System.out.println("-".repeat(5));
            }
        }
        System.out.println("-".repeat(25));
        System.out.println("-".repeat(25));
        System.out.println("-".repeat(25));
        System.out.printf("%20s %n", "switchDayOfTheWeek()");


        //switchDayOfTheWeek() ->
        for (int i = 1; i <= 7; i++){
            weekDay = getRandomDay();

            switchDayOfTheWeek(weekDay);
        }

        System.out.println("-".repeat(26));
        System.out.printf("-".repeat(26) + "%n");
        System.out.println("-".repeat(26));

        System.out.printf("%20s %n", "Toppings");
        for (Toppings topping : Toppings.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDaysOfTheWeek = DayOfTheWeek.values(); //gettign the values and storing them in an Array of DayOfTheWeek

        return allDaysOfTheWeek[randomInteger]; // the randomInteger being our index, get the element at the index for each call.
    }

    private static void switchDayOfTheWeek(DayOfTheWeek weekday){
        int weekDayIntegerRep = weekday.ordinal() + 1; //so day 0 becomes day 1, and so on...

        switch (weekday){
            case WED -> System.out.printf("Wednesday is day %s %n", weekDayIntegerRep);
            case SAT -> System.out.printf("Saturday is day %s %n", weekDayIntegerRep);

            default -> System.out.printf(weekday.name().charAt(0) + weekday.name().substring(1).toLowerCase() + "day is day %s %n", weekDayIntegerRep);
        }
    }
}
