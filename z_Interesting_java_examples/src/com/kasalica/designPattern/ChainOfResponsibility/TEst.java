package com.kasalica.designPattern.ChainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TEst {
	
    public static void main(String[] args) {
    	
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);
 
        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(0, d, "General"));
           }
        } catch(Exception e) {
            System.exit(1);
        }  
    }
}