package com.example.interactivefictiongame;

import java.util.List;

public interface ScenarioStrategy {
    void play();
    List<ScenarioStrategy> getSubScenarios();
    String getDescription();
}
