import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = user.nextLine();

        if (userName.equals("Ella")) {
            System.out.println("Welcome to the shop " + userName);
            System.out.println("Enter your email: ");
            String email = user.nextLine();
            if (email.equals("ella@mail.com")) {
                System.out.println("Your email " + email + " is correct!");
            } else {
                System.out.println("Incorrect email!");
            }
            double userBalance = 10d;
            if (userBalance == 10d) {
                System.out.println("Your current balance is " + userBalance + " euros!");
            } else {
                System.out.println("Not enough money to buy products!");
            }

        } else {
            System.out.println("User not found");
        }

            Scanner product = new Scanner(System.in);
            System.out.println("Choose products: ");
            String productName = product.nextLine();

            if (productName.equals("apples")) {
                System.out.println("How many apples do you want?");
                Integer availableAmount = product.nextInt();
                float productPrice = 0.50f;
                if (availableAmount <= 5) {
                    System.out.println("You choose " + availableAmount + " " + productName + '.');
                    System.out.println("The total sum of " + productName + " is " + productPrice * availableAmount + " euros");
                    double userBalance = 10d;
                    if (userBalance == 10d) {
                        System.out.println("Your balance now is " + (userBalance - productPrice * availableAmount) + " euros!");
                    } else {
                        System.out.println("Not enough money to buy products!");
                    }
                } else {
                    System.out.println("Sorry, we don't have that many " + productName);
                }
            } else {
                System.out.println("Sorry, we don't have what you're looking for!");
            }
        }
    }
