package pl.agasior.knn.algorithm;

import java.util.Map;
import java.util.Set;

public class KNNBuilder {

    private Integer k;
    private Set<Point> dataSet;
    private Map<Integer, Double> weights;

    public KNNBuilder k(final Integer k) {
        this.k = k;
        return this;
    }

    public KNNBuilder dataSet(final Set<Point> dataSet) {
        this.dataSet = dataSet;
        return this;
    }


    public KNNBuilder applyWeights(final Map<Integer, Double> weights) {
        this.weights = weights;
        return this;
    }

    public KNNAlgorithm build() {
        if (k == null || k == 0) throw new RuntimeException("K parameter is not set correctly");
        if (dataSet == null || dataSet.isEmpty()) throw new RuntimeException("DataSet is empty");
        return weights != null ?
                new KNNAlgorithm(k, dataSet, new WeightedDistanceCalculator(weights)) :
                new KNNAlgorithm(k, dataSet, new DistanceCalculator());
    }
}


