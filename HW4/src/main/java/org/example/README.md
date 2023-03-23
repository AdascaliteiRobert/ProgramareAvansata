Clasa Student:
-o facem de tip comparable
-declaram variabila name si un list<Project> projects
-declaram un constructor default si un constructor unde initializam variabilele
-facem getters si setters pentru name si admissibleProjects
-dam override la toString si compareTo

Clasa Problem:
-declaram un map: Map<Student, List<Project>> prefMap
-dclaram un constructor default si un constructor unde initializam map -ul
-in metoda newKey punem valori in map 
-in metoda getLowPref verificam daca un student are numarul de preferinte mai mic decat media numarului de preferinte
-facem getter si setter pentru prefMap
-dam override la toString

Clasa Project:
-o facem de tip comparable 
-declaram variabila name
-declaram un constructor default si un construcor unde initializam variabila name
-facem getter si setter pentru variabila name 
-dam override la toString si compareTo

Clasa Solve:
-declaram o variabila de tip Problem si doua map-uri 
-prin constructorul Solve initializam variabila de tip Problem , iteram in lista de proiecte preferate si le facem disponibile
-in metoda greedySolve iteram pentru fiecare student in lista de proiecte preferate si verifica daca proiectul este disponibil
Daca proiectul e disponibil , actualizam map-ul si setam proiectul respectiv ca fiind indisponibil 
-facem getter si setter pentru solution
-dam override la toString