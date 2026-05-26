import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Prenda> prendas = new ArrayList<>();
        ArrayList<Lote> lotes = new ArrayList<>();

        try
        {
            Prenda p1 = new Prenda("Sudadera", "Algodon", 120,
                    150, "masculino", "invierno");
            prendas.add(p1);

            Lote l1 = new Lote(1, 100, LocalDate.now(), p1);
            lotes.add(l1);

            System.out.println("Costo del lote: " + l1.calcularCostoLote());
            System.out.println("Monto de recuperacion: " + l1.calcularMontoRecuperacion());

        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}