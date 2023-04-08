Robot
Clasa Robot implementează interfața Runnable și definește un robot care explorează harta și extrage token-uri din memoria partajată. Un robot are un nume și un flag running care indică dacă acesta rulează sau nu. În metoda run, robotul explorează o celulă aleatoare de pe hartă, extrage token-uri și face o pauză de 100 milisecunde. Clasa are și o metodă stop care oprește rularea robotului.

Exploration
Clasa Exploration este clasa principală care pornește simularea. Aceasta are o hartă de explorat, o memorie partajată pentru token-uri și o listă de roboți care explorează harta. Metoda start pornește roboții și așteaptă ca aceștia să termine.

ExplorationMap
Clasa ExplorationMap reprezintă harta de explorat. Aceasta este o matrice de celule, unde fiecare celulă are un flag care indică dacă a fost vizitată și o listă de token-uri care au fost extrase de pe celula respectivă. Clasa are o metodă visit care marchează o celulă ca fiind vizitată și adaugă token-urile extrase la celula respectivă. Clasa are și o metodă toString care afișează harta de explorat sub formă de matrice.

SharedMemory
Clasa SharedMemory reprezintă memoria partajată pentru token-uri. Aceasta conține o coadă de token-uri, care sunt extrase din memorie de roboți.

Token
Clasa Token reprezintă un token. Fiecare token are un număr unic care îl identifică.