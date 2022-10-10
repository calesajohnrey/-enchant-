package calculation_of_salary.Classes;
// this is the main file
import java.util.*;
import static java.lang.System.out;

public class Calculation_of_salary {

    public static void main(String[] args) {
        // TODO code application logic here
        out.println("CHOOSE WHICH EMPLOYEE SALARY WOULD YOU LIKE TO COMPUTE:");
        out.println("-------------------------------------------------------");
        out.println("1.HOURLY EMPLOYEE");
        out.println("2.COMMISION EMPLOYEE");
        out.println("3.BASE PLUS COMMISION EMPLOYEE");
        out.println("4.PIECE WORKER EMPLOYEE");
        out.println("-------------------------------------------------------");
        out.println("CHOOSE ONLY NUMBER:");
        out.println("-------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        while (true) {

            out.println("ENTER NUMBER: ");
            int num = input.nextInt();
            out.println("-------------------------------------------------------");

            if (num == 1) {
                hourlyEmployee h = new hourlyEmployee();
                out.println("ENTER EMPLOYEE ID: ");
                h.setEmpID(input.nextInt());
                out.println("-------------------------------------------------------");
                out.println("ENTER EMPLOYEE NAME: ");
                h.setEmpName(input.next());
                out.println("-------------------------------------------------------");
                out.println("ENTER TOTAL HOURS WORKED: ");
                h.setTotalHoursWorked(input.nextDouble());
                out.println("-------------------------------------------------------");
                out.println("ENTER RATE PER HOUR: ");
                h.setRatePerHour(input.nextDouble());
                out.println("-------------------------------------------------------");
                out.println("SUMARRY OF AN EMPLOYEE DETAILS:");
                out.println("-------------------------------------------------------");
                h.getDisplayInfo();
                out.println("-------------------------------------------------------");
                h.getComputeSalary();

            } else if (num == 2) {
                commisionEmployee c = new commisionEmployee();
                out.println("ENTER COMMISION ID: ");
                c.setEmpIDcom(input.nextInt());
                out.println("-------------------------------------------------------");
                out.println("ENTER COMMMISION NAME: ");
                c.setEmpNamecom(input.next());
                out.println("-------------------------------------------------------");
                out.println("ENTER COMMISION TOTAL SALES: ");
                c.setTotalSales(input.nextDouble());
                out.println("-------------------------------------------------------");
                c.getDisplayInfocom();
                out.println("-------------------------------------------------------");
                c.getCommsionSalary();

            } else if (num == 3) {
                basePlusCommision bs = new basePlusCommision();
                out.println("ENTER BASE PLUS COMMISION EMPLOYEE ID: ");
                bs.setEmpIDbase(input.nextInt());
                out.println("-------------------------------------------------------");
                out.println("ENTER BASE PLUS COMMISION EMPLOYEE NAME: ");
                bs.setEmpNamebase(input.next());
                out.println("-------------------------------------------------------");
                out.println("ENTER BASE PLUS COMMISION EMPLOYEE TOTAL SALES: ");
                bs.setTotalSalesbase(input.nextDouble());
                out.println("-------------------------------------------------------");
                out.println("ENTER BASE PLUS EMPLOYEE SALARY: ");
                bs.setBaseSalary(input.nextDouble());
                out.println("-------------------------------------------------------");
                bs.getDisplayInfobase();
                out.println("-------------------------------------------------------");
                bs.getComputeSalarybase();
            } else if (num == 4) {
                pieceWorkerEmployee pw = new pieceWorkerEmployee();
                out.println("ENTER PIECE WORKER ID: ");
                pw.setEmpIDpiece(input.nextInt());
                input.nextLine();
                out.println("-------------------------------------------------------");
                out.println("ENTER PIECE WORKER NAME: ");
                pw.setEmpNamepiece(input.nextLine());
                out.println("-------------------------------------------------------");
                out.println("ENTER TOTAL PIECE WORKER FINISHED: ");
                pw.setTotalPiecesFinished(input.nextDouble());
                input.nextLine();
                out.println("-------------------------------------------------------");
                out.println("ENTER RATE PER PIECE: ");
                pw.setRatePerPieces(input.nextDouble());
                out.println("-------------------------------------------------------");
                pw.getDisplayInfoPiece();
                out.println("-------------------------------------------------------");
                pw.getComputeSalaryPiece();

                out.println("WOULD YOU LIKE TO CONTINUE? y/n");
                char o = input.next().charAt(0);
            }
        }
    }
}
// made by hadrian evarula
