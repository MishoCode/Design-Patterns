package command;

import java.util.List;

public abstract class AbstractCommand implements Command {
    public static final int ADD_COMMAND_ARGS_COUNT = 1;
    public static final int REMOVE_COMMAND_ARGS_COUNT = 1;
    public static final int PRINT_COMMAND_ARGS_COUNT = 0;

    protected UniversitySystem receiver;

    public AbstractCommand(UniversitySystem receiver) {
        this.receiver = receiver;
    }

    public abstract void execute(List<String> args);
}
