package model;

import model.base.AbstractFabricListModel;
import model.base.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyFabricModel extends AbstractFabricListModel {

    /**
     * Конструктор
    */
    public MyFabricModel() {
        super(new ArrayList<>(), new HashSet<>());
    }

    // TODO: 09.05.2023 Не помню для чего, но неделю назад думал что очень сильно пригодится  
    @Override
    protected void createTypesModel() {
        typesModel.add("Пользователь");
    }


    /**
     * получить тип Объекта
     *
     * @param model Объект
     * @return Название типа
     */
    @Override
    public String getTypeModel(Model model) {
        return null;
    }

    /**
     * Получить объекты относящися к типу
     *
     * @param typeName Название типа
     * @return Список объектов указанного типа
     */
    @Override
    public List<Model> getModelsIsType(String typeName) {
        List<Model> resList = new ArrayList<>();
        for (var model: models) 
            if(isModelType(model, typeName))
                resList.add(model);
        return resList;
    }




}
