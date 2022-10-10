package calculation_of_salary.Classes;

//Jei Ann Bayer
import static java.lang.System.out;

public class commisionEmployee {

    private int empIDcom;
    private String empNamecom;
    private double totalSales;

    public int getEmpIDcom() {
        return empIDcom;
    }

    public String getEmpNamecom() {
        return empNamecom;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setEmpIDcom(int empIDcom) {
        this.empIDcom += empIDcom;
    }

    public void setEmpNamecom(String empNamecom) {
        this.empNamecom = empNamecom;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public void getDisplayInfocom() {
        out.println("COMMISION EMPLOYEE DETAILS: ");
        out.println("");
        out.println("COMMISION EMPLOYEE ID: " + getEmpIDcom());
        out.println("COMMISION EMPLOYEE NAME: " + getEmpNamecom());
        out.println("TOTAL SALES: " + getTotalSales());
    }

    public void getCommsionSalary() {
        double j;
        if (getTotalSales() <= 10000) {
            j = getTotalSales() * .05;
            out.println("COMPUTED COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSales() > 10000 && getTotalSales() <= 50000) {
            j = getTotalSales() * .10;
            out.println("COMPUTED COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSales() > 50000 && getTotalSales() <= 100000) {
            j = getTotalSales() * .15;
            out.println("COMPUTED COMMISION OF AN EMPLOYEE: " + j);
        } else if (getTotalSales() > 100000) {
            j = getTotalSales() * .30;
            out.println("COMPUTED COMMISION OF AN EMPLOYEE: " + j);
        }

    }
}
