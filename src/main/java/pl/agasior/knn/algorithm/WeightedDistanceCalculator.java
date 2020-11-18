package pl.agasior.knn.algorithm;

import java.util.Map;

public class WeightedDistanceCalculator implements DistanceCalculationStrategy {

    private final Map<Integer, Double> weights;

    public WeightedDistanceCalculator(Map<Integer, Double> weights) {
        this.weights = weights;
    }

    @Override
    public Double calculateDistance(Point a, Point b) {
        double squared = 0;
        for (int i = 0; i < a.getCoordinates().size(); i++) {
            if (weights.containsKey(i)) {
                squared += Math.pow(weights.get(i) * (a.getCoordinates().get(i) - b.getCoordinates().get(i)), 2);
            } else {
                squared += Math.pow(a.getCoordinates().get(i) - b.getCoordinates().get(i), 2);
            }
        }
        return squared;
    }
}
