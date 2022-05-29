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
    }
}
