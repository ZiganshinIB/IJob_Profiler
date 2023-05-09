package model.base;

import javax.swing.text.StyledEditorKit;
import java.util.List;

public interface FabricModel {
    /**
     * Возвращает количство элементов в моделе
     * @return количство элементов
     */
    int getCount();

    /**
     * Добавляет Объект в коллекцию
     * @param model Объект
     */
    void addModel(Model model);

    /**
     * Удаляет указаный Объект
     * @param model указаный Объект
     */
    boolean remove(Model model);


    /**
     * Удаляет все Объекты
     */
    void removeAll();

    /**
     * Получить все Объекты
     * @return все Объекты
     */
    List<Model> getAll();

    /**
     * Возвращает информацию об Объекте
     * @param model Объекты
     * @return информация об объекты
     */
    String getInfo(Model model);

    /**
     * получить тип Объекта
     * @param model Объект
     * @return Название типа
     */
    String getTypeModel(Model model);

    /**
     * Получить объекты относящися к типу
     * @param typeName Название типа
     * @return Список объектов указанного типа
     */
    List<Model> getModelsIsType(String typeName);

    /**
     * Проверяет является ли Объект определенного типа
     * @param model  Объект
     * @param typeName Название типа
     * @return Если является True иначе False
     */
    Boolean isModelType(Model model, String typeName);

    /**
     * Возвращает список названии типов
     * @return Список с названием типов Объектов
     */
    List<String> getTypeNames();

}
