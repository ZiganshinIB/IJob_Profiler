package model.base;

public interface FabricModel {
    int getCount();
    void addModel(Model model);
    void remove(Model model);
    void removeAll(Model model);
    void printAllInformation();
    String getInfo();

}
