package constantes;

public enum ParafiscalesString {


    SOLICIUTUD_NOMBRE("Ingrese su nombre"),
    SOLICITUD_SALARIO("Ingrese su salario"),
    NOMBRE_EMPLEADO("Ingrese su nombre"),
    SU_SALARIO_ES("\n Su salario es"),
    SU_PENSION("\n  Su aporte a pension es"),
    SU_SALUD(" \n Su aporte a salud es");


    ParafiscalesString(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    private String mensaje;


}
