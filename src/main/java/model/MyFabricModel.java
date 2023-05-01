package model;

import model.base.AbstractFabricModel;
import model.base.FabricModel;
import model.base.Model;

import java.util.ArrayList;
import java.util.List;

public class MyFabricModel extends AbstractFabricModel {
    private static final List<Model> models = new ArrayList<Model>();

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void addModel(Model model) {
        models.add(model);
    }

    @Override
    public void remove(Model model) {

    }

    @Override
    public void removeAll(Model model) {

    }

    @Override
    public void printAllInformation() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
