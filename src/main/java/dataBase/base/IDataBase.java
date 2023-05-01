package dataBase.base;

import model.base.Model;

public interface IDataBase {
    void create();
    void append(ITable table);
    int getCount();


}
