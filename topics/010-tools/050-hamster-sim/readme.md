# Der Hamster-Simulator
## Lernziele

* Ich kann die Java-Applikation "Hamster-Simulator" auf meinem Computer installieren und starten.
* Ich kann selbst steuern, welche Version der Java-Laufzeitumgebung beim Start einer Java-Applikation verwendet wird.

## Themen
* Konfiguration und Starten der Java-Applikation "Hamster-Simulator" mit der von mir gewählten Java-Version.

## Übersicht
Die ersten Schritte in der Programmierung werden wir mit der visuellen Programmierumgebung **Hamster-Simulator** machen. Du übst zuerst, einfache Abläufe zu programmieren. Mit dem *Hamster* können aber auch weitere, grundlegende Konzepte der Programmierung geübt werden, wie z.B. das Konzept von Klassen aus der Objektorientierten Programmierung.  

Der *Hamster-Simulator* ist selbst eine Java-Applikation. Diese Applikation ermöglicht es dir, selbst Programme (Applikationen) zu schreiben und auszuführen.  

Der Hamster-Simulator ist also eine **Entwicklungsumgebung** und eine **Laufzeitumgebung** für Hamster-Programme.

## Laufzeitumgebung und Entwicklungsumgebung
Den Begriff **Laufzeitumgebung** hast du bereits kennengelernt. Eine Laufzeitumgebung ist eine Applikation, die es ermöglicht, Programme auszuführen.  
Eine **Entwicklungsumgebung** ist eine Applikation, die es ermöglicht, Programme zu schreiben und zu testen.  
Wenn du eine Applikation schreibst, arbeitest du also in einer Entwicklungsumgebung. Wenn die Applikation fertig ist und ein Benutzer sie startet, braucht er dazu eine Laufzeitumgebung.

![Entwicklungsumgebung und Laufzeitumgebung](../../../../img/devenvironment.png)

Das Programm *Hamster-Simulator* ist beides: Eine Entwicklungsumgebung, in der du Programme schreiben und testen kannst, und eine Laufzeitumgebung, um Hamster-Programme auszuführen.

| Umgebung | Zweck | Beispiel Java |
| --- | --- | --- |
| Entwicklungsumgebung | Das Programm, in welchem ein Softwareentwickler Programme schreibt. | Eclipse, IntelliJ IDEA |
| Laufzeitumgebung | Die Umgebung, in der ein Programm ausgeführt wird. | Java Virtual Machine (JVM) |

## Starten des Hamster-Simulators
Der Hamster-Simulator ist eine Java-Applikation. Um den Hamster-Simulator auf deinem Computer auszuführen, musst du daher eine Java-Laufzeitumgebung installieren. Dies hast du bereits mit der Aufgabe [00 - Java installieren](./tasks/00-java_installieren.md) erledigt.  
Nun kannst du den Hamster-Simulator starten. Das Programm selbst besteht aus der Datei `hamstersimulator-pure-java25.jar` im Ordner *hamster-sim* in diesem Repo. Um die Applikation zu starten, musst du deinem Computer aber noch einige Informationen mitteilen.

* `java`: Mit diesem Befehl teilst du dem Computer mit, dass du eine Java-Applikation starten möchtest.
   * Es wird die Standard-Java-Laufzeitumgebung verwendet, die du installiert hast. Dafür hast du während der Installation der Java-Laufzeitumgebung die Umgebungsvariable `JAVA_HOME` gesetzt.
   * Möchtest du eine andere Java-Laufzeitumgebung verwenden? Dann musst du den Befehl `java` mit dem vollständigen Pfad zu der gewünschten Java-Laufzeitumgebung ausführen. Beispiel: `C:\Programme\Java\jdk-17.0.2\bin\java.exe -jar hamstersimulator-pure-java25.jar`
* `uiScale`: Mit diesem Parameter kannst du die Größe der Benutzeroberfläche des Hamster-Simulators anpassen.

Den kompletten Befehl zum Starten des Hamster-Simulators findest du in der Datei `hamster-start.bat` im Ordner hamster-sim.  

## Benutzeroberfläche des Hamster-Simulators
Die Benutzeroberfläche des Hamster-Simulators besteht aus zwei Bereichen:
* Der **Editor**: In diesem Bereich kannst du Programme schreiben und testen. Es ist die Entwicklungsumgebung des Hamster-Simulators.
* Die **Simulation**: In diesem Bereich kannst du ein Hamster-Territorium sehen und ein Programm ausführen, welches du geschrieben hast. Es ist die Laufzeitumgebung des Hamster-Simulators.

![Benutzeroberfläche des Hamster-Simulators](../../../../img/hamster-simulator-1.png)

## Ein Programm schreiben
Um ein Programm zu schreiben, gehst du wie folgt vor:
1. Starte den Hamster-Simulator.
2. Klicke auf den Button **Neu**. Wähle *imperatives Java-Programm* aus.
3. Schreibe dein erstes Programm: Gib den folgenden Code in den Editor ein:

```java
void main() {
    vor();
}
```
4. Speichere das Programm unter dem Namen `ErstesProgramm`.
5. Kompiliere das Programm, indem du auf den Button **Kompilieren** klickst.
   * Wenn das Programm erfolgreich kompiliert wurde, siehst du die Meldung **Kompilierung erfolgreich**.
   * Wenn das Programm nicht kompiliert werden konnte, siehst du eine Fehlermeldung. In diesem Fall musst du den Fehler beheben und das Programm erneut kompilieren.

> Hinweis: Ein Programm zu **kompilieren** bedeutet, dass der Code in eine Form gebracht wird, die von der Laufzeitumgebung ausgeführt werden kann. Du musst ein Programm immer kompilieren, nachdem du eine Änderung gemacht hast.

## Ein Programm ausführen
Du hast nun ein erstes Programm geschrieben. Um das Programm auszuführen und zu testen, nutzen wir die **Simulation**.  
Klicke dazu im Fenster *Simulation* auf den Button **Ausführen**.

Nun sollte sich der Hamster im Territorium um ein Feld nach vorne bewegen. Im Folgenden siehst du, wie die Benutzeroberfläche des Hamster-Simulators aussieht, nachdem du das Programm ausgeführt hast.
* Im *Editor* siehst du den Code, den du geschrieben hast.
* In der *Simulation* siehst du das Hamster-Territorium. Der Hamster hat sich um ein Feld nach vorne bewegt.
* Im rechten Bereich siehst du die Befehle, die der Hamster ausgeführt hat (`vor();`).

![Das Programm wurde ausgeführt](../../../../img/hamster-simulator-2.png)

## Ein Territorium erstellen
Du hast bereits gesehen: Im Hamster-Simulator geht es darum, mit deinen Befehlen einen Hamster durch ein Territorium zu bewegen. Das Territorium ist also die Umgebung, in der der Hamster lebt.
Um interessantere Programme zu programmieren, kannst du das Territorium selbst gestalten. Dazu kannst du im *Simulation*-Fenster das Territorium mit verschiedenen Elementen gestalten:
- Mauern: Auf diese Felder kann der Hamster nicht laufen.
- Körner: Du kannst Körner auf Felder legen, die der Hamster aufnehmen kann.
- Hamster: Du kannst den Hamster auf ein Feld setzen (Startposition), ihn drehen und ihm Körner in's Maul legen.
  
Ein Territorium kann gespeichert werden und dient als Grundlage für Aufgaben, die du mittels eines Programms lösen musst.

## Debugging
Stell dir vor: Du hast ein Programm geschrieben, das den Hamster durch ein Territorium bewegen soll. Doch der Hamster verhält sich nicht so, wie du es erwartet hast. Irgendwo in deinem komplexen Programm steckt ein Fehler. Du musst den Fehler finden und beheben. Diesen Vorgang nennt man **Debugging**.

Dazu bietet der Hamster-Simulator ein Hilfsmittel: Den Debugger. Mit dem Debugger kannst du im Hamster-Simulator den Ablauf des Programms Schritt für Schritt verfolgen, um herauszufinden, wo der Fehler liegt.

1) Bevor du das Programm ausführst, klickst du auf den Button **Debugger aktivieren**. Die "Schritt-für-Schritt-Ausführung" ist nun aktiviert.
2) Starte das Programm nun wie gewohnt. Der Hamster führt nun jeden Befehl langsam nacheinander aus.
   - Du kannst den Hamster pausieren, um den aktuellen Zustand des Territoriums zu beobachten.
   - Du kannst den nächsten Befehl einzeln ausführen, um zu sehen, wie sich der Zustand des Territoriums verändert.

Auf diese Weise kannst du den Fehler in deinem Programm finden und danach beheben.

![Debugging](../../../../img/hamster-simulator-3.png)