Zeichen zählen
- Function Kata „Zeichen zählen“
- Entwickle eine Funktion, welche die Anzahl der in einem String vorkommenden Zeichen zählt. Die Eingabe der Funktion ist ein string, die Ausgabe ein Dictionary von char nach int:

IDictionary<char, int> CountCharacters(string input)
Der String „Das darf nicht sein“ liefert folgendes Ergebnis:

D:1, a:2, s:2, _:3, d:1, r:1, f:1, n:2, i:2, c:1, h:1, e:1, t:1
(Das Zeichen „_“ steht für ein Leerzeichen.)

Variation #1
Als Variation können Groß- und Kleinbuchstaben gleich behandelt werden. Der String „Das darf nicht sein“ liefert dann folgendes Ergebnis:

d:2, a:2, s:2, _:3, r:1, f:1, n:2, i:2, c:1, h:1, e:1, t:1
