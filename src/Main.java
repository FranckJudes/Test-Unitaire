import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/gallagher/Documents/GitHub/TestLogiciel/src/jenny_wordlist.txt"; // Chemin du fichier

        try {
            // Lire les coefficients depuis le fichier
            ArrayList<double[]> coefficients = JennyToCoefficients.readJennyFileAndGetCoefficients(filePath);

            // Chargement dynamique de l'implémentation de l'interface
            EquationSolver solver = (EquationSolver) Class.forName("Equation").getDeclaredConstructor().newInstance();
            double tolerance = Math.pow(10, -4);

            for (double[] coeff : coefficients) {
                double a = coeff[0];
                double b = coeff[1];
                double c = coeff[2];

                System.out.printf("Équation : %.2f*x^2 + %.2f*x + %.2f = 0%n", a, b, c);

                try {
                    ArrayList<Double> solutions = solver.solve(a, b, c);
                    System.out.print("Solutions trouvées : ");
                    for (double solution : solutions) {
                        System.out.printf("%.5f ", solution);
                    }
                    System.out.println();

                    // Vérification des solutions
                    boolean allCorrect = true;
                    for (double solution : solutions) {
                        double result = a * Math.pow(solution, 2) + b * solution + c;
                        if (Math.abs(result) > tolerance) {
                            allCorrect = false;
                            System.out.printf("Erreur : Solution %.5f ne satisfait pas l'équation (résultat = %.5e)%n", solution, result);
                        }
                    }

                    if (allCorrect) {
                        System.out.println("Test réussi : Toutes les solutions sont correctes.");
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println("Exception capturée : " + e.getMessage());
                }

                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erreur dynamique : " + e.getMessage());
        }
    }
}
