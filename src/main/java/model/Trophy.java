package model;

import dataBase.base.IDataModel;
import model.base.AbstractModel;
import model.base.Model;
import view.base.ModelForm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;

public class Trophy extends AbstractModel implements ModelForm {

    private static int defaultIndex;

    private int id;
    private String date;
    private String name;
    private  String description;
    private String status;
    private String field;
    private Integer user_id;

    static {
        defaultIndex = 0;
    }

    public Trophy(int id, String date, String name, String description, String status, String field, Integer user_id){
        this.id = id;
        this.date = date;
        this.name = name;
        this.description = description;
        this.status = status;
        this.field = field;
        this.user_id = user_id;
        defaultIndex = id;
    }
    /**
     * Награда, трофей
     * @param date дата выдачи
     * @param name Название
     * @param description Описание
     * @param status Статус место
     * @param field Область
     * @param user_id  Пользователь
     */
    public Trophy(String date, String name, String description, String status, String field, Integer user_id) {
        this(defaultIndex+1, date,name,description,status,field,user_id);
    }

    public Integer getUser() {
        return user_id;
    }


    @Override
    public String toString() {
        return "Trophy{" +
                "id='"+id+'\''+
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", field='" + field + '\'' +
                ", user_id=" + user_id +
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

    @Override
    public HashMap<String, Object> toData() {
        HashMap<String, Object> data= new HashMap<>();
        data.put("id", this.id);
        data.put("name", this.name);
        data.put("description", this.description);
        data.put("status", this.status);
        data.put("field", this.field);
        data.put("user_id", this.user_id);
        data.put("date", this.date);
        return data;
    }
}
