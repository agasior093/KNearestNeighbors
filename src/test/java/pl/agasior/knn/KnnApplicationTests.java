package pl.agasior.knn;

import org.junit.jupiter.api.Test;
import pl.agasior.knn.generators.Dictionary;
import pl.agasior.knn.generators.RandomPicker;
import pl.agasior.knn.generators.UserGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnnApplicationTests {
    private final Dictionary dictionary = new Dictionary();
    private final UserGenerator generator = new UserGenerator(dictionary, new RandomPicker());

    @Test
    void shouldGenerateNUsersWithMaxRating10AndMinRating1() {
        var n = 1000000;
        var generatedUsers = generator.generate(n);
//        var min = generatedUsers.stream().map(User::getCoordinates).map(Map::values).flatMap(Collection::stream).mapToDouble(Double::doubleValue).min();
//        var max = generatedUsers.stream().map(User::getRatings).map(Map::values).flatMap(Collection::stream).mapToDouble(Double::doubleValue).max();
        assertEquals(n, generatedUsers.size());
//        generatedUsers.forEach(System.out::println);
    }

//    @Test
//    void test2() {
//        var inputSet = generator.generate(10000);
//        var knn = new KNNAlgorithmBuilder(5, inputSet);
//        var user = create();
//        knn.runAlgorithm(user).forEach((k, v) -> {
//            final var first = (User) inputSet.stream().filter(el -> k.equals(el.getId())).findFirst().orElseThrow(RuntimeException::new);
//            System.out.println(first.getName());
//            first.getRatings().forEach((x, y) -> {
//                if (x == 14 || x == 15 || x == 0 || x == 7 || x == 17) {
//                    System.out.println(dictionary.getHobbies().get(x) + ": " + y);
//                }
//            });
//            System.out.println("Distance: " + v);
//            System.out.println("------------------------------------");
//        });
//    }
//
//    Point create() {
//        var output = new HashMap<Integer, Double>();
//        dictionary.getHobbies().forEach((k, v) -> output.put(k, 5.0));
//        output.put(14, 10.0);
//        output.put(15, 10.0);
//        output.put(0, 0.0);
//        output.put(7, 3.0);
//        output.put(17, 7.5);
//        return new User(Integer.MAX_VALUE, "maciek gasior", output);
//
//    }


}
