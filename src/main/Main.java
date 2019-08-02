package main;

import static constantes.ParafiscalesString.*;

import impuestos.ParafiscalesLogica;



import javax.swing.*;




public class Main {

    public static void main(String[] args)
    {
        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

        String  nombre = JOptionPane.showInputDialog(null,"Ingresa nombre");
        parafiscalesLogica.setNombre(nombre);

        String salario = JOptionPane.showInputDialog(null,"Ingrese salario");
        parafiscalesLogica.setSalario(Double.parseDouble(salario));

        JOptionPane.showInputDialog(null,  SOLICIUTUD_NOMBRE.getMensaje()+parafiscalesLogica.getNombre()+ SOLICITUD_SALARIO.getMensaje()+parafiscalesLogica.getSalario()
        +parafiscalesLogica.getSalario()+SU_PENSION.getMensaje()+ parafiscalesLogica.calcularSalud()+SU_SALUD.getMensaje()+ parafiscalesLogica.calcularPension());


    }
}
