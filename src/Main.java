import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // STEP 1
        String firstName = "Qui-Gon";
        String lastName = "Jinn";
        String bornYear = "80 BBY";
        String homeworld = "Coruscant";
        double height = 1.93 * 3.28084;
        double weight = 200;

        // STEP 2
        double purse = 150.0;
        purse = purse - 24.3;
        purse = purse - 45;
        purse = purse * 2;
        purse = purse - (purse * .1);
        System.out.println(purse);

        // STEP 3
        String handleColor = "blue";
        String bladeColor = "purple";
        if(handleColor == "black" && bladeColor == "purple") {
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass.");
        }

        String shipName = "Millenium Falcon";
        if(shipName == "Millenium Falcon") {
            System.out.println("Let's go.");
        } else {
            System.out.println("I better hide somewhere.");
        }

        double itemCost = 3.00;
        boolean isRecommendedItem = true;
        double drinkCost = 10.00;
        int drinkSize = 36;
        if(itemCost < 5 && isRecommendedItem) System.out.println("I will order this.");
        if(drinkCost < 1 || drinkSize > 24) System.out.println("I shall add this to my order.");

//        fizzBuzz100switch();
//        greeting("Jeddy");
//        System.out.println(add(1, 2));
//        System.out.println(faveColorFinder("red"));
//        System.out.println(thatsOdd(6));
//        int[] values = {100, 101, 1};
//        System.out.println(Arrays.toString(values));
//        System.out.println(Arrays.toString(bigOrSmall(values)));
    }


    // STEP 4
    /*
        FizzBuzz checks every number between 1 and 100.
        If the number is divisible by 3, print "fizz".
        If the number is divisible by 5, print "buzz".
        If the number is divisible by 3 and 5 (or 15), print "fizzbuzz".
        Print the number otherwise.
    */
    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            /*
                The bug is here, if the number is both divisible by 3 and 5,
                it'll never check out because this needs to be first.
             */
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
    }

    /*
        Rewriting the above function as a switch statement...
    */
    private static void fizzBuzz100switch() {
        for(int i = 1; i <= 100; i++) {
            switch(i % 15) {
                case 0:
                    System.out.print("fizzbuzz");
                    break;
                // Add multiple cases to check if the number is divisible by 3.
                // You only need to do it while i < 15, all subsequent numbers will repeat remainders.
                case 3: case 6: case 9:
                case 12:
                    System.out.print("fizz");
                    break;
                // Same as above but with multiples of 5.
                case 5: case 10:
                    System.out.print("buzz");
                    break;
                default:
                    System.out.print(i);
                    break;
            }
        }
    }

    // STEP 5
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    public static void greeting(String name) {
        String formattedGreeting = String.format("Hello, %s", name);
        System.out.println(formattedGreeting);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String faveColorFinder(String color) {
        switch(color) {
            case "red":
                return "red is a great color";
            case "green":
                return "green is a solid favorite color";
            case "black":
                return "so trendy";
            default:
                return "you need to evaluate your favorite color choice";
        }
    }

    public static String thatsOdd(int num) {
        if(num % 2 == 0) return "That's not odd!";
        else return "That's odd indeed!";
    }

    public static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 100) {
                answers[i] = "big";
            } else {
                answers[i] = "small";
            }
        }

        return answers;
    }
}
