package pl.agasior.knn.generators;

import pl.agasior.knn.algorithm.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User implements Point {
    private final int id;
    private final String name;
    private final Map<Integer, Double> ratings;

    public User(int id, String name, Map<Integer, Double> ratings) {
        this.id = id;
        this.name = name;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Double> getRatings() {
        return ratings;
    }

    @Override
    public List<Double> getCoordinates() {
        return new ArrayList<>(ratings.values());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ratings=" + ratings +
                '}';
    }

}
