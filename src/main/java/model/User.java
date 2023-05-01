package model;

import dataBase.base.IDataModel;
import model.base.AbstractModel;

import java.util.HashMap;
import java.util.Objects;

/**
 * Пользователь
 */
public class User extends AbstractModel implements IDataModel {
    /**
     * Возрасть
     */
    private Integer age;
    /**
     *  Имя
     */
    private String name;
    /**
     * Фамилия
     */
    private String secondName;

    // TODO: 01.05.2023 сделать поля для отчество
    private String patronymic;
    // TODO: 01.05.2023 сделать поля для описание
    private String about;
    // TODO: 01.05.2023 сделать конструктор 

    /**
     * Создает пользователя
     * @param age   Возрасть
     * @param name  Имя
     * @param secondName Фамилия
     * @param patronymic Отчество
     */
    public User(Integer age, String name, String secondName, String patronymic) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.about = "";
    }
    public User(Integer age, String name, String secondName, String patronymic, String about) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.about = about;
    }

    // TODO: 01.05.2023 дописать
    @Override
    public HashMap<String, Objects> getDataBaseStructure() {
        return null;
    }
}
