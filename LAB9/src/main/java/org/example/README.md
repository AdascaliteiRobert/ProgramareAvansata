Proiectul este structurat în următoarele pachete:

org.example: Conține clasele principale ale proiectului.
org.example.Albums: Clasa care reprezintă entitatea "album" și este mapată către tabela "albums" din baza de date.
org.example.AlbumsRepository: Clasa care gestionează operațiile de persistență pentru entitatea "album".
org.example.Singleton: Clasa care implementează Singleton Pattern și este utilizată pentru a obține o instanță a EntityManagerFactory.
org.example.Main: Clasa principală a aplicației, care conține metoda main și demonstrează utilizarea clasei AlbumsRepository pentru a interacționa cu baza de date.
META-INF: Conține fișierul persistence.xml care configurează setările de conectare și persistență pentru JPA și Hibernate.
