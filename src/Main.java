import menu.Menu;
import menu.MenuEntry;
import tasks.First;
import tasks.Fourth;
import tasks.Second;
import tasks.Third;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<MenuEntry> entries = getTasks();

        Menu menu = new Menu(entries, new Scanner(System.in));

        menu.push(new MenuEntry("Вийти") {
            @Override
            public void run() {
                menu.setExit(true);
            }
        });

        menu.run();
    }

    private static ArrayList<MenuEntry> getTasks() {
        ArrayList<MenuEntry> entries = new ArrayList<MenuEntry>();

        entries.add(new MenuEntry("Перше завдання") {
            @Override
            public void run() {
                First first = new First();
                first.runTask();
            }
        });

        entries.add(new MenuEntry("Друге завдання") {
            @Override
            public void run() {
                Second second = new Second();
                second.runTask();
            }
        });

        entries.add(new MenuEntry("Третє завдання") {
            @Override
            public void run() {
                Third third = new Third();
                third.RunTask();
            }
        });

        entries.add(new MenuEntry("Четверте завдання") {
            @Override
            public void run() {
                Fourth fourth = new Fourth();
                fourth.runTask();
            }
        });

        return entries;
    }
}
