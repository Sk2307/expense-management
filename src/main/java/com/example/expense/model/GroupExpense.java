package com.example.expense.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class GroupExpense extends BaseModel {

    @ManyToOne
    private Group group;

    @OneToOne
    private Expense expense;
}