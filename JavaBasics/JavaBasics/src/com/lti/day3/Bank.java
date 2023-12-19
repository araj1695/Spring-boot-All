package com.lti.day3;

import java.util.List;

public class Bank {
    int id;
    String name;
    List<Branch> branches;

    public Bank(){

    }

    public Bank(int id, String name, List<Branch> branches) {
        this.id = id;
        this.name = name;
        this.branches = branches;
    }

    public boolean bankBranchCombination(String bankName, String branchName){
        
        return false;
    }

    @Override
    public String toString() {
        return "Bank [id=" + id + ", name=" + name + ", branch=" + branches + "]";
    }

    

    
    
}
