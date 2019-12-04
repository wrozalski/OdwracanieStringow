public class OdwrocenieTabeliGotowej {

    public static void main(String[] args) {

        char[] odwroconaTablica = {'j', 'e', 's', 't', 'e', 'm', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 's', 't', 'ą'};
        int iloscRekordow = -1;
        System.out.println("Zawartość tablicy to: ");

        for (iloscRekordow = 0; iloscRekordow < odwroconaTablica.length; iloscRekordow++) {
            System.out.print(odwroconaTablica[iloscRekordow]);
        }
        System.out.println(" ");
        System.out.println("Odwrócna zawartość tablicy to: ");
        for (iloscRekordow = odwroconaTablica.length - 1; iloscRekordow >= 0; iloscRekordow--) {
            System.out.print(odwroconaTablica[iloscRekordow]);
        }

        int iloscPozycjiTabeli = odwroconaTablica.length;
        System.out.println(" ");
        System.out.println("Długość tablicy to " + iloscPozycjiTabeli + " znaków.");
    }
}


