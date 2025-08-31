package DesignPatterns.Template;

public class Client {
    public void call(){
        ModelTrainer modelTrainer = new NeuralNetwork();
        modelTrainer.trainPipelineTemplateMethod();
    }
}
