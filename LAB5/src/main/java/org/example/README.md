Clasa Document:
-declaram variabilele id, name , location si un map <string , string> tags
-initializam variabilele in constructor 
-facem getters pentru toate variabilele si un setter pentru tags un bagam valori in map

Clasa Catalog:
-declaram o lista de tipul Document
-in metoda addDocument adaugam valori in lista
-declaram setter pentru Document
-in metoda toString () iteram in 'documents' si adaugam intr-un string builder valori (name, location) pe care le adaugam ulterior in map. In final vom da return la sb
-in metoda save aruncam initial o exceptie, declaram un ObjectMapper si scriem efectiv intr-un fisier de tip json
-in metoda load aruncam initial o exceptie , declaram un ObjectMapper , dupa aceea citim din fisier

Clasa Catalog Manager:
-declaram o variabila de tipul Catalog;
-declaram metoda addDocument unde iteram si adaugam tag-urile in document dupa aceea le adaugam in catalog
-prin metoda PrintCatalog() afisam efectiv catalogul
in metedole saveCatalog , loadCatalog salvam , respectiv citim din fisier.
