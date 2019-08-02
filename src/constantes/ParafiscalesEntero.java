package constantes;

public enum ParafiscalesEntero
{

    CERO(0),
    NOVENCIENTOS(900000);

    ParafiscalesEntero(int i)
    {
     this.numero=i;

    }

    public int getNumero() {
        return numero;
    }

    private int numero;
}
