package DesignPatterns.Template;

// Through This design pattern we design a skeleton say for an alogrithm or a set of rules in order to be followed
// UPI or money transfer can also be a sample for this
// Anything which requires some series of steps to be followed in order
public abstract class ModelTrainer {
    public void trainPipelineTemplateMethod() {
//        So here only you run the model files in this fashion below and it's children classes will not change
//        this method the client on other hand will directly call your current method.
        load();
        preprocess();
        train();
        evaluate();
        save();
    }

    abstract public void train();
    abstract public void load();
    abstract public void preprocess();
    abstract public void save();
    abstract public void evaluate();
}
