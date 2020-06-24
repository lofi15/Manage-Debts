package com.design.managedebts.model.group;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group")
public class Group {

    //auto-generate this
    @Id
    private long id;

    private String name;

    private long created_by; // id of user who created this group

    public Group() {
    }

    public Group(String name, long created_by) {
        this.name = name;
        this.created_by = created_by;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(long created_by) {
        this.created_by = created_by;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created_by=" + created_by +
                '}';
    }
}
