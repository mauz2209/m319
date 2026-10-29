# Die Java-Runtime installieren
## Ziel

* Du kannst auf deinem Computer ein Java-Programm mit der Java-Runtime Version 25 ausführen.

## Auftrag

* Prüfe, ob auf deinem Computer eine Java-Runtime der Version 25 installiert ist.
  * Öffne ein Terminal oder eine Eingabeaufforderung und gib `java -version` ein.
  * Wenn eine Version angezeigt wird, ist bereits eine Java-Runtime installiert.
  * Wenn keine java-Runtime installiert ist, wird eine Fehlermeldung angezeigt, die besagt, dass kein Programm mit dem Namen *Java* gefunden wurde.
* Wenn keine Java-Runtime der Version 25 installiert ist, musst du das nun nachholen.
  * Lade die Java-Runtime der Version 25 herunter: [Temurin JDK Downloads](https://adoptium.net/de/temurin/releases?version=25&os=any&arch=any)
  * Folge den Installationsanweisungen für dein Betriebssystem.
    * Während des Installationsvorganges musst du die Option "Java in PATH aufnehmen" auswählen. Dies ist notwendig, damit du Java von der Kommandozeile aus starten kannst.
    * Zudem musst du angeben, ob du Java nur für den aktuellen Benutzer oder für alle Benutzer auf dem Computer installieren möchtest. Wähle: Für alle Benutzer.
    * Wähle auch aus, dass die Umgebungsvariable *JAVA_HOME* gesetzt werden soll. Dies ist notwendig, damit genau diese Java-Version von anderen Programmen gefunden werden kann.
  * Prüfe nach der Installation erneut, ob die Java-Runtime der Version 25 installiert ist, indem du `java -version` in einem Terminal oder einer Eingabeaufforderung eingibst.

## Resultat

* Du hast auf deinem Computer eine Java-Runtime der Version 25 installiert.

## Form

* Einzelarbeit

## Zeit

* 20 Minuten