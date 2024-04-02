# Lezioni di Ingegneria del Software

Esempio di ereditarietà, polimorfismo, e del *design pattern* **Factory Method**. Le classi `Studente` e `Sospeso` sono ConcreteProduct e implementano l'interfaccia `IStudente`. La classe astratta `Creator` implementa l'operazione `creaStudente()` che usa il metodo astratto `getStudente()`. La classe `StCreator` svolge il ruolo ConcreteCreator e implementa il factory method `getStudente()`. 
La classe `Client` dichiara un attributo `s` di tipo  `IStudente` e lo assegna con l'istanza fornita da Creator. Su `s` si chiama alcune volte il metodo `nuovoEsame`. Il comportamento delle varie 
chiamate è diverso (polimorfo), poiché dipende dall'istanza puntata da `s` a runtime.

![studenteFactMet](https://github.com/e-tramontana/IS-Lez-5/assets/73878438/7e2a38c6-85ca-437b-aad9-4694b1eaecec)
