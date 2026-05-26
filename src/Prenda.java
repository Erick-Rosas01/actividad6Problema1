public class Prenda
{
    private String modelo;
    private String tela;
    private double costoProduccion;
    private double costoLimite;
    private String genero;
    private String temporada;

    public Prenda(String modelo, String tela, double costoProduccion, double costoLimite,
                  String genero, String temporada) throws Exception
    {

        this.modelo = modelo;
        this.tela = tela;
        this.costoLimite = costoLimite;

        if (costoProduccion > costoLimite)
        {
            throw new CostoExcedidoException("Costo mayor al limite");
        }
        this.costoProduccion = costoProduccion;

        if (!genero.equalsIgnoreCase("masculino") &&
                !genero.equalsIgnoreCase("femenino") &&
                !genero.equalsIgnoreCase("mixto"))
        {
            throw new GeneroInvalidoException("Genero incorrecto");
        }
        this.genero = genero;

        if (!temporada.equalsIgnoreCase("primavera") &&
                !temporada.equalsIgnoreCase("verano") &&
                !temporada.equalsIgnoreCase("otoño") &&
                !temporada.equalsIgnoreCase("invierno"))
        {
            throw new TemporadaInvalidaException("Temporada incorrecta");
        }
        this.temporada = temporada;
    }

    public double getCostoProduccion()
    {
        return costoProduccion;
    }

    public double calcularPrecioVenta()
    {
        return costoProduccion * 1.15;
    }
}