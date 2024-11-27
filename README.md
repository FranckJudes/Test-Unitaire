# Test-Unitaire
Voici un exemple de fichier **`README.md`** pour décrire votre projet et fournir des instructions claires aux utilisateurs.

---

# **Test Logiciel avec Résolution Dynamique d'Équations**

Ce projet implémente un programme Java pour lire des combinaisons de coefficients générées dynamiquement à partir d'un fichier (`jenny_wordlist.txt`) et résoudre des équations du second degré de la forme :

\[
ax^2 + bx + c = 0
\]

Le programme inclut des fonctionnalités telles que :
- Génération dynamique des coefficients en fonction des lettres via des intervalles prédéfinis.
- Résolution d'équations à l'aide d'une interface pour la flexibilité.
- Vérification des solutions avec une tolérance définie (\(10^{-4}\)).

---

## **Structure du Projet**

### **Fichiers et Classes**

1. **`EquationSolver` (Interface) :**
    - Définit la méthode `solve(double a, double b, double c)` pour résoudre des équations du second degré.
    - Permet une implémentation flexible.

2. **`Equation` :**
    - Implémente l'interface `EquationSolver`.
    - Résout les équations du second degré en retournant les solutions réelles.

3. **`RandomGenerator` :**
    - Génère des coefficients aléatoires en fonction de lettres représentant des intervalles prédéfinis :
        - `a -> 0`
        - `b -> [3, 15]`
        - `c -> [10, 10^4]`
        - `d -> [10^6, 10^10]`, etc.

4. **`JennyToCoefficients` :**
    - Lit un fichier contenant des combinaisons de coefficients (par exemple, `1a 2d 3a`) et génère les coefficients numériques correspondants.

5. **`DynamicTest` :**
    - Charge dynamiquement l'implémentation de `EquationSolver`.
    - Résout les équations du fichier.
    - Vérifie la validité des solutions avec une tolérance de \(10^{-4}\).

6. **Fichier `jenny_wordlist.txt` :**
    - Contient les combinaisons de coefficients, par exemple :
      ```
      1a 2d 3a
      1b 2g 3b
      1c 2e 3d
      1d 2b 3c
      ```

---

## **Prérequis**

- **Java JDK 8+**
- Un fichier `jenny_wordlist.txt` contenant les combinaisons de coefficients.

---

## **Installation**

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/FranckJudes/Test-Unitaire
   cd test-logiciel
   ```

2. Compilez les fichiers Java :
   ```bash
   javac EquationSolver.java Equation.java RandomGenerator.java JennyToCoefficients.java DynamicTest.java
   ```

3. Assurez-vous que le fichier `jenny_wordlist.txt` est présent dans le répertoire du projet.

---

## **Exécution**

1. Lancez le programme principal :
   ```bash
   java DynamicTest
   ```

2. Résultats attendus :
    - Affichage des équations, des solutions trouvées et vérification de leur validité.
    - Les solutions sont validées avec une tolérance de \(10^{-4}\).

---

## **Exemple de Sortie**

Pour un fichier `jenny_wordlist.txt` contenant :
```
1a 2d 3a
1b 2g 3b
1c 2e 3d
1d 2b 3c
```

Sortie :
```
Équation : 0.00*x^2 + 1000000000.00*x + 0.00 = 0
Solutions trouvées : 0.00000 
Test réussi : Toutes les solutions sont correctes.

Équation : 5.00*x^2 + 2500.00*x + 7.00 = 0
Solutions trouvées : -0.00140 -499.99860 
Test réussi : Toutes les solutions sont correctes.

Équation : 10.00*x^2 + 15000.00*x + 10000000000.00 = 0
Exception capturée : L'équation n'a pas de solutions réelles.
```

---

## **Contribuer**

1. Forkez le dépôt.
2. Créez une branche :
   ```bash
   git checkout -b feature-branch
   ```
3. Faites vos modifications et commitez-les :
   ```bash
   git commit -m "Ajout de nouvelles fonctionnalités"
   ```
4. Poussez la branche :
   ```bash
   git push origin feature-branch
   ```
5. Ouvrez une pull request.

---

## **Auteur**

Créé par **[Votre Nom/Organisation]**.

---

## **Licence**

Ce projet est sous licence [MIT](LICENSE).

---

Ce fichier README est un modèle qui peut être ajusté en fonction de vos besoins spécifiques. Si vous souhaitez des modifications supplémentaires, faites-le-moi savoir !