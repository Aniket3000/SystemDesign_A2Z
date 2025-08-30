package DesignPatterns.Command;

public class LightCommand implements CommandInterface {
    LightButton lightButton;

    public LightCommand(LightButton lightButton){
        this.lightButton = lightButton;
    }
    @Override
    public void execute() {
        lightButton.on();
    }

    @Override
    public void undo() {
        lightButton.off();
    }
}
