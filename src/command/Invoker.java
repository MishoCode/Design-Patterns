package command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {
    private Map<String, Command> commands = new HashMap<>();
    private UniversitySystem receiver;

    private void initializeCommands() {
        commands.put("add", new AddCommand(receiver));
        commands.put("print", new PrintCommand(receiver));
        commands.put("remove", new RemoveCommand(receiver));
    }

    public Invoker(UniversitySystem receiver) {
        this.receiver = receiver;
        initializeCommands();
    }

    public void execute(List<String> tokens) {
        if (commands.containsKey(tokens.get(0))) {
            commands.get(tokens.get(0)).execute(tokens.subList(1, tokens.size()));
        } else {
            System.out.println("Invalid command! Try again!");
        }
    }
}
