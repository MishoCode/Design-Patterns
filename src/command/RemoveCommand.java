package command;

import java.util.List;

public class RemoveCommand extends AbstractCommand {

    public RemoveCommand(UniversitySystem receiver) {
        super(receiver);
    }

    @Override
    public void execute(List<String> args) {
        if (args.size() == REMOVE_COMMAND_ARGS_COUNT) {
            receiver.removeStudent(args.get(0));
        } else {
            System.out.println("Invalid number of arguments!");
        }
    }
}
