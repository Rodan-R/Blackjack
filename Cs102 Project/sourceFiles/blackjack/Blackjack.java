package blackjack;

import blackjack.menus.MainMenu;

public class Blackjack {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.displayGameOptionMenu();
    }
}
