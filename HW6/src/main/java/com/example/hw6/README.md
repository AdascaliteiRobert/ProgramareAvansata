ConfigPanel.java - Aceasta este o clasă Java care definește panoul de configurare pentru aplicație. Acest panou are un set de controale care permit utilizatorului să configureze jocul, cum ar fi numărul de linii care trebuie trase și numărul de jucători implicați.

ControlPanel.java - Aceasta este o clasă Java care definește panoul de control pentru aplicație. Acest panou are butoane care permit utilizatorului să înceapă un joc nou sau să salveze / încarce jocurile anterioare.

Dot.java - Aceasta este o clasă Java care reprezintă un punct în joc. Acesta are o listă de puncte adiacente și o metodă pentru a verifica dacă punctul este liber sau ocupat.

DrawingPanel.java - Aceasta este o clasă Java care definește panoul de desenare pentru aplicație. Acest panou primește informații despre starea jocului și desenează tabloul de joc și liniile trase de utilizator.

Board.java - Aceasta este o clasă Java care reprezintă tabloul de joc. Acesta are o listă de puncte și o listă de linii.

Game.java - Aceasta este o clasă Java care reprezintă jocul. Acesta are o instanță de Board și o instanță de Player care reprezintă jucătorul curent și câștigătorul.

Line.java - Aceasta este o clasă Java care reprezintă o linie trase în joc. Acesta are două puncte și o culoare, și reține dacă linia este selectată sau nu.

MainFrame.java - Aceasta este o clasă Java care definește fereastra principală pentru aplicație. Acesta are trei panouri: ConfigPanel, ControlPanel și DrawingPanel.

Player.java - Aceasta este o clasă Java care reprezintă un jucător în joc. Acesta are un nume și o culoare.