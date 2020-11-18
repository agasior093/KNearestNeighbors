package pl.agasior.knn.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KNNAlgorithm {
    private final int k;
    private final Set<Point> dataSet;
    private final DistanceCalculationStrategy distanceCalculationStrategy;

    KNNAlgorithm(int k, Set<Point> dataSet, DistanceCalculationStrategy distanceCalculationStrategy) {
        this.k = k;
        this.dataSet = dataSet;
        this.distanceCalculationStrategy = distanceCalculationStrategy;
    }

    public Map<Integer, Double> findKNearest(final Point target) {
        var distances = calculateDistances(target);
        var sortedDistances = sortDistances(distances);
        return getKNearest(sortedDistances);
    }

    private Map<Integer, Double> calculateDistances(final Point target) {
        return dataSet.stream().collect(Collectors.toMap(Point::getId, point -> distanceCalculationStrategy.calculateDistance(point, target)));
    }

    private LinkedHashMap<Integer, Double> sortDistances(Map<Integer, Double> distances) {
        return distances
                .entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k, LinkedHashMap::new));
    }

    private Map<Integer, Double> getKNearest(final Map<Integer, Double> sortedDistances) {
        return sortedDistances.entrySet()
                .stream().limit(k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
