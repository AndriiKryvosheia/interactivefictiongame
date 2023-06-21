package com.example.interactivefictiongame;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ChooseScenario implements ScenarioStrategy {
    private String description;
    private List<ScenarioStrategy> subScenarios;

    @Override
    public void play() {
        if (!subScenarios.isEmpty()) {
            System.out.println(description);
            ScenarioStrategy nextScenarioStrategy = GameController.promptForSelection(subScenarios);
            nextScenarioStrategy.play();
        }
    }
}
