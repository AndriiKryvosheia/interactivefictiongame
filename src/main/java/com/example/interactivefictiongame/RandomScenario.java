package com.example.interactivefictiongame;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class RandomScenario implements ScenarioStrategy {
    private String description;
    private List<ScenarioStrategy> subScenarios;

    private static Random random = new Random();

    @Override
    public void play() {
        if (!subScenarios.isEmpty()) {
            System.out.println(description);
            int randomIndex = random.nextInt(subScenarios.size());
            ScenarioStrategy nextScenarioStrategy = subScenarios.get(randomIndex);
            nextScenarioStrategy.play();
        }
    }
}
