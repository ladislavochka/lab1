import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a menu that allows users to select from a list of menu entries.
 * Menu entries can be added, removed, and executed.
 */
public class Menu {
    private final List<MenuEntry> entries = new ArrayList<MenuEntry>(); // List of menu entries
    private boolean isExit = false; // Flag indicating whether the menu should exit
    private final Scanner scanner; // Scanner for user input

    /**
     * Constructs a new menu with default scanner for user input.
     */
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Constructs a new menu with the specified scanner for user input.
     *
     * @param scanner The scanner for user input.
     */
    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Constructs a new menu with the specified list of menu entries and scanner for user input.
     *
     * @param entries The initial list of menu entries.
     * @param scanner The scanner for user input.
     */
    public Menu(List<MenuEntry> entries, Scanner scanner) {
        this.entries.addAll(entries);
        this.scanner = scanner;
    }

    /**
     * Checks if the menu should exit.
     *
     * @return true if the menu should exit, false otherwise.
     */
    public boolean isExit() {
        return isExit;
    }

    /**
     * Sets whether the menu should exit.
     *
     * @param exit true to exit the menu, false to continue.
     */
    public void setExit(boolean exit) {
        this.isExit = exit;
    }

    /**
     * Prints the menu options to the console.
     */
    private void printMenu() {
        for (int i = 0; i < entries.size(); i++) {
            System.out.printf("%s. %s\n", i + 1, entries.get(i).getTitle());
        }
    }

    /**
     * Adds a new menu entry to the end of the menu.
     *
     * @param entry The menu entry to add.
     */
    public void push(MenuEntry entry) {
        entries.add(entry);
    }

    /**
     * Adds a new menu entry at the specified index in the menu.
     *
     * @param index The index at which to add the menu entry.
     * @param entry The menu entry to add.
     */
    public void push(int index, MenuEntry entry) {
        entries.add(index, entry);
    }

    /**
     * Removes the menu entry at the specified index from the menu.
     *
     * @param index The index of the menu entry to remove.
     */
    public void remove(int index) {
        entries.remove(index);
    }

    /**
     * Gets the user's choice from the input scanner.
     * Returns -1 if the input is invalid.
     *
     * @return The user's choice, or -1 if the input is invalid.
     */
    private int getUserChoice(){
        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            return -1;
        }

        int choice = scanner.nextInt() - 1;

        if (choice > entries.size() - 1 || choice < 0) {
            scanner.nextLine();
            return -1;
        }
        return choice;
    }

    /**
     * Runs the menu, allowing users to select and execute menu entries until the exit flag is set.
     */
    public void run() {
        while (!isExit) {
            this.printMenu();
            System.out.printf("Select a menu option [%d-%d]: ", 1, entries.size());

            // check user's input
            int choice = getUserChoice();
            if (choice == -1){
                System.out.println("Invalid input. Please try again.");
                System.out.print("\n\n\n");
                continue;
            }

            MenuEntry entry = entries.get(choice);
            entry.run();
            System.out.print("\n\n\n");
        }
    }
}
