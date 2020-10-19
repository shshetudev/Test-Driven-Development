package chapter_1;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable){
        scores.add(scoreable);
    }

    public int findArithmeticMean(){
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total/scores.size();
    }
}
