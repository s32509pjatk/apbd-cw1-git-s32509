Project includes basic statistical methods in Java


1.Dlaczego tym razem merge nie był fast-forward?
  Merge gałęzi "feature-max" nie był fast-forward, ponieważ został dodany nowy niezależny commit na      gałęzi main, ktory nie istniał na feature-max, dlatego git musiał utworzyc merge commit.

Odpowiedzi na pytania

1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?
Fast-forward wykonuje sie kiedy chcemy zrobić merge naszej gałęzi main, a naszej nowo stworzonej gałęzi, wtedy kiedy nie mamy nowego commita na naszym mainie od momentu utworzenia nowej gałęzi,merge commit wykonuje sie kiedy mamy nowy niezalezny commit wtedy git musi scalic je.
2. Czym w praktyce różni się merge od rebase?
Merge tworzy nowy commit w celu scalenia gałęzi,przy czym zachowuje ich historię, a rebase przenosi commity z jednej gałezi na końcówke drugiej.
3. W jaki sposób został rozwiązany konflikt w Twoim repozytorium?
Konflikt w metodzie calculateMin został rozwiązany poprzez wybranie wersji uzywającej Math.min oraz poprzez usuniecie  markerów  konfliktu.Po rozwiazaniu został wykonany commit scalający.  
