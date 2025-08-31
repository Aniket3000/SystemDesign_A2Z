package DesignPatterns.Template;

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
