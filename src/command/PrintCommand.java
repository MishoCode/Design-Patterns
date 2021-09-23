package command;

import java.util.List;

public class PrintCommand extends AbstractCommand {

    public PrintCommand(UniversitySystem receiver) {
        super(receiver);
    }

    @Override
    public void execute(List<String> args) {
        if (args.size() == PRINT_COMMAND_ARGS_COUNT) {
            receiver.printStudents();
        } else {
            System.out.println("Invalid number of arguments!");
        }
    }
}
