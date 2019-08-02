package impuestos;

import static  constantes.ParafiscalesEntero.CERO;

public class Parafiscales {


    public Parafiscales(double salario) {
        this.salario = salario;
    }

    private double salario;

    public Parafiscales() {
        this.salario = CERO.getNumero();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
