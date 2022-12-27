
package Modelo;


public class CerrarCaja {
    public int id;
    public double totalv;
    public  double inicioc;

    public CerrarCaja() {
    }

    public CerrarCaja(int id, double totalv, double inicioc) {
        this.id = id;
        this.totalv = totalv;
        this.inicioc = inicioc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalv() {
        return totalv;
    }

    public void setTotalv(double totalv) {
        this.totalv = totalv;
    }

    public double getInicioc() {
        return inicioc;
    }

    public void setInicioc(double inicioc) {
        this.inicioc = inicioc;
    }
    
    
}
