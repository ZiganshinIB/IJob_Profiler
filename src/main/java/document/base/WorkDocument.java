package document.base;

import java.util.HashMap;
import java.util.List;

public interface WorkDocument {

    /**
     * Возвращает информацию об Объекте в текстовом виде
     * @return информацию об Объектах
     */
    List<HashMap> getSaveObjects();

    /**
     * Из текста получает объекты
     * @param objectsInformation информация об Объектах
     */
    void loadObjects(List<HashMap> objectsInformation);


}
