package org.example.patronesComportamiento.command.invoker;

import org.example.patronesComportamiento.command.services.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandList=new ArrayList<>();

    public void recibirInterface(Command command){
        commandList.add(command);
    }
    public void realizarAccionInterface(){
        commandList.forEach(Command::execute);
    }
}
