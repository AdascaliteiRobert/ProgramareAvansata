Clasa Person:
-O facem de tip comparable si implementam interfata Node
-declaram variabilele name , birthDate si un Map prin care definim relatiile catre alte companii/persoane
-declaram constructorul unde initializam variabilele si un nou hashMap
-facem setter si getter pentru Relationship
-facem override la getter-ele pentru name , birthDate , dar si pentru compareTo , avand in vedere ca (,) clasa e de tip comparable

Clasele Programmer si Designer:
-sunt mostenite din clasa Person
-fiecare clasa are un getter specific 
-in contructorul fiecarei clase sunt initializate variabilele name , birthDate si variabilele specifice fiecarei clase (favoriteTool/favoriteLanguage)

Clasa Company:
-O facem de tip comparable si implementam interfata Node
declaram variabila name  si un Map prin care definim pozitia angajatilor in companie
-declaram constructorul unde initializam variabilele si un nou hashMap
-facem setter si getter pentru Employee
-facem override la getter-ele pentru name, dar si pentru compareTo , avand in vedere ca (,) clasa  e de tip comparable

Clasa Network:
-Declaram o lista de noduri pe care o initializam in constructor cu un ArrayList
-Facem setter pentru lista de noduri
-In metoda getNodeImportance verificam daca exista relatie intre persoane/companii, in caz afirmativ , stocam importanta intr un count
(cu cat count ul e mai mare , cu atat importanta creste)
-in metoda printNetwork sortam importanta persoanelor/companiilor dupa aceea iteram si afisam persoanele/companiile .
