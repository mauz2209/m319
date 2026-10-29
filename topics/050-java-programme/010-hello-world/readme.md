# Die Programmiersprache Java

## Lernziele

* Ich kann ein einfaches Java-Programm erstellen und ausführen.
* Ich kann die Entwicklungsumgebung IntelliJ IDEA nutzen, um Java-Programme zu erstellen und auszuführen.

## Themen
* Vom Hamster-Programm zum Java-Programm
* Das erste eigenständige Programm

## Vom Hamster-Programm zum Java-Programm

Du hast bereits mit dem Hamster-Simulator gearbeitet und kennst den Java-Code darin gut. Du hast darin Befehle geschrieben, Funktionen definiert und mit Variablen, Bedingungen und Schleifen gearbeitet. Der Hamster-Simulator hat dabei vieles für dich vorbereitet: Er stellt unter anderem die Hamster-Klasse bereit und kümmert sich darum, dein Programm zu starten.

Java kann aber mehr als Hamster steuern. Mit Java lassen sich eigenständige Programme entwickeln, zum Beispiel Programme, die Texte ausgeben, Dateien verarbeiten oder Daten berechnen. Dazu brauchen wir ein Java-Programm, das unabhängig vom Hamster-Simulator gestartet werden kann.

## Das erste eigenständige Programm

Ein sehr einfaches Java-Programm gibt den Text `Hallo Welt!` aus:

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hallo Welt!");
	}
}
```

Auf den ersten Blick enthält dieses Programm mehr Schreibweise als ein einzelner Hamster-Befehl. Die einzelnen Bestandteile haben jedoch klare Aufgaben:

* `public class HelloWorld` definiert eine Klasse mit dem Namen `HelloWorld`. Eine Java-Datei enthält immer mindestens eine Klasse. Die Datei muss gleich heissen wie die Klasse: `HelloWorld.java`.
* `public static void main(String[] args)` ist die Startmethode des Programms. Wenn das Programm gestartet wird, beginnt Java die Ausführung bei dieser Methode. Jedes Java-Programm muss eine Startmethode haben, die genau so geschrieben ist. Die geschweiften Klammern `{` und `}` begrenzen den Block der Startmethode.
* `System.out.println("Hallo Welt!");` schreibt den Text in die Konsole. Der Text steht in Anführungszeichen und der Befehl endet wie gewohnt mit einem Semikolon. `System` ist eine vordefinierte Klasse, die unter anderem die Konsole bereitstellt. Du siehst: Alles in Java ist in Klassen organisiert.

Die Schreibweise innerhalb der `main`-Methode ist dir bereits bekannt: Auch im Hamster-Simulator stehen Anweisungen innerhalb von geschweiften Klammern und enden mit einem Semikolon. Neu ist vor allem, dass wir die Startklasse und die Startmethode selbst schreiben.

## Was beim Ausführen passiert

Die Datei `HelloWorld.java` enthält den lesbaren Java-Quellcode. Bevor der Computer ihn ausführen kann, wird er übersetzt. Der Java-Compiler erzeugt daraus Bytecode und speichert ihn normalerweise in einer Datei mit der Endung `.class`. Die Java-Laufzeitumgebung führt diesen Bytecode aus.

Damit besteht der Weg vom Quellcode zur Ausgabe aus drei Schritten:

1. Du schreibst den Quellcode in einer Datei wie `HelloWorld.java`.
2. Der Java-Compiler übersetzt den Quellcode in Bytecode.
3. Die Java-Laufzeitumgebung startet die `main`-Methode und führt den Bytecode aus.

Die Java-Laufzeitumgebung und ihre Rolle als Zwischenschicht hast du bereits im Thema [Java-Laufzeitumgebung](../../../010-tools/040-java/readme.md) kennengelernt.

## Von der Ausgabe zur Interaktion

`HelloWorld` zeigt nur eine Ausgabe und beendet sich danach. Das Programm kann aber genauso schrittweise erweitert werden, wie du es aus dem Hamster-Simulator kennst. Variablen speichern Werte, Bedingungen treffen Entscheidungen und Schleifen wiederholen Anweisungen. Der Unterschied ist, dass du nun selbst die Klasse und die Startmethode erstellst und statt der Hamster-Welt zunächst die Konsole verwendest.

In den nächsten Aufgaben erstellst und startest du dein erstes Java-Programm. Dabei lernst du auch die typische Struktur einer Java-Datei und die wichtigsten Schritte beim Kompilieren und Ausführen kennen.

## Variablen und Datentypen

Eine Variable ist ein benannter Speicherplatz. In ihr kann ein Programm einen Wert ablegen und später wieder verwenden. Im Hamster-Simulator hast du bereits Variablen kennengelernt. In einem eigenständigen Java-Programm kannst du zusätzlich viele Datentypen verwenden, die im Hamster-Code bisher keine wichtige Rolle gespielt haben.

Eine Variable wird mit ihrem Datentyp und ihrem Namen deklariert. Mit `=` erhält sie einen Wert:

```java
int alter = 16;
double temperatur = 21.5;
char anfangsbuchstabe = 'A';
boolean istAngemeldet = true;
String name = "Mia";
```

Der Datentyp legt fest, welche Art von Wert in der Variable gespeichert werden darf. Der Wert kann später durch eine Zuweisung geändert werden:

```java
alter = alter + 1;
name = "Noah";
```

Java prüft den Datentyp. Eine Zahl kann beispielsweise nicht einfach in einer `boolean`-Variable gespeichert werden. Dadurch erkennt der Compiler viele Fehler bereits, bevor das Programm gestartet wird.

## Wichtige Datentypen im Überblick

Java unterscheidet zwischen primitiven Datentypen und Klassen. Die primitiven Datentypen sind die grundlegenden Bausteine der Sprache:

| Datentyp | Beispiel | Bedeutung |
| --- | --- | --- |
| `int` | `42` | Ganze Zahlen |
| `long` | `9000000000L` | Sehr grosse ganze Zahlen |
| `double` | `3.14` | Kommazahlen |
| `float` | `3.14f` | Kommazahlen mit geringerer Genauigkeit |
| `boolean` | `true` oder `false` | Wahrheitswerte |
| `char` | `'A'` | Ein einzelnes Zeichen |
| `byte` | `127` | Kleine ganze Zahlen |
| `short` | `32000` | Ganze Zahlen im mittleren Wertebereich |

Für den Anfang sind vor allem `int`, `double`, `boolean` und `char` wichtig. Bei `char` werden einfache Anführungszeichen verwendet. Ein Text mit mehreren Zeichen wird dagegen mit doppelten Anführungszeichen geschrieben und hat den Datentyp `String`:

```java
char buchstabe = 'J';
String wort = "Java";
```

`String` ist kein primitiver Datentyp, sondern eine Klasse. Dass du einen `String` trotzdem so einfach verwenden kannst, liegt daran, dass Java diese Klasse bereits mitliefert.

## Primitive Datentypen und Klassen

Primitive Datentypen speichern einen einzelnen einfachen Wert direkt, zum Beispiel eine Zahl oder einen Wahrheitswert. Sie werden mit einem kleingeschriebenen Namen bezeichnet:

```java
int punkte = 10;
boolean gewonnen = false;
```

Eine Klasse beschreibt dagegen einen komplexeren Datentyp. Sie kann Daten und passende Methoden zusammenfassen. Eine Variable mit einem Klassentyp enthält vereinfacht gesagt einen Verweis auf ein Objekt dieser Klasse:

```java
String begruessung = "Hallo";
```

Ein `String` ist deshalb mehr als nur eine Folge einzelner Zeichen. Die Klasse stellt beispielsweise Methoden bereit, mit denen du die Länge des Textes bestimmen oder den Text in Grossbuchstaben umwandeln kannst:

```java
int anzahlZeichen = begruessung.length();
String grossgeschrieben = begruessung.toUpperCase();
```

Auch die Hamster-Klasse ist eine Klasse. Ein Hamster-Objekt enthält Eigenschaften und kann Methoden wie `vor()` oder `nimm()` ausführen. Im eigenständigen Java-Programm lernst du nun weitere Klassen kennen, zum Beispiel `String`. Der grundlegende Unterschied ist zunächst:

* Primitive Datentypen stehen für einfache Werte wie `7`, `2.5` oder `true`.
* Klassen stehen für komplexere Datentypen und können Daten sowie Methoden enthalten.

Diese Unterscheidung wird später bei der objektorientierten Programmierung noch genauer behandelt. Für den Moment genügt es, den passenden Datentyp zu wählen und Variablen verständlich zu benennen.

## IntelliJ IDEA als Entwicklungsumgebung

IntelliJ IDEA ist eine **Entwicklungsumgebung** für Java. Eine Entwicklungsumgebung, oft kurz IDE genannt, unterstützt dich beim Erstellen von Programmen. Sie ist mehr als ein einfacher Texteditor: In IntelliJ IDEA kannst du Java-Dateien anlegen und bearbeiten, Projekte organisieren, Fehler im Code erkennen und Programme direkt ausführen.

Für dieses Thema verwenden wir IntelliJ IDEA, um unsere Java-Programme zu schreiben und zu starten. Die Entwicklungsumgebung übernimmt dabei viele technische Schritte, zum Beispiel das Aufrufen des Java-Compilers und das Anzeigen der Programmausgabe. Java bleibt trotzdem die Programmiersprache: IntelliJ IDEA ist das Werkzeug, mit dem du den Java-Code bearbeitest.

## Intallation von IntelliJ IDEA
1. Lade die Installationsdatei von der offiziellen Webseite herunter: [https://www.jetbrains.com/idea/download](https://www.jetbrains.com/idea/download)
2. Starte die Installationsdatei und folge den Anweisungen des Installationsassistenten.
3. Erstelle einen Account auf jetbrains.com. Nutze dazu deine private E-Mail-Adresse.
4. Logge dich ein und löse eine *JetBrains Educational Pack*. Dazu musst du *eine neue Lizenz lösen*, was du über den entsprechenden Button machst (in der englischen version heisst der Button *Buy new license*).  
Achtung: Beim Lösen der Lizenz musst du die "Schul-E-Mail-Adresse" im entsprechenden Feld angeben. So wird geprüft, ob du die Lizenz für die Schule nutzen darfst.
5. Starte IntelliJ IDEA und verknüpfe deinen JetBrains-Account. Die Lizenz wird aktiviert.

## Ein Hello-World-Programm in IntelliJ IDEA erstellen

### 1. Neues Projekt anlegen

1. Starte IntelliJ IDEA.
2. Wähle **New Project** beziehungsweise **Neues Projekt**.
3. Wähle als Sprache **Java**.
4. Gib dem Projekt den Namen `HelloWorld`.
5. Wähle ein installiertes **JDK** aus. Das JDK enthält unter anderem den Compiler, den IntelliJ IDEA zum Übersetzen des Java-Codes benötigt.
6. Klicke auf **Create** beziehungsweise **Erstellen**.

IntelliJ IDEA erstellt nun ein Projekt und zeigt es im Projektfenster an. Java-Dateien werden normalerweise im Ordner `src` abgelegt.

### 2. Java-Klasse erstellen

1. Klicke im Projektfenster mit der rechten Maustaste auf den Ordner `src`.
2. Wähle **New > Java Class** beziehungsweise **Neu > Java-Klasse**.
3. Gib als Namen `HelloWorld` ein und bestätige mit der Eingabetaste.

IntelliJ IDEA erstellt die Datei `HelloWorld.java`. Der Klassenname und der Dateiname stimmen dabei überein. Ergänze den folgenden Code:

```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hallo Welt!");
	}
}
```

Speichere die Datei. IntelliJ IDEA markiert Fehler im Code direkt im Editor. Achte besonders auf die grossgeschriebene Schreibweise von `HelloWorld`, die runden Klammern und die Semikolons.

### 3. Programm ausführen

1. Klicke links neben der Zeile mit `main` auf das grüne Dreieck.
2. Wähle **Run 'HelloWorld.main()'** beziehungsweise **'HelloWorld.main()' ausführen**.

IntelliJ IDEA übersetzt das Programm und startet danach die `main`-Methode. Im unteren Fenster erscheint die **Run-Konsole**. Dort sollte folgende Ausgabe stehen:

```text
Hallo Welt!
```

Wenn du den Text im Quellcode änderst, kannst du das Programm mit dem grünen Startsymbol erneut ausführen. Das Programm wird dabei jedes Mal neu übersetzt und gestartet.

### Häufige Fehler

* Die Klasse heisst `HelloWorld`, die Datei muss deshalb `HelloWorld.java` heissen.
* Java unterscheidet zwischen Gross- und Kleinschreibung. `String` und `string` sind nicht dasselbe.
* Die Methode muss genau `public static void main(String[] args)` heissen, damit IntelliJ IDEA sie als Startmethode erkennt.
* Fehlt ein Semikolon oder eine geschweifte Klammer, kann das Programm nicht erfolgreich übersetzt werden.
