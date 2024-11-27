import java.util.Random;

public class RandomGenerator {

    /**
     * Génère un nombre aléatoire en fonction d'une lettre donnée.
     *
     * @param letter La lettre représentant l'intervalle (de 'a' à 'i')
     * @return Le nombre aléatoire généré
     * @throws IllegalArgumentException si la lettre est invalide
     */
    public static double generateRandom(String letter) {
        Random random = new Random();
        double result;

        switch (letter.toLowerCase()) {
            case "a":
                result = 0;
                break;
            case "b":
                result = 3 + random.nextInt(15 - 3 + 1); // Génère un entier entre 3 et 15
                break;
            case "c":
                result = 10 + random.nextDouble() * (Math.pow(10, 4) - 10); // Génère un double entre 10 et 10^4
                break;
            case "d":
                result = Math.pow(10, 6) + random.nextDouble() * (Math.pow(10, 10) - Math.pow(10, 6)); // Entre 10^6 et 10^10
                break;
            case "e":
                result = 15 + random.nextDouble() * (Math.pow(10, 4) - 15); // Entre 15 et 10^4
                break;
            case "f":
                result = random.nextDouble() * Math.pow(10, -5); // Entre 0 et 10^-5
                break;
            case "g":
                result = -10 + random.nextDouble() * (Math.pow(10, 4) - (-10)); // Entre -10 et 10^4
                break;
            case "h":
                result = -15 + random.nextDouble() * (-3 - (-15)); // Entre -15 et -3
                break;
            case "i":
                result = -Math.pow(10, 10) + random.nextDouble() * (-Math.pow(10, 6) - (-Math.pow(10, 10))); // Entre -10^10 et -10^6
                break;
            default:
                throw new IllegalArgumentException("Lettre invalide. Veuillez utiliser une lettre entre 'a' et 'i'.");
        }

        return result;
    }


}
