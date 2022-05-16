package ejerciciosGenerales;

/**
 *
 * @author Elian Briones
 */
public class Main {
    public static void main(String[] args) {
        // EX1 - Ball
        Ball b1, b2, b3;
        b1 = new Ball("Maradona");
        b2 = new Ball("Romario");
        b3 = b1;
        b1.blowUp(10);
        b1.blowUp(10);
        b2.blowUp(5);
        b2.blowUp(5);
        b3.blowUp(10);
        System.out.println(b1.bounce());
        System.out.println(b2.bounce());
        b1.deflate(5);
        b2.deflate(16);
        System.out.println();
        System.out.println("Un rato mas tarde...");
        System.out.println(b1.bounce());
        System.out.println(b2.bounce());
        System.out.println(b3.bounce());
        
        //EX2a - Elevator
        Elevator e1, e2;
        e1 = new Elevator(0, 10);
        e2 = e1;
        e1.goTo(6);
        e2.goDown();
        e1 = new Elevator(-1, e1.getMaximumFloor()/ 2);
        
        e1.goTo(e2.getCurrentFloor());
        e1.goUp();
        e2.goDown();
        System.out.println("Elevator 1 is on the floor nº: " + e1.getCurrentFloor());
        System.out.println("Elevator 2 is on the floor nº: " + e2.getCurrentFloor());
        
        //EX2b - Elevator
        Elevator e3;
        e1 = new Elevator(10, 20);
        e3 = e1;
        e2 = new Elevator(e3.getCurrentFloor() / 2, e1.getMinimumFloor());
        e3.goUp();
        e2.goTo(e1.getCurrentFloor());
        e3 = e2;
        e2 = new Elevator(e3.getMinimumFloor() - 1, e2.getMaximumFloor());
        System.out.println(e1.getCurrentFloor() + e2.getCurrentFloor() + e3.getCurrentFloor());
        
        //EX3 - CurrentAccount
        CurrentAccount ca = new CurrentAccount(500, 200, "", 0);
        CurrentAccount ca2 = new CurrentAccount(500, 400, "", 0);
        CurrentAccount ca3 = new CurrentAccount(600, 600, "", 0);
        CurrentAccount ca4 = new CurrentAccount(800, 700, "", 0);
        CurrentAccount ca5 = new CurrentAccount(0, 1000, "Elian", 10);
        CurrentAccount ca6 = new CurrentAccount(0, 1200, "Andreu", 20);
        CurrentAccount ca7 = new CurrentAccount(0, 1500, "Didac", 30);
        
        // Match same balance for 2 accounts
        ca.matchBalance(ca, ca2);
        
        // Check if 3 accounts have same balance
        System.out.println(ca.isSameBalance(ca, ca2, ca3));
        
        // Adding interests for an existing account
        ca4.giveInterests(ca4, 5);
        
        // Give random money between 100 and 200
        ca5.depositRandomMoney();
        ca6.depositRandomMoney();
        ca7.depositRandomMoney();
        
        // Take random account. Use 'CurrentAccount.method()' if method is STATIC.
        CurrentAccount winnerAccount = CurrentAccount.rollTheDice(ca5, ca6, ca7);
        winnerAccount.giveInterests(winnerAccount, 10);
        System.out.println("Winner: " + winnerAccount.toString());
        
        CurrentAccount loserAccount = CurrentAccount.rollTheDice(ca5, ca6, ca7);
        loserAccount.withdrawal(150);
        System.out.println("Loser: " + loserAccount.toString());
        
        // Create a new account registered by user
        CurrentAccount newAccount = new CurrentAccount().createAccount();
        System.out.println(newAccount.toString());
        
        
        // EX4 - Ticket and Raffle
        
        // Create 3 tickets and set their 3 numbers for each number
        Ticket t1 = new Ticket("Juan");
        Ticket t2 = new Ticket("Maria");
        Ticket t3 = new Ticket("Carla");
        
        t1.setPriNum(17);
        t1.setSegNum(23);
        t1.setTerNum(45);
        
        t2.setPriNum(12);
        t2.setSegNum(33);
        t2.setTerNum(49);
        
        t3.setPriNum(6);
        t3.setSegNum(17);
        t3.setTerNum(35);
        
        // Make validation for these 3 tickets
        t1.validate(17, 23, 45);
        t2.validate(12, 33, 49);
        t3.validate(6, 17, 35);
        
        //Create a new raffle with 49 balls. (Give negative balls to create a default raffle with 49 ball)
        Raffle r1 = new Raffle(-1);
        int firstBall = r1.takeBall();
        int secondBall = r1.takeBall();
        int thirdBall = r1.takeBall();
        
        System.out.println(t1.getOwnerName() + " had " + t1.countRightGuesses(firstBall, secondBall, thirdBall) + " guesses");
        System.out.println(t2.getOwnerName() + " had " + t2.countRightGuesses(firstBall, secondBall, thirdBall) + " guesses");
        System.out.println(t3.getOwnerName() + " had " + t3.countRightGuesses(firstBall, secondBall, thirdBall) + " guesses");
    }
}
