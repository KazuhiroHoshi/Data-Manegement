class Die{
    private int faceValue;

    public int getfaceValue(){
	return faceValue;
    }
    public void roll(){
	faceValue=(int)(Math.random()*6)+1;
    }

}

class Player{
    private String name;
    public Player(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }
}

public class DiceGame{
    void play(){
    Player  p=new Player("John");
    Die die1=new Die();
    Die die2=new Die();
    System.out.println("What is your name");
    System.out.println("> "+p.getName());
    System.out.println("Hello, "+p.getName()+"!");
    System.out.println("Rolling the dice...");
    die1.roll();
    die2.roll();
    System.out.println("Die 1: "+die1.getfaceValue());
    System.out.println("Die 2: "+die2.getfaceValue());
    System.out.println("Total Value : "+(die1.getfaceValue()+die2.getfaceValue()));

}

    public static void main(String args[]){
	DiceGame dg = new DiceGame();
	dg.play();

    }
}





