/**
 * Represents an entry in a menu, providing a title and functionality when invoked.
 * This is an abstract class and should be extended to define specific menu actions.
 *
 * <h2>Usage Example:</h2>
 * To create a new menu entry for exiting the menu:
 * <pre>{@code
 * new MenuEntry("Exit") {
 *     @Override
 *     public void run() {
 *         // Implement functionality
 *         somefunction()
 *     }
 * }
 * }</pre>
 */
public abstract class MenuEntry {

    private String title;

    public MenuEntry(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void run();
}
