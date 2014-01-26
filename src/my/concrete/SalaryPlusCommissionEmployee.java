/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Greg
 */
public class SalaryPlusCommissionEmployee  extends SalariedEmployee{
    
    private double sales;
    private double percentCommision;

    public SalaryPlusCommissionEmployee(double sales, double percentCommision, double salary, String name) {
        super(salary, name);
        this.sales = sales;
        this.percentCommision = percentCommision;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getPercentCommision() {
        return percentCommision;
    }

    public void setPercentCommision(double percentCommision) {
        this.percentCommision = percentCommision;
    }
    
    
    
}
