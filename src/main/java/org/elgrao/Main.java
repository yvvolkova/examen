package org.elgrao;
import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;


public class Main
{
    public static void main(String[] args) {
        ColoredPrinter cp = new ColoredPrinter.Builder(1, false)
                .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLUE)
                .build();

        for (int i = 0; i < 10; i++) {
            // Generar data
            String name = "Juan Juánez";
            String streetAddress = "Calle falsa, 123";

            // Mostrar data
            cp.println("Nombre: " + name, Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.WHITE);
            cp.println("Dirección: " + streetAddress, Ansi.Attribute.NONE, Ansi.FColor.BLACK, Ansi.BColor.GREEN);
        }
    }
}


