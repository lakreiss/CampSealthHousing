import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by liamkreiss on 5/17/17.
 */
public class QuestionnaireProcessor {
    private ArrayList<Person> people = new ArrayList<>();


    public QuestionnaireProcessor(String fileName) {
        try {
            Scanner file = new Scanner(new File(fileName));

            String[] headings = file.nextLine().toLowerCase().split(",");

            while (file.hasNextLine()) {
                Person p = new Person(headings, file.nextLine().toLowerCase().split(","));
                people.add(p);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            e.printStackTrace();
        }

    }

    public void printAnswers() {
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
