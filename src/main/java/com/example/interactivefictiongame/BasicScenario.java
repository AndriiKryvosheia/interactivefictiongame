package com.example.interactivefictiongame;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BasicScenario implements ScenarioStrategy {
    private String description;
    private List<ScenarioStrategy> subScenarios;

    @Override
    public void play() {
        System.out.println(description);
        if (!subScenarios.isEmpty()) {
            subScenarios.get(0).play();
        }
    }
}
