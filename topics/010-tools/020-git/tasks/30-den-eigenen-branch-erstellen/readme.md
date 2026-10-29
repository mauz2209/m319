# Den eigenen Branch erstellen

In diesem Auftrag erstellst du deinen persönlichen Branch.

Ein **Branch** ist ein eigener Entwicklungszweig innerhalb eines Git-Repositorys.

Alle deine Lösungen werden in deinem persönlichen Branch gespeichert.

Der Branch `main` enthält die von der Lehrperson bereitgestellten Inhalte.

Du arbeitest **nicht direkt auf `main`**.

## Lernziele

* Ich kann in einem Git-Repository einen eigenen Branch erstellen.
* Ich kann anhand der Ausgabe von Git kontrollieren, auf welchem Branch ich arbeite.
* Ich kann meinen eigenen Branch auf Codevogel veröffentlichen.

## Auftrag

### 1. In das Repository wechseln

Öffne die git-Bash.

Wechsle in dein Repository:

~~~bash
cd m319
~~~

### 2. Aktuellen Branch kontrollieren

Führe folgenden Befehl aus:

~~~bash
git branch
~~~

Der aktuelle Branch ist mit einem `*` gekennzeichnet.

Zu Beginn solltest du dich auf `main` befinden.

Beispiel:

~~~text
* main
~~~

### 3. Eigenen Branch erstellen

Dein Branch erhält deinen **Nachnamen** als Namen.

Beispiel:

~~~bash
git checkout -b schneller
~~~

Ersetze `schneller` durch deinen eigenen Nachnamen.

## Namensregeln

Für den Branch-Namen gelten folgende Regeln:

- nur Kleinbuchstaben
- keine Leerzeichen
- keine Umlaute
- keine Sonderzeichen ausser `-`
- mehrere Namensteile werden mit `-` getrennt

Beispiele:

| korrekt | falsch |
| --- | --- |
| `mueller` | `Müller` |
| `meier` | `Meier` |
| `dias-cruz` | `dias cruz` |
| `von-arx` | `von_arx` |

Umlaute werden ersetzt:

~~~text
ä → ae
ö → oe
ü → ue
~~~

### 4. Branch kontrollieren

Führe erneut folgenden Befehl aus:

~~~bash
git branch
~~~

Jetzt muss dein eigener Branch mit `*` markiert sein.

Beispiel:

~~~text
  main
* schneller
~~~

### 5. Branch auf Codevogel veröffentlichen

Übertrage deinen Branch auf Codevogel:

~~~bash
git push -u origin [nachname]
~~~

Beispiel:

~~~bash
git push -u origin schneller
~~~

Die Option `-u` verbindet deinen lokalen Branch mit dem entsprechenden Branch auf Codevogel.

Bei späteren Änderungen reicht deshalb:

~~~bash
git push
~~~

### 6. Branch auf Codevogel kontrollieren

Öffne das Repository auf Codevogel.

Kontrolliere, ob dein Branch vorhanden ist.

## Wichtig

Ab jetzt arbeitest du **ausschliesslich in deinem eigenen Branch**.

Du erstellst keinen eigenen Lösungsordner mit deinem Namen.

Deine Lösungen werden durch deinen Branch von den Lösungen der anderen Lernenden getrennt.

Es gibt keine Merges von deinem Branch nach `main`.

## Fertig, wenn ...

- dein Branch den vorgegebenen Namensregeln entspricht.
- `git branch` deinen eigenen Branch als aktuellen Branch anzeigt.
- dein Branch auf Codevogel vorhanden ist.