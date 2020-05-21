# Heritage
Crée une classe abstraite Vehicle

2.
Ajoute les attributs String brand et int kilometers

3.
Crée un constructeur permettant d'initialiser brand et kilometers 

4.
Ajoute des getters et setters pour tous les attributs, en respectant les conventions

5.
Crée une classe  Car qui étend la classe Vehicle

6.
Crée une classe  Boat qui étend la classe Vehicle

7.
Ajoute dans Vehicle la méthode abstraite public String doStuff()

8.
Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour Boat : "Je suis {brand} et je fais glou glou !"

9.
Crée une classe  Hangar qui possédera une méthode main()

10.
Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar

11.
Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()

12.
Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub

13.
Partage le lien du dépôt GitHub en solution

Exemple de résultat attendu lors de l'exécution de Hangar :

$ Je suis Clio et je fais vroum vroum !
$ Je suis Titanic et je fais glou glou !
