package calculation_of_salary.Classes;

import static java.lang.System.out;

public class basePlusCommision {

    private int empIDbase;
    private String empNamebase;
    private double totalSalesbase;
    private double baseSalary;

    public int getEmpIDbase() {
        return empIDbase;
    }

    public String getEmpNamebase() {
        return empNamebase;
    }

    public double getTotalSalesbase() {
        return totalSalesbase;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setEmpIDbase(int empIDbase) {
        this.empIDbase += empIDbase;
    }

    public void setEmpNamebase(String empNamebase) {
        this.empNamebase = empNamebase;
    }

    public void setTotalSalesbase(double totalSalesbase) {
        this.totalSalesbase += totalSalesbase;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary += baseSalary;
    }

    public void getDisplayInfobase() {
        out.println("BASE PLUS COMMISION EMPLOYEE DETAILS: ");
        out.println("-------------------------------------------------------");
        out.println("BASE PLUS COMMISION EMPLOYEE ID: " + getEmpIDbase());
        out.println("BASE PLUS COMMISION EMPLOYEE NAME: " + getEmpNamebase());
        out.println("BASE PLUS TOTAL SALES: " + getTotalSalesbase());
        out.println("BASE SALARY: " + getBaseSalary());
    }

    public void getComputeSalarybase() {
        double j;
        if (getTotalSalesbase() <= 10000) {
            j = getTotalSalesbase() * .05 + getBaseSalary();
            out.println("COMPUTED BASE PLUS COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSalesbase() > 10000 && getTotalSalesbase() <= 50000) {
            j = getTotalSalesbase() * .10 + getBaseSalary();
            out.println("COMPUTED BASE PLUS COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSalesbase() > 50000 && getTotalSalesbase() <= 100000) {
            j = getTotalSalesbase() * .15 + getBaseSalary();
            out.println("COMPUTED BASE PLUS COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSalesbase() > 100000) {
            j = getTotalSalesbase() * .30 + getBaseSalary();
            out.println("COMPUTED BASE PLUS COMMISION SALARY OF AN EMPLOYEE: " + j);
        }
    }
}

//made by hardian evarula.
