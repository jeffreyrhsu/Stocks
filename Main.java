import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Stocks");
    System.out.println("How much money do you have? ");
    double origMoney = reader.nextDouble();

    System.out.println("Which stock would you like to purchase? 1.Apple 2.Tesla 3.Random Stock");
    int userChoice = reader.nextInt();
    //Random ran = new Random();
    double newMoney = 0.0;
    if(userChoice == 1){
      origMoney -= 108.86;
      double change = (Math.random() * (100-50)-50);
      newMoney = origMoney + change;
      System.out.println("New Money: " + newMoney);


    }
    else if(userChoice == 2){
      origMoney -= 388.04;
      double change = (Math.random() * (100-50)-50);
      newMoney = origMoney + change;
      System.out.println("New Money:" + newMoney);

    }

    else if(userChoice == 3){
      origMoney -= 80;
      double change = (Math.random() * (100-50)-50);
      newMoney = origMoney + change;
      System.out.println("New Money: " + newMoney);

    }

  }
}