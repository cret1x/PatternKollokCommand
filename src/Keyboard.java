import java.util.HashMap;

public class Calculator {
    private final HashMap<String, IButtonCommand> mapping = new HashMap<>();

    public void register(String button, IButtonCommand command) {
        mapping.put(button, command);
    }

    public void execute(String button) {
        IButtonCommand command = mapping.get(button);
        if (command != null) {
            command.execute();
        }
    }
}
