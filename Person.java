import java.util.ArrayList;
import java.util.Scanner;

public class Person{
    Scanner input = new Scanner(System.in);
    public enum TheProblems {FINANCIAL, SPIRITUAL, EDUCATION, BUSINESS};
    ArrayList<String> problems = new ArrayList<String>();
    String name;

    public void addProblem(String problem){
        int numberofOccurence = 1;
        do {
            System.out.printf("%s", "State number of problems");
            problems.add(String.valueOf(input.hasNext()));
            numberofOccurence++;
        }while (numberofOccurence <= 4);
    }

    public void addProblem(ProblemType problemType){
        //problems
    }


}
