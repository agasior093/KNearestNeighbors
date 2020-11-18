package pl.agasior.knn.generators;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class Dictionary {
    private final Map<Integer, String> hobbies;

    private final List<String> firstNames = Arrays.asList(
            "alex",
            "adam",
            "james",
            "john",
            "robert",
            "michael",
            "richard",
            "david",
            "joseph",
            "thomas",
            "charles",
            "mary",
            "patricia",
            "elizabeth",
            "linda",
            "barbara",
            "susan",
            "jessica",
            "sarah",
            "karen",
            "nancy"
    );

    private final List<String> lastNames = Arrays.asList(
            "smith",
            "johnson",
            "anderson",
            "olson",
            "nelson",
            "williams",
            "miller",
            "garcia",
            "martinez",
            "lopez",
            "brown",
            "rodriguez",
            "jones",
            "davis",
            "moore",
            "white",
            "lee",
            "martin",
            "allen",
            "sanchez",
            "wright"
    );

    public Dictionary() {
        this.hobbies = new HashMap<>();
        this.hobbies.put(0, "art");
        this.hobbies.put(1, "music");
        this.hobbies.put(2, "photography");
        this.hobbies.put(3, "dance");
        this.hobbies.put(4, "signing");
        this.hobbies.put(5, "handcraft");
        this.hobbies.put(6, "sport");
        this.hobbies.put(7, "fishing");
        this.hobbies.put(8, "hunting");
        this.hobbies.put(9, "mushroom_picking");
        this.hobbies.put(10, "gardening");
        this.hobbies.put(11, "books");
        this.hobbies.put(12, "video_games");
        this.hobbies.put(13, "board_games");
        this.hobbies.put(14, "computer_science");
        this.hobbies.put(15, "science");
        this.hobbies.put(16, "cosmology");
        this.hobbies.put(17, "automotive");
    }

    public Map<Integer, String> getHobbies() {
        return hobbies;
    }
    public List<String> getFirstNames() {
        return firstNames;
    }

    public List<String> getLastNames() {
        return lastNames;
    }
}
