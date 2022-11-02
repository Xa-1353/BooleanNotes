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

        System.out.println("  ");

        /*int i=7;
        if(i<10)
            System.out.print("ap ");
        else
            System.out.print("goodbye ");

        System.out.println("  ");*/
        // number 2

        /*int a = 30;
        if(a < 10)
            System.out.println("ap");
        else if (a>10)
            System.out.println("compsci");*/

        /*System.out.println("  ");
        // number 3

        int i=11;
        if (i<10)
            System.out.print("ap ");
        else
            System.out.print("compsci ");*/

        /*System.out.println("  ");
        // number 4
        int b =4;
        if (b < 2)
            System.out.println("fun");
        else if (b < 4)
            System.out.println("jump");
        else if (b < 8)
            System.out.println("three");*/

        /*System.out.println("  ");
        // number 5

        int i=7, j=11;
        if (i<10)
            System.out.print("ap ");
        if (j>10)
            System.out.print("compsci ");
        else
            System.out.print("rox ");*/

        /*System.out.println("  ");
        // number 6

        int c = 5, d = 8;
        if (c < 10 && d > 10)
            System.out.print("ap ");
        System.out.println("compsci");*/

        /*System.out.println("  ");
        // number 7

        int i=7, j=11;
        if (i<10){
            System.out.print("ap ");
            if(j<10)
                System.out.print("compsci ");
            else
                System.out.print("rox ");
        }*/


        System.out.println("  ");
        // number 8

        int e = 7, f = 3;
        if (e > 5 || f > 10);
            System.out.println("ap");
            else if (e>2)
                System.out.println("compsci");
    }
}