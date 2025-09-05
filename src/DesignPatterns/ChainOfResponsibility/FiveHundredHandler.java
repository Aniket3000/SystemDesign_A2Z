package DesignPatterns.ChainOfResponsibility;

public class FiveHundredHandler extends MoneyHandler{

    private int numNotes;

    public FiveHundredHandler(int numNotes){
        this.numNotes = numNotes;
    }
    @Override
    public void dispense(int amount) {
        int notesNeeded = amount / 500;

        if(notesNeeded > numNotes){
            notesNeeded = numNotes;
            numNotes = 0;
        }else{
            numNotes -= notesNeeded;
        }
        if(notesNeeded > 0){
            System.out.printf("Dispensing %d x 1000 rupee notes.",notesNeeded);
        }
        int remainingAmount = amount - (notesNeeded*500);
        if(remainingAmount > 0){
            if(nextHandler != null)
                nextHandler.dispense(remainingAmount);
            else{
                System.out.print("Sorry request can't be processed");
            }
        }
    }
}
