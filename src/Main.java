public class Main {
    public static void main(String[] args) {
        // Deklaration und Initialisierung eines Arrays mit 10 Elementen.
        int[] values = new int[10]; // Werte von 0 bis 9.

        // Deklaration und Initialisierung der Summe.
        int sum = 0;

        // Wertebereich für die Zufallsgenerierung.
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        System.out.println("Zufällig generierte Werte: ");

        // Füllen des Arrays mit zufälligen Werten.
        for (int i = 0; i < values.length; i++) {
            /*
             * Hier wird eine zufällige Zahl zwischen 1 und 100 generiert.
             * WICHTIG! Wirkliche Zufälligkeit kann nicht erreicht werden.
             */
            int random = (int)(Math.random() * range) + min;
            values[i] = random;
            sum += values[i];
            System.out.println((i + 1) + ". Wert: " + values[i]);
        }

        System.out.print("\nDie Summe der Werte: ");

        // Ausgabe der Summe.
        System.out.println(sum);
    }
}