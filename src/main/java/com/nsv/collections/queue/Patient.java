package com.nsv.collections.queue;

public class Patient {
    private int id;
    private String name;
    private boolean emergency;

    public Patient() {
    }

    public Patient(int id, String name, boolean emergency) {
        this.id = id;
        this.name = name;
        this.emergency = emergency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmergency() {
        return emergency;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emergency=" + emergency +
                '}';
    }
}
