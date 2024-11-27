import java.util.ArrayList;

public class Equation implements EquationSolver {
    @Override
    public ArrayList<Double> solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Le coefficient 'a' doit être non nul pour une équation du second degré.");
        }

        ArrayList<Double> solutions = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            throw new IllegalArgumentException("L'équation n'a pas de solutions réelles.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            solutions.add(root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            solutions.add(root1);
            solutions.add(root2);
        }

        return solutions;
    }
}
