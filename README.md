# Lezioni di Ingegneria del Software

Esempio di ereditarietà, polimorfismo, e del *design pattern* **Factory Method**. Le classi `Studente` e `Sospeso` implementano l'interfaccia `IStudente`. 
La classe `Client` dichiara un attributo `s` di tipo  `IStudente` e chiama alcune volte il metodo `nuovoEsame` su `s`. Il comportamento delle varie 
chiamate è diverso (polimorfo), poiché dipende dall'istanza puntata da `s` a runtime.
