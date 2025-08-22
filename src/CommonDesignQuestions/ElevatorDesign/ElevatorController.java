package CommonDesignQuestions.ElevatorDesign;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ElevatorController {
    public ElevatorCar elevatorCar;

//    use priority queues here to maintain which floor the lift is currently at
//    and that'll give you where the lift should go while visiting floors by
//    keeping track of the requested floors and going up/down based on the direction, stopping
//    at requested points
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public void submitNewRequest(int floor,Direction direction){
//        accept a new request

    }

    public void controlElevator(){
//        control elevator
    }
}
