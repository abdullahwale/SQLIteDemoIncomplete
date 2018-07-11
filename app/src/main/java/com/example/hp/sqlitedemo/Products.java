package com.example.hp.sqlitedemo;

public class Products {
private int _id;
private String _ProductName;

public Products()
{

}

    public Products(String ProductName) {
        this._ProductName = ProductName;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public String get_ProductName() {
        return _ProductName;
    }

    public void set_ProductName(String ProductName) {
        this._ProductName = ProductName;
    }
}
