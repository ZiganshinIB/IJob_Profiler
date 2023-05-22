package model;

import dataBase.base.IDataModel;
import model.base.AbstractModel;
import view.base.ModelForm;

import java.util.HashMap;
import java.util.Objects;

/**
 * Пользователь
 */
public class User extends AbstractModel implements  ModelForm {

    private static int defaultIndex;

    private int id;
    /**
     * Возрасть
     */
    private Integer age;
    /**
     * Имя
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

    static{
        defaultIndex = 0;
    }

    public User(int id, Integer age, String name, String secondName, String patronymic, String about ) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.about = about;
        defaultIndex = id;
    }

    /**
     * Создает пользователя
     *
     * @param age        Возрасть
     * @param name       Имя
     * @param secondName Фамилия
     * @param patronymic Отчество
     */
    public User(Integer age, String name, String secondName, String patronymic) {
        this(defaultIndex+1, age, name, secondName, patronymic, "");
    }

    public User(Integer age, String name, String secondName, String patronymic, String about) {
        this(defaultIndex+1, age, name, secondName, patronymic, about);
    }



    @Override
    public String toString() {
        return "User{" +
                "id="+id+
                ",age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", about='" + about + '\'' +
                '}';
    }


    // TODO: 09.05.2023 Сделать более красивее, когда нибудь
    /**
     * Большая форма объекта
     * @return Краткую форма Объекта в виде String
     */
    @Override
    public String getFormsView() {
        return this.toString();
    }

    @Override
    public HashMap<String, Object> toData() {
        HashMap<String, Object> data= new HashMap<>();
        data.put("id", this.id);
        data.put("name", this.name);
        data.put("age", this.age);
        data.put("secondName", this.secondName);
        data.put("patronymic", this.patronymic);
        data.put("about", this.about);
        return data;
    }

    public int getId() {
        return id;
    }
}
