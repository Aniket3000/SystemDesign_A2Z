package DesignPatterns.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// This is the invoker class baically
public class Remote {
//    Stores everything about buttons nothing much and gives you access to call to command center basically
//    Either you can do below way by presetting the number of commands and everything or you can try one command set
//    private static int numButtons = 4;
//    private List<CommandInterface> commandArrayList = new ArrayList<CommandInterface>(Collections.nCopies(4,null));
//    private List<Boolean> buttonPressed = new ArrayList<Boolean>(Collections.nCopies(4,false));
//
//    public Remote(){
////        Set anything you want to set here
//    }
//
//    public void setCommand(int idx,)

    private CommandInterface command;
    public void setCommand(CommandInterface command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}

// How you run this
//LightButton lightButton = new LightButton();
//CommandInterface lightCommand = new LightCommand(lightButton);
//Remote remote = new Remote();
//remote.setCommand(lightCommand);
//remote.execute();