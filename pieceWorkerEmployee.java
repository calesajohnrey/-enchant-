/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import static java.lang.System.out;

public class pieceWorkerEmployee {

    private int empIDpiece;
    private String empNamepiece;
    private double totalPiecesFinished;
    private double ratePerPieces;

    public int getEmpIDpiece() {
        return empIDpiece;
    }

    public String getEmpNamepiece() {
        return empNamepiece;
    }

    public double getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPieces() {
        return ratePerPieces;
    }

    public void setEmpIDpiece(int empIDpiece) {
        this.empIDpiece += empIDpiece;
    }

    public void setEmpNamepiece(String empNamepiece) {
        this.empNamepiece = empNamepiece;
    }

    public void setTotalPiecesFinished(double totalPiecesFinished) {
        this.totalPiecesFinished += totalPiecesFinished;
    }

    public void setRatePerPieces(double ratePerPieces) {
        this.ratePerPieces += ratePerPieces;
    }

    public void getDisplayInfoPiece() {
        out.println("PIECE WORKER EMPLOYEE DETAILS: ");
        out.println("-------------------------------------------------------");
        out.println("PIECE WORKER EMPLOYEE ID: " + getEmpIDpiece());
        out.println("PIECE WORKER EMPLOYEE NAME: " + getEmpNamepiece());
        out.println("PIECE WORKER TOTAL FINISHED: " + getTotalPiecesFinished());
        out.println("RATE PER PIECES: " + getRatePerPieces());
    }

    public void getComputeSalaryPiece() {
        double n, m, l;
        if (getTotalPiecesFinished() >= 100) {
            m = getTotalPiecesFinished() * .10;
            n = getTotalPiecesFinished() * getRatePerPieces();
            l = m + n;

            out.println("TOTAL WORKER PIECE SALARY(10% /100 PIECES):" + l);
        } else {
            m = getTotalPiecesFinished() * getRatePerPieces();
            out.println("TOTAL WORKER PIECE SALARY(WITH OUT BONUS):" + m);
        }
    }

}
