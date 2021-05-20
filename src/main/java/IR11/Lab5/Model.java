package IR11.Lab5;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Model {
    private String _stringField;
    private Integer _intField;

    public Model(String stringField, int intField) {
        _stringField = stringField;
        _intField = intField;
    }

    public String getStringField() {
        return _stringField;
    }

    public void setStringField(String stringField) {
        _stringField = stringField;
    }

    public Integer getIntField() {
        return _intField;
    }

    public void setIntField(int intField) {
        _intField = intField;
    }

    @Override
    public String toString() {
        return "Model{" + "StringField=" + _stringField + ", IntField=" + _intField + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Model other = (Model) obj;
        if (this._intField != other._intField)
            return false;
        if (!Objects.equals(this._stringField, other._stringField))
            return false;
        return true;
    }
}