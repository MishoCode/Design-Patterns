package command;

import java.util.List;

public class AddCommand extends AbstractCommand {

    public AddCommand(UniversitySystem receiver) {
        super(receiver);
    }

    @Override
    public void execute(List<String> args) {
        if (args.size() == ADD_COMMAND_ARGS_COUNT) {
            receiver.addStudent(args.get(0));
        } else {
            System.out.println("Invalid number of arguments!");
        }
    }
}
