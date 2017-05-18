/**
 * Created by liamkreiss on 5/17/17.
 */
public class main {

    public static void main(String[] args) {
        String fileToProcess = "Welcome to CIT Crew 2 Questionnaire (Responses) - Form responses 1-2.csv";
        QuestionnaireProcessor qp = new QuestionnaireProcessor(fileToProcess);
        qp.printAnswers();
    }
}
