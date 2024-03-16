package blackjack.menus;

public class MainMenu {
    public void display() {
        System.out.println("==== Start Menu ====");
        System.out.println("1. Single Player");
        System.out.println("2. Multiplayer");
        System.out.println("3. Read Rules");
        System.out.println("4. End Program");
        System.out.print("Please enter your choice:");
    }

    public void displayGameOptionMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    SinglePlayerMenu singlePlayer = new SinglePlayerMenu();
                    singlePlayer.displaySingleGameMenu();
                    break;
                case 2:
                    // System.out.print("Please enter your name: ");
                    // String name = sc.nextLine();
                    // startMultiplayerGame(name);
                    break;
                case 3:
                    displayRules();
                    break;
                case 4:
                    System.out.println("Thank you for playing, see you again!");
                    break;
                default:
                    System.out.println("Please enter a choice between 1 and 4.\n");
            }
        } while (choice != 1 && choice != 4);
        sc.close();
    }
}