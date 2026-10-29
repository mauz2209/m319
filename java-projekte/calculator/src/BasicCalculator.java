import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            // Schritt 1: Zwei Zahlen eingeben und in je einer Variable des Typs double speichern
            // <your code here>

            // Schritt 2: Eine Operation eingeben und in einer Variable des Typs char speichern
            // <your code here>

            // Schritt 3: Die Operation durchführen
            double result = 0;
            switch (operation) {
                case '+':
                    // <your code here>
                    break;
                case '-':
                    // <your code here>
                    break;
                case '*':
                    // <your code here>
                    break;
                case '/':
                    // Behandlung der Division durch Null
                    if (num2 != 0) {
                        // <your code here>
                    } else {
                        System.out.println("Fehler: Division durch Null!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Ungültige Operation!");
                    continue;
            }

            // Schritt 4: Ergebnis anzeigen
            // <your code here>

            // Schritt 5: Fragen, ob der Benutzer weitermachen möchte
            System.out.print("Möchten Sie eine weitere Berechnung durchführen? (y/n): ");
            // <your code here>
        }

        System.out.println("Auf Wiedersehen!");
        scanner.close();
    }
}
