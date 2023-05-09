package model.base;

import java.util.*;

/**
 * Абстарктная фабрика
 * 1) Есть список для моделей models
 * 2) Есть множество для типов моделей typeModel
 */
public abstract class AbstractFabricListModel implements FabricModel {
    /**
     * Модели
     */
    protected List<Model> models;

    /**
     * Типы для хранения
     */
    protected Set<String> typesModel;

    /**
     * Конструктор
     * @param models список для моделей
     * @param typesModel множество для типов моделей
     */
    public AbstractFabricListModel(List<Model> models, HashSet<String> typesModel) {
        this.models = models;
        this.typesModel = typesModel;
        createTypesModel();
    }

    abstract protected void createTypesModel();


    /**
     * Возвращает список названии типов
     *
     * @return Список с названием типов Объектов
     */
    @Override
    public List<String> getTypeNames() {
        return typesModel.stream().toList();
    }

    /**
     * Удаляет все Объекты
     */
    @Override
    public void removeAll() {
        models.clear();
    }

    /**
     * Выводить все элементы
     */
    @Override
    public List<Model> getAll() {
        return models;
    }

    /**
     * Возвращает информацию об Объекте
     * @param model Объекты
     * @return информация об объекты
     */
    @Override
    public String getInfo(Model model) {
        return model.toString();
    }


    /**
     * Возвращает количство элементов в моделе
     * @return количство элементов
     */
    @Override
    public int getCount() {
        return models.size();
    }

    /**
     * Добавляет Объект в коллекцию
     * @param model Объект
     */
    @Override
    public void addModel(Model model) {
        models.add(model);
    }

    /**
     * Удаляет указаный Объект
     * @param model указаный Объект
     */
    @Override
    public boolean remove(Model model) {
        return models.remove(model);
    }

    /**
     * Проверяет является ли Объект определенного типа
     *
     * @param model    Объект
     * @param typeName Название типа
     * @return Если является True иначе False
     */
    @Override
    public Boolean isModelType(Model model, String typeName) {
        return model.getClass().getSimpleName().equalsIgnoreCase(typeName);
    }

}
