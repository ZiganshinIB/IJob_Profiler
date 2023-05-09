package model;

import dataBase.base.IDataModel;
import model.base.AbstractModel;
import model.base.Model;
import view.base.ModelForm;

import java.util.HashMap;
import java.util.Objects;

public class Trophy extends AbstractModel implements IDataModel, ModelForm {
    private String date;
    private String name;
    private  String description;
    private String status;
    private String field;
    private User user;

    /**
     * Награда, трофей
     * @param date дата выдачи
     * @param name Название
     * @param description Описание
     * @param status Статус место
     * @param field Область
     * @param user  Пользователь
     */
    public Trophy(String date, String name, String description, String status, String field, User user) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.status = status;
        this.field = field;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public HashMap<String, Objects> getDataBaseStructure() {
        return null;
    }

    @Override
    public String toString() {
        return "Trophy{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", field='" + field + '\'' +
                ", user=" + user +
                '}';
    }

    /**
     * Большая форма объекта
    * @return Краткую форма Объекта в виде String
     */
    @Override
    public String getFormsView() {
        return this.toString();
    }
}
