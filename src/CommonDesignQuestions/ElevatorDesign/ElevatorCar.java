package CommonDesignQuestions.ElevatorDesign;

public class ElevatorCar {
    public int id;
    public Display display;
    int currFloor;
    public Direction direction;
    public Status status;
    public InternalButton internalButton;
    public ExternalButton externalButton;


    public void move(int destinationFloor, Direction direction){
//        we'd want to go to a floor
//        it just move up down depending on the command
    }
}
