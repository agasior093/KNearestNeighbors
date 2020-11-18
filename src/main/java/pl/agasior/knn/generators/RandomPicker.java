package pl.agasior.knn.generators;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.*;

@Component
public class RandomPicker {
    private final Integer maxRate = 10;

    private final Random random = new SecureRandom();

    public String pickOne(List<String> values) {
        return values.get(random.nextInt(values.size()));
    }

    public Double randomRate() {
        return random.nextDouble() * (maxRate - 1);
    }

    public Map<Integer, String> pickMany(int n, Map<Integer, String> values) {
        var picks = new HashMap<Integer, String>();
        do {
           var key = random.nextInt(values.size());
           picks.put(key, values.get(key));
        } while(picks.size() != n);
        return picks;
    }
}
