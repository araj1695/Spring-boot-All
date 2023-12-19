package com.lti.day3;

import java.util.*;

public class BankMap {

    public static boolean bankBranchCombination(String bankName, String branchLocation, Map<String, Bank> bm){
        Bank bnk = bm.get(bankName);
        if(bnk != null){
            List<Branch> br = bnk.branches;
            for(Branch b: br){
                // System.out.println(b.location.compareTo(branchLocation));
                if(b.location.equals(branchLocation)){
                    System.out.println("Bank "+bankName+" and Branch "+branchLocation+" found.");
                    return true;
                }
            }
            System.out.println("Bank "+bankName+" found but Branch "+branchLocation+" not found.");
            return false;

        }
        System.out.println("Bank "+bankName+" not found.");
        return false;
    }

    public static void main(String[] args) {
        // Bank b1 = new Bank(1,"HDFC");
        // Bank b2 = new Bank(2,"ICICI");

        // Map<String, Bank> bankMap = new HashMap<>();

        // bankMap.put("HDFC", b1);
        // bankMap.put("ICICI", b2);

        // // System.out.println(bankMap.get("HDFC"));

        // Set<String> keys = bankMap.keySet();

        // for(String k: keys){
        //     System.out.println(bankMap.get(k));
        // }

        List<Branch> branchesB1 = new ArrayList<>();
        branchesB1.add(new Branch(1, "Kolkata"));
        branchesB1.add(new Branch(2, "Mumbai"));
        branchesB1.add(new Branch(3, "Chenai"));
        branchesB1.add(new Branch(4, "Delhi"));

        List<Branch> branchesB2 = new ArrayList<>();
        branchesB2.add(new Branch(1, "Pune"));
        branchesB2.add(new Branch(2, "Patna"));
        branchesB2.add(new Branch(3, "Ranchi"));
        branchesB2.add(new Branch(4, "Delhi"));

        Bank b1 = new Bank(1,"HDFC", branchesB1);
        Bank b2 = new Bank(2,"AXIS", branchesB2);

        Map<String, Bank> bankMap = new HashMap<>();

        bankMap.put("HDFC", b1);
        bankMap.put("AXIS", b2);

        // Set<String> keys = bankMap.keySet();

        // for(String k: keys){
        //     System.out.println(bankMap.get(k));
        // }

        // boolean ans = bankBranchCombination("AXIS", "une", bankMap);

    }
    
}
