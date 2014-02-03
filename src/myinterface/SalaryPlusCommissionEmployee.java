/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;


/**
 *
 * @author Greg
 */
public class SalaryPlusCommissionEmployee  extends SalariedEmployee{
    
    private double sales;
    private double percentCommision;

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
    
    @Override
    public double getYearlySalary() {
        return this.getSalary()+(sales*percentCommision);
    }
    
    
    
}
