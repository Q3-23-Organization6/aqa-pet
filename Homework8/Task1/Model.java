package Homework8.Task1;

public class Model extends MobilePhone {
    private String modelName;

    public Model(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void print(Model myPhone) {
        System.out.println(modelName);
    }
}
