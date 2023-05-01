Token - reprezintă un token, cu un anumit număr de puncte.
ExplorationMap - reprezintă harta ce trebuie explorată și păstrează informații despre celulele vizitate și tokenii plasați pe hartă.
SharedMemory - reprezintă memoria partajată de toți roboții și conține toți tokenii ce trebuie plasați pe hartă.
Robot - reprezintă un robot care explorează harta și plasează tokeni pe celulele vizitate.
Exploration - reprezintă sistemul de explorare, care creează toate obiectele necesare și le folosește pentru a explora harta. Această clasă are și metode pentru pornirea și oprirea roboților, algoritm de explorare sistematică și cronometru pentru limita de timp.
Clasa TimeKeeper a fost creată pentru a afișa timpul de rulare și a opri explorarea dacă depășește o limită de timp dată.