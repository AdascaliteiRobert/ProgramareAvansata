2. Homework (2p)

Let n be an integer given as a command line argument. Validate the argument!
Create a n x n Latin Square as a matrix, having as symbols numbers from 1 to n.
For each line, and each column of the matrix, create and display on the screen String objects representing the concatenation of the symbols in the respective line or column.
For larger n display ONLY the running time of the application in nanoseconds or milliseconds. Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
Launch the application from the command line, for example: java Lab1 9.

-In prima faza , l-am initializat pe n (dimensiunea matricii) cu  "Integer.parseInt(args[0])" pentru a putea rula programu din terminal dandu-l ca parametru
(ex: java HomeWork 5).
-Dupa aceea , am construit matricea ceruta (Latin Square). Am folosit "System.nanoTime()" , iar cu variabilele startTime si endTime , pe care le am pus inainte , respectiv dupa crearea matricii si pentru a afla timpul de executie in nanosecunde , am scazut cele doua variabile. 
-Am printat matricea ceruta.
-Am folosit StringBuilder pentru a stoca concatenarea liniilor , respectiv coloanelor , pe care le-am afisat ulterior.


3. Bonus (2p)
Create the adjacency matrix A of a cycle graph Cn and compute the powers A2, A3, .... An. Give an interpretation of the result.

-In prima faza , l-am initializat pe n (numarul de muchii) cu  "Integer.parseInt(args[0])" pentru a putea rula programu din terminal dandu-l ca parametru
-Am creat matricea de adiacenta pentru cycle graph.
-Am creat 2 metode : matrixMultiplication care are ca parametrii doua matrici , si care face efectiv inmultirea celor doua
                   : printMatrix care are o matrice ca si parametru , si care afiseaza matricea data
-In final , am compus puterile matricilor de adiacenta cu ajutorul celor 2 metode.

