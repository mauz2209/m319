# Graphical User Interface (GUI) in Java

## Lernziele
* Ich kann die Java-Entwicklungsumgebung IntelliJ IDEA nutzen, um ein Java-Programm mit einer grafischen Benutzeroberfläche (GUI) zu erstellen und auszuführen.

## Themen
* Erstellen eines einfachen GUI-Programms mit Java

## Graphical User Interface (GUI)
Ein Graphical User Interface (GUI) ermöglicht es Benutzern, mit einem Programm über grafische Elemente wie Fenster, Schaltflächen und Textfelder zu interagieren. Die meisten Programme, die Sie heutzutage nutzen, verfügen über eine GUI. Die Maus und andere Eingabegeräte haben dazu geführt, dass es den meisten Menschen einfacher fällt, GUI-Anwendungen (an Stelle von zum Beispiel rein textbasierten Interfaces) zu benutzen.  

## GUI in Java

In Java können GUIs mit Bibliotheken wie Swing oder JavaFX erstellt werden. Diese Bibliotheken bieten eine Vielzahl von vorgefertigten GUI-Komponenten, die es Entwicklern ermöglichen, ansprechende und funktionale Benutzeroberflächen zu gestalten.

```
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MeinFenster {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fenster = new JFrame("Mein erstes Fenster");
            fenster.setSize(400, 250);
            fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel text = new JLabel("Hallo, Welt!");
            fenster.add(text);

            fenster.setLocationRelativeTo(null); // zentriert
            fenster.setVisible(true);
        });
    }
}
```

Dieses einfache Java-Programm erstellt ein Fenster mit der Aufschrift "Hallo, Welt!". Es verwendet die Swing-Bibliothek, um die GUI-Komponenten zu erstellen und anzuzeigen.  
Klasse wie `JFrame` und `JLabel` sind Teil der Swing-Bibliothek. Sie existieren bereits in Java und müssen nicht selbst implementiert werden. Sie können diese Klassen direkt verwenden, um Ihre eigenen GUI-Anwendungen zu erstellen.  
In den Aufgaben werden Sie lernen, wie Sie diese und andere GUI-Komponenten nutzen können, um interaktive Anwendungen zu erstellen.