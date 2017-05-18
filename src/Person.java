import java.util.HashMap;

/**
 * Created by liamkreiss on 5/17/17.
 */
public class Person {
    HashMap<String, String> info = new HashMap<>();

    public Person(String[] headings, String[] answers) {
        for (int i = 0; i < headings.length; i++) {
            System.out.println(headings[i]);
            System.out.println(answers[i]);
            info.put(headings[i], answers[i]);
        }
    }

    //for the real program
//    public String toString() {
//        return info.get("name") + " " + info.get("unit");
//    }

    //for testing
    public String toString() {
        return info.get("what is your name?") + " " + info.get("how old are you?");
    }

    public int getSimilarityRating(Person o) {
        int total = 0;
        for (String key : this.info.keySet()) {
            re
        }
    }
}
