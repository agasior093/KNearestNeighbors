package pl.agasior.knn.generators;

import org.springframework.stereotype.Component;
import pl.agasior.knn.algorithm.Point;

import java.util.*;

@Component
public class UserGenerator {
    private final Dictionary dictionary;
    private final RandomPicker randomPicker;
    private final Integer hobbiesCount = 5;

    public UserGenerator(Dictionary dictionary, RandomPicker randomPicker) {
        this.dictionary = dictionary;
        this.randomPicker = randomPicker;
    }

    public Set<Point> generate(int n) {
        var users = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            users.add(generateUser(i));
        }
        return users;
    }


    public Point generateOne(int id) {
        return generateUser(++id);
    }

    private User generateUser(int id) {
        var firstName = randomPicker.pickOne(dictionary.getFirstNames());
        var lastName = randomPicker.pickOne(dictionary.getLastNames());
        var hobbies = randomPicker.pickMany(hobbiesCount, dictionary.getHobbies());
        return new User(id, firstName + " " + lastName, transform(hobbies));
    }

    private Map<Integer, Double> transform(Map<Integer, String> input) {
        var output = new HashMap<Integer, Double>();
        dictionary.getHobbies().forEach((k, v) -> output.put(k, 5.0));
        input.keySet().forEach(k -> output.put(k, randomPicker.randomRate()));
        return output;
    }

}
