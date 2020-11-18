package pl.agasior.knn.algorithm;

class DistanceCalculator implements DistanceCalculationStrategy {

    @Override
    public Double calculateDistance(Point a, Point b) {
        double squared = 0;
        for (int i = 0; i < a.getCoordinates().size(); i++) {
            squared += Math.pow((a.getCoordinates().get(i) - b.getCoordinates().get(i)), 2);
        }
        return squared;
    }

}
