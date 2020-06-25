package com.design.managedebts.model.group;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "group_details")
public class GroupDetails {

    //auto-generate this
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private long createdBy; // id of user who created this group

    private LocalDateTime createdAt;

    public GroupDetails() {
    }

    public GroupDetails(String name, long createdBy) {
        this.name = name;
        this.createdBy = createdBy;
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "GroupDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdBy=" + createdBy +
                ", createdAt=" + createdAt +
                '}';
    }
}
