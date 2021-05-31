package org.launchcode.techjobs_oo;


public abstract class JobField {
    int id;
    static int nextId = 1;
    String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return  value ;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        JobField that = (JobField) o;
//        return id == that.id && Objects.equals(value, that.value);
//    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

}
