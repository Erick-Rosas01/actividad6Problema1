import java.time.LocalDate;

public class Lote
{
    private int numeroLote;
    private int numeroPiezas;
    private LocalDate fecha;
    private Prenda prenda;

    public Lote(int numeroLote, int numeroPiezas, LocalDate fecha, Prenda prenda) throws Exception
    {

        this.numeroLote = numeroLote;
        this.fecha = fecha;
        this.prenda = prenda;

        if (numeroPiezas < 50 || numeroPiezas > 350)
        {
            throw new PiezasInvalidasException("Piezas fuera de rango (50-350)");
        }
        this.numeroPiezas = numeroPiezas;
    }

    public double calcularCostoLote()
    {
        return numeroPiezas * prenda.getCostoProduccion();
    }

    public double calcularMontoRecuperacion()
    {
        return numeroPiezas * (prenda.getCostoProduccion() * 1.05);
    }
}