public class Coins{
    private int cents;

    public Coins(int cents){
        this.cents = cents;
    }

    public void calculate(){
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int buffervalue = cents;
        quarters = buffervalue / 25;
        buffervalue -= quarters * 25;
        dimes = buffervalue / 10;
        buffervalue -= dimes * 10;
        nickels = buffervalue / 5;
        buffervalue -= nickels * 5;
        pennies = buffervalue;
        System.out.println(cents + " cents:\n" + quarters + " Quarter(s)\n"+ dimes + " Dime(s)\n"+ nickels + " Nickel(s)\n"+ pennies + " Penny(s)\n");
    }
}