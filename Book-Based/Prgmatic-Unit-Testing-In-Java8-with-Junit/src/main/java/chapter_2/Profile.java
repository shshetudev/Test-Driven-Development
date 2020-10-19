package chapter_2;

import java.util.HashMap;
import java.util.Map;

public class Profile {
    private Map<String,Answer> answers = new HashMap<>();
    private int score;
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public void add(Answer answer){
        answers.put(answer.getQuestionText(),answer);
    }

    public boolean matches(Criteria criteria){
        score = 0;
        boolean kill = false;
        for (Criterion criterion: criteria
             ) {

        }
    }
}
