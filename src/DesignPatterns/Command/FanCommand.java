package DesignPatterns.Command;

public class FanCommand implements CommandInterface{
    FanButton fanButton;

    public FanCommand(FanButton fanButton){
        this.fanButton = fanButton;
    }
    @Override
    public void execute() {
        fanButton.on();
    }

    @Override
    public void undo() {
        fanButton.off();
    }
}
