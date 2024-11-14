package Controller;

import java.util.Date;

import Model.Classes.*;
import Model.Enumeration.*;

public class Controller {
    static double totalRevenue = 0;

    public void calculateTotalRevenue(double revenue) {
        totalRevenue += revenue;
    }

    public double calculateTotalRevenue() {
        System.out.println("Total Revenue : ");
        return totalRevenue;
    }
}
