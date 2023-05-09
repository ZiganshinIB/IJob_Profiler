package view.base;

import java.util.List;

public interface ViewList<T> {
    /**
     * Показать объекты
     * @param list Список Объектов
     */
    void showSimpleList(List<T> list);

    /**
     * Показать объекты c итерации
     * @param list Список Объектов
     */
    void showItemList(List<T> list);
}
