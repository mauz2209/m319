# Mehr zu Git

In diesem Auftrag lernst du weitere wichtige Git-Befehle kennen.

Du brauchst diese Befehle nicht bei jeder Aufgabe.

Sie helfen dir, wenn du zwischen Branches wechseln, Fehler korrigieren oder Konflikte lösen musst.

## Lernziele

- Ich kann zwischen vorhandenen Branches wechseln.
- Ich kann den aktuellen Zustand meines Repositorys mit `git status` kontrollieren.
- Ich kann die letzten Commits anzeigen.
- Ich kann die Commit-Message meines letzten Commits ändern.
- Ich kann lokale Änderungen vor einem Commit rückgängig machen.
- Ich kann Dateien aus der Staging Area entfernen.
- Ich kann einen einfachen Merge-Konflikt lokal lösen und den Rebase fortsetzen.

## 1. Status kontrollieren

`git status` ist einer der wichtigsten Git-Befehle.

Führe ihn aus, wenn du nicht sicher bist, in welchem Zustand sich dein Repository befindet:

~~~bash
git status
~~~

Git zeigt dir unter anderem:

- deinen aktuellen Branch
- veränderte Dateien
- neue Dateien
- Dateien in der Staging Area
- einen laufenden Rebase
- vorhandene Konflikte

**Tipp:** Wenn bei Git etwas nicht wie erwartet funktioniert, ist `git status` meistens der erste sinnvolle Befehl.

## 2. Branches anzeigen und wechseln

Zeige zuerst deine lokalen Branches an:

~~~bash
git branch
~~~

Der aktuelle Branch ist mit `*` markiert.

Beispiel:

~~~text
  main
* schneller
~~~

Wechsle auf einen vorhandenen Branch:

~~~bash
git checkout [branch]
~~~

Beispiel:

~~~bash
git checkout main
~~~

Wechsle wieder auf deinen eigenen Branch:

~~~bash
git checkout schneller
~~~

Kontrolliere danach:

~~~bash
git branch
~~~

### Wichtig

Deine Lösungen erstellst und bearbeitest du immer auf deinem eigenen Branch.

## 3. Letzte Commits anzeigen

Mit folgendem Befehl kannst du die letzten Commits anzeigen:

~~~bash
git log --oneline
~~~

Die Ausgabe sieht beispielsweise so aus:

~~~text
71c9a82 solution: 020-010-20-schleifen
38d15bf solution: 020-010-10-erste-schritte
e9401cd update hamster simulator
~~~

Jeder Commit besitzt eine eindeutige ID und eine Commit-Message.

Mit `q` beendest du die Anzeige wieder.

## 4. Letzte Commit-Message ändern

Du hast einen Commit erstellt und danach einen Fehler in der Commit-Message entdeckt.

Beispiel:

~~~text
solution: 020-010-20-schliefen
~~~

Solange es sich um den **letzten Commit** handelt, kannst du die Message ändern:

~~~bash
git commit --amend -m "solution: 020-010-20-schleifen"
~~~

Kontrolliere das Ergebnis:

~~~bash
git log --oneline
~~~

### Commit wurde bereits gepusht

Falls du den Commit bereits auf Codevogel übertragen hast, hat das Ändern des Commits auch seine ID verändert.

Ein normales `git push` funktioniert deshalb nicht mehr.

Verwende:

~~~bash
git push --force-with-lease
~~~

Verwende nicht `--force`.

## 5. Lokale Änderungen rückgängig machen

Du hast eine Datei verändert, aber noch keinen Commit erstellt.

Du möchtest deine Änderungen verwerfen und wieder die letzte gespeicherte Version verwenden.

Kontrolliere zuerst:

~~~bash
git status
~~~

Setze danach eine bestimmte Datei zurück:

~~~bash
git restore [datei]
~~~

Beispiel:

~~~bash
git restore hamster-sim/Programme/meine-aufgabe/Programm.java
~~~

### Achtung

Die lokalen Änderungen an dieser Datei gehen dabei verloren.

Verwende den Befehl nur, wenn du diese Änderungen wirklich nicht mehr benötigst.

## 6. Datei aus der Staging Area entfernen

Du hast versehentlich eine Datei mit `git add` für den nächsten Commit ausgewählt.

Kontrolliere:

~~~bash
git status
~~~

Entferne die Datei wieder aus der Staging Area:

~~~bash
git restore --staged [datei]
~~~

Die Datei wird dadurch **nicht gelöscht**.

Deine Änderungen bleiben erhalten.

Kontrolliere danach erneut:

~~~bash
git status
~~~

## 7. Konflikte lokal lösen

Beim Aktualisieren der Unterlagen verwendest du:

~~~bash
git pull --rebase origin main
~~~

Falls du und die Lehrperson dieselbe Stelle einer Datei verändert habt, kann Git die Änderungen möglicherweise nicht automatisch zusammenführen.

Es entsteht ein **Konflikt**.

Git stoppt den Rebase.

### Konflikte anzeigen

Führe aus:

~~~bash
git status
~~~

Git zeigt dir die betroffenen Dateien.

### Konflikt in der Datei suchen

Öffne eine betroffene Datei.

Git kennzeichnet die unterschiedlichen Versionen beispielsweise so:

~~~text
<<<<<<< HEAD
Inhalt aus main
=======
Inhalt aus deinem Commit
>>>>>>> 71c9a82
~~~

Entscheide, welcher Inhalt erhalten bleiben soll.

Du kannst auch beide Versionen sinnvoll zusammenführen.

Entferne danach die Konfliktmarkierungen:

~~~text
<<<<<<<
=======
>>>>>>>
~~~

Die fertige Datei darf diese Markierungen nicht mehr enthalten.

### Gelösten Konflikt markieren

Nachdem du die Datei korrigiert und gespeichert hast:

~~~bash
git add [datei]
~~~

Kontrolliere:

~~~bash
git status
~~~

### Rebase fortsetzen

Wenn alle Konflikte gelöst sind:

~~~bash
git rebase --continue
~~~

Falls weitere Konflikte auftreten, wiederholst du die Schritte.

Nach dem erfolgreichen Rebase überträgst du deinen Branch wieder auf Codevogel:

~~~bash
git push --force-with-lease origin [nachname]
~~~

## 8. Rebase abbrechen

Falls beim Rebase etwas schiefläuft und du nicht weiterkommst, kannst du den Rebase abbrechen:

~~~bash
git rebase --abort
~~~

Git versucht damit, den Zustand vor dem Rebase wiederherzustellen.

Danach kannst du die Situation kontrollieren:

~~~bash
git status
~~~

Hole bei Bedarf die Lehrperson dazu.

## Git-Spickzettel

| Aufgabe | Befehl |
| --- | --- |
| Status anzeigen | `git status` |
| Branches anzeigen | `git branch` |
| Branch wechseln | `git checkout [branch]` |
| Commits anzeigen | `git log --oneline` |
| Dateien vormerken | `git add .` |
| Commit erstellen | `git commit -m "..."` |
| letzte Commit-Message ändern | `git commit --amend -m "..."` |
| lokale Änderung verwerfen | `git restore [datei]` |
| Datei aus Staging entfernen | `git restore --staged [datei]` |
| Änderungen hochladen | `git push` |
| Änderungen von `main` übernehmen | `git pull --rebase origin main` |
| Rebase fortsetzen | `git rebase --continue` |
| Rebase abbrechen | `git rebase --abort` |
| Branch nach Rebase hochladen | `git push --force-with-lease origin [nachname]` |

## Fertig, wenn ...

- du mit `git status` den Zustand deines Repositorys kontrollieren kannst.
- du zwischen vorhandenen Branches wechseln kannst.
- du mit `git log --oneline` deine letzten Commits anzeigen kannst.
- du die Message des letzten Commits ändern kannst.
- du lokale Änderungen vor einem Commit rückgängig machen kannst.
- du eine Datei wieder aus der Staging Area entfernen kannst.
- du die Konfliktmarkierungen eines Merge-Konflikts erkennst.
- du einen Konflikt lokal lösen und einen Rebase fortsetzen kannst.
- du einen fehlerhaften Rebase bei Bedarf abbrechen kannst.