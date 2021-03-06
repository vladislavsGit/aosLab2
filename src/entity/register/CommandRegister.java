package entity.register;

import command.ProcessorCommand;

public class CommandRegister {

    private ProcessorCommand currentCommand;

    public void setCurrentCommand(ProcessorCommand currentCommand) {
        this.currentCommand = currentCommand;
    }

    @Override
    public String toString(){
        return "Curr command:\t" + currentCommand.toString();
    }

}
