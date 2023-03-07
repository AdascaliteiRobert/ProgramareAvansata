Create a class that describes an instance of the problem.
Override the Object.equals method for the Location and Road classes. The problem should not allow adding the same location or road twice.
Instead of using an enum, create dedicated classes either for locations: cities, air ports, gas stations etc. or roads: highway, express, country, etc. Each concrete location class may have additional specific propertes (population, number of terminals, gas price, etc.)
Implement a method that determines if a problem's instance is valid.
Implement an algorithm for determining if it is possible to go from one location to another using the given roads.
Write doc comments in your source code and generate the class documentation using javadoc.

Clasa Location:
-Cream mai intai o clasa abstracta Location
-Initializam variabilele: name , type , X, Y
-Facem setters si getters
-Dam Override la toString, la Object.equals si la HashCode

Clasa Road:
-Cream mai intai o clasa abstracta Location
-Initializam variabilele name , speed , start , end ,type , lenght
-Facem setters si getters
-Dam Override la toString, la Object.equals si la HashCode
-Dam Override la toString, la Object.equals si la HashCode

Clasele City , Airport , GasStation mostenesc clasa Location . 
La acestea se adauga variabilele specifice ( population , price , nrTerminali, type) carora le facem settere si gettere 

Clasele Highway , Express si Country mostenesc clasa Road la care adaugam doar variabila type careia ii facem setter si getter.

Clasa Instance
