package CommonDesignQuestions.ElevatorDesign;

import java.util.List;

abstract class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;
    abstract void submitRequest();
//    will be using strategy design here to run submit request according to different strategies
}
