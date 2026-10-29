# Aufgabe – Der richtige Durchgang

Der Hamster soll das Ziel erreichen.

Das Ziel ist durch **zwei Körner** markiert.

![Territorium Der richtige Durchgang](../../../../../img/030-100-01-korn-und-freier-weg-ter.png)

Auf seinem Weg findet der Hamster mehrere Durchgänge auf der rechten Seite.

Er darf einen Durchgang nur nehmen, wenn **rechts ein Weg frei ist und auf seinem aktuellen Feld ein Korn liegt**.

## Lernziel

Ich kann zwei Bedingungen mit dem logischen Operator AND (`&&`) verbinden, damit der Hamster einen Durchgang nur nimmt, wenn `rechtsFrei()` und `kornDa()` gleichzeitig `true` sind.

## Auftrag

1. Erstelle den Ordner `030-100-01-korn-und-freier-weg` im Ordner `/hamster-sim/Programme`.
2. Erstelle das vorgegebene Territorium mit dem Hamster-Simulator und speichere es.
3. Programmiere den Hamster so, dass er selbstständig nach dem richtigen Durchgang sucht.
4. Prüfe, ob rechts vom Hamster ein Weg frei ist.
5. Prüfe gleichzeitig, ob auf dem aktuellen Feld ein Korn liegt.
6. Verbinde `rechtsFrei()` und `kornDa()` mit dem logischen Operator `&&`.
7. Nimm einen Durchgang nur, wenn **beide Bedingungen** erfüllt sind.
8. Ist nur eine der beiden Bedingungen erfüllt, darf der Hamster den Durchgang nicht nehmen.
9. Das Ziel ist das Feld mit zwei Körnern.
10. Der Hamster soll am Ziel stehen bleiben.
11. Teste dein Programm im Hamster-Simulator.

Dein Programm ist fertig, wenn der Hamster nur einen erlaubten Durchgang nimmt und das mit zwei Körnern markierte Ziel erreicht.