import java.util.Scanner;

public class OdwroceniePoprzezWpisywanieDoTablicy {

    public static void main(String[] Args) {

        Scanner wpiszOdwroce = new Scanner(System.in);
        String wpisanaWartosc = wpiszOdwroce.nextLine();
        int dlugoscWpisanegoSlowa = wpisanaWartosc.length();

        char [] tabelaDoOdwracania = wpisanaWartosc.toCharArray();
        int iloscRekordowTablicy = -1;

        for (iloscRekordowTablicy = tabelaDoOdwracania.length - 1; iloscRekordowTablicy>=0; iloscRekordowTablicy--) {
            System.out.print(tabelaDoOdwracania[iloscRekordowTablicy]);
        }
    }
}
