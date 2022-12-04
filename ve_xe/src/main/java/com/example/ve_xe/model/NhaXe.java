package com.example.ve_xe.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class NhaXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    boolean isDelete =false;

    @JsonBackReference
    @OneToMany(mappedBy = "nhaXe")
    Set<VeXe> veXes;

    public NhaXe() {
    }

    public NhaXe(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<VeXe> getVeXes() {
        return veXes;
    }

    public void setVeXes(Set<VeXe> veXes) {
        this.veXes = veXes;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "NhaXe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
