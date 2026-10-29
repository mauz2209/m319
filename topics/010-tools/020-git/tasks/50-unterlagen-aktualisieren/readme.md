# Unterlagen aktualisieren

In diesem Auftrag aktualisierst du dein lokales Repository mit den neusten Unterlagen der Lehrperson.

Die Lehrperson informiert dich, wenn eine Aktualisierung notwendig ist.

## Lernziele

- Ich kann neue Änderungen vom Branch `main` in meinen eigenen Branch übernehmen.
- Ich kann meine lokale Arbeit nach einem Rebase wieder korrekt auf Codevogel übertragen.
- Ich kann kontrollieren, ob ich auf meinem eigenen Branch arbeite.

## 1. Eigenen Branch kontrollieren

Öffne ein Terminal im Repository.

Kontrolliere deinen aktuellen Branch:

~~~bash
git branch
~~~

Dein eigener Branch muss mit `*` markiert sein.

Beispiel:

~~~text
  main
* schneller
~~~

Falls du auf `main` bist, wechselst du zuerst auf deinen eigenen Branch:

~~~bash
git checkout [nachname]
~~~

## 2. Unterlagen aktualisieren

Hole die aktuellen Änderungen vom Branch `main` und übernimm sie in deinen eigenen Branch:

~~~bash
git pull --rebase origin main
~~~

Git setzt dabei deine eigenen Commits auf den aktuellen Stand von `main`.

## 3. Änderungen auf Codevogel übertragen

Nach einem Rebase hat sich die Commit-Historie deines Branches geändert.

Darum reicht ein normales `git push` nicht aus.

Übertrage deinen Branch mit:

~~~bash
git push --force-with-lease origin [nachname]
~~~

Beispiel:

~~~bash
git push --force-with-lease origin schneller
~~~

Verwende hier **`--force-with-lease`** und nicht `--force`.

`--force-with-lease` prüft vor dem Überschreiben, ob sich der Branch auf Codevogel unerwartet verändert hat.

## 4. Aktualisierung kontrollieren

Öffne das Repository auf Codevogel.

Wähle deinen eigenen Branch.

Kontrolliere, ob die neuen Unterlagen vorhanden sind.

Kontrolliere auch, ob deine bisherigen Lösungen weiterhin vorhanden sind.

## Wichtig

Führe diese Aktualisierung nur durch, wenn die Lehrperson dich dazu auffordert.

Die beiden Befehle gehören zusammen:

~~~bash
git pull --rebase origin main
git push --force-with-lease origin [nachname]
~~~

## Fertig, wenn ...

- du auf deinem eigenen Branch arbeitest.
- die aktuellen Änderungen von `main` übernommen wurden.
- deine bisherigen Lösungen weiterhin vorhanden sind.
- dein aktualisierter Branch auf Codevogel sichtbar ist.