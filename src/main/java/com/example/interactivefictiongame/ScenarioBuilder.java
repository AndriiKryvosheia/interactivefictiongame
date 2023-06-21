package com.example.interactivefictiongame;

import java.util.List;

public class ScenarioBuilder {

    public ScenarioStrategy buildTravelScenario() {
        return new BasicScenario("Ви входите до порталу", List.of(
                buildChoosePathScenario()
        ));
    }

    public ScenarioStrategy buildEncounterScenario() {
        return new ChooseScenario("Ви натрапляєте на страшного монстра", List.of(
                buildFightScenario(),
                buildRunScenario()
        ));
    }

    public ScenarioStrategy buildExploreScenario() {
        return new ChooseScenario("Ви досліджуєте ліс", List.of(
                buildFindTreasureScenario(),
                buildEncounterWildlifeScenario()
        ));
    }

    public ScenarioStrategy buildDeadEndScenario() {
        return new BasicScenario("Ви потрапляєте в глухий кут", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildClimbScenario() {
        return new ChooseScenario("Ви піднімаєтеся вгору", List.of(
                buildReachSummitScenario(),
                buildSlipScenario()
        ));
    }

    public ScenarioStrategy buildSearchScenario() {
        return new ChooseScenario("Ви шукаєте скарби", List.of(
                buildFindCaveScenario(),
                buildDiscoverViewScenario()
        ));
    }

    public ScenarioStrategy buildLostScenario() {
        return new BasicScenario("Ви заблукали у горах", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildOasisScenario() {
        return new ChooseScenario("Ви натрапляєте на оазис", List.of(
                buildRestScenario(),
                buildInvestigateScenario()
        ));
    }

    public ScenarioStrategy buildSandstormScenario() {
        return new BasicScenario("Ви потрапляєте в піщану бурю", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildMirageScenario() {
        return new BasicScenario("Ви бачите мріючий образ", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildFightScenario() {
        return new RandomScenario("Ви вступаєте в бій з монстром", List.of(
                buildVictoryScenario(),
                buildDefeatScenario()
        ));
    }

    public ScenarioStrategy buildRunScenario() {
        return new BasicScenario("Ви вирішуєте втекти", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildFindTreasureScenario() {
        return new BasicScenario("Ви знаходите скарби", List.of(
                buildCelebrateScenario()
        ));
    }

    public ScenarioStrategy buildEncounterWildlifeScenario() {
        return new BasicScenario("Ви зустрічаєте дикі тварини", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildReachSummitScenario() {
        return new BasicScenario("Ви досягаєте вершини гори", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildSlipScenario() {
        return new BasicScenario("Ви послизнулися і впали", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildFindCaveScenario() {
        return new BasicScenario("Ви знаходите печеру", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildDiscoverViewScenario() {
        return new BasicScenario("Ви відкриваєте захоплюючий вид", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildRestScenario() {
        return new BasicScenario("Ви відпочиваєте в оазисі", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildInvestigateScenario() {
        return new BasicScenario("Ви розслідуєте оазис", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildGameOverScenario() {
        return new BasicScenario("Гра закінчена", List.of());
    }

    public ScenarioStrategy buildChoosePathScenario() {
        return new ChooseScenario("Ви стоїте перед розгалуженням шляхів", List.of(
                buildForestPathScenario(),
                buildMountainPathScenario(),
                buildDesertPathScenario()
        ));
    }

    public ScenarioStrategy buildForestPathScenario() {
        return new ChooseScenario("Ви обираєте лісовий шлях", List.of(
                buildEncounterScenario(),
                buildExploreScenario(),
                buildDeadEndScenario()
        ));
    }

    public ScenarioStrategy buildMountainPathScenario() {
        return new ChooseScenario("Ви обираєте гірський шлях", List.of(
                buildClimbScenario(),
                buildSearchScenario(),
                buildLostScenario()
        ));
    }

    public ScenarioStrategy buildDesertPathScenario() {
        return new ChooseScenario("Ви обираєте пустельний шлях", List.of(
                buildOasisScenario(),
                buildSandstormScenario(),
                buildMirageScenario()
        ));
    }

    public ScenarioStrategy buildVictoryScenario() {
        return new BasicScenario("Ви перемогли", List.of(
                buildCelebrateScenario()
        ));
    }

    public ScenarioStrategy buildDefeatScenario() {
        return new BasicScenario("Ви програли", List.of(
                buildGameOverScenario()
        ));
    }

    public ScenarioStrategy buildCelebrateScenario() {
        return new BasicScenario("Ви святкуєте", List.of(
                buildGameOverScenario()
        ));
    }
}
