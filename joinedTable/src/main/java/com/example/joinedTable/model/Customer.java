package com.example.joinedTable.model;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "customer_item",
        joinColumns ={@JoinColumn(name="customer_id")},
        inverseJoinColumns = {@JoinColumn(name = "item_id")}

    )
    private Item item;

    public Customer(){}

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
}
