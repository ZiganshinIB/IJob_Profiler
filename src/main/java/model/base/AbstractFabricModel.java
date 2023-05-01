package model.base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class AbstractFabricModel implements FabricModel {
    private static final List<Model> models = new ArrayList<Model>();
    /**
     * Типы для хранения
     */
    protected HashSet<String> TypesModel;
    public AbstractFabricModel(){

    }
}
