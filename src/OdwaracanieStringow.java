import java.util.Scanner;

public class OdwaracanieStringow {


    public static void main(String[] Args) {

        Scanner wpiszOdwroce = new Scanner(System.in);
        String wpisanaWartosc = wpiszOdwroce.nextLine();
        int dlugoscWpisanegoSlowa = wpisanaWartosc.length();

///////////////////////////////////////// Wersja z użyciem CharAt
        if (dlugoscWpisanegoSlowa <= 4) {
            System.out.print("Wyrażenie ma " + dlugoscWpisanegoSlowa + " znaki.");

        } else {
            System.out.print("Wyrażenie ma " + dlugoscWpisanegoSlowa + " znaków.");
        }

        System.out.println("");
        System.out.println("Od tyłu to wygląda tak:");
        for (dlugoscWpisanegoSlowa = wpisanaWartosc.length() - 1; dlugoscWpisanegoSlowa >= 0; dlugoscWpisanegoSlowa--) {
            System.out.print(wpisanaWartosc.charAt(dlugoscWpisanegoSlowa));

        }
    }
}

