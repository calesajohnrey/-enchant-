import static java.lang.System.out;

// This is JOHN REY CALESA'S code
public class OOP_File {

    private int empID;
    private String empName;
    private double totalHoursWorked;
    private double ratePerHour;

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setEmpID(int empID) {
        this.empID += empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalHoursWorked(double totalHoursWorked) {
        this.totalHoursWorked += totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = +ratePerHour;
    }

    public void getDisplayInfo() {
        out.println("ID: " + getEmpID());
        out.println("NAME; " + getEmpName());
        out.println("TOTAL HOURS WORKED: " + getTotalHoursWorked());
        out.println("RATE PER HOUR: " + getRatePerHour());
    }

    public void getComputeSalary() {
        double com, com1, com2;
        double d;
        double c;
        double a;
        if (getTotalHoursWorked() <= 40) {
            d = getTotalHoursWorked();
            c = getRatePerHour();
            com = d * c;
            out.println("COMPUTED SALARY OF A EMPLOYEE(NO OVER TIME): " + com);
        } else {
            d = getTotalHoursWorked();
            c = getRatePerHour();
            a = c * .150;
            com = a * (d - 40);
            com1 = d * c;
            com2 = com + com1;
            out.println("COMPUTED SALARY OF A EMPLOYEE(): " + com1);
            out.println("OVER TIME: " + com);
            out.println("TOTAL EMPLOYEE SALARY: " + com2);
        }

    }

}