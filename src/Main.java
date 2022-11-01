public class Main {
    public static void main(String[] args) {


/*

        if () {

        }
        relational operators
        <
        >
        <=
        >=
        ==      "the same as"
        !=

*/

        double fuelLevel=.5;

        if(fuelLevel < .25)
            System.out.println("stop for gas");

        double walmartPrice = 2.95, chevronPrice = 3.15;

        if (walmartPrice < chevronPrice) {
            System.out.println("stop at walmart");
        } else

            System.out.println("stop at chevron");

        String craving = "";

        if(craving.equals("mcnuggies")){
            System.out.println("McD");
        }   else if (craving.equals("real chicken")){
            System.out.println("chik-fil-a");
        }   else if(craving.equals("whopper")){
            System.out.println("BK");
        }   else {      //else does not get any more conditions
            System.out.println("waffle house");
        }
    }
}