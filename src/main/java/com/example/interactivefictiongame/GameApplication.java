package com.example.interactivefictiongame;

public class GameApplication {

    public static void main(String[] args) {

            ScenarioBuilder scenarioBuilder = new ScenarioBuilder();
            ScenarioStrategy buildTravelScenario = scenarioBuilder.buildTravelScenario();
            buildTravelScenario.play();
    }
}
