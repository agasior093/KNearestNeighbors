package pl.agasior.knn.algorithm;

@FunctionalInterface
interface DistanceCalculationStrategy {
    Double calculateDistance(Point a, Point b); //don't need sqrt as its only for comparison
}
