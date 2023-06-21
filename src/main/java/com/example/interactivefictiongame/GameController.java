package com.example.interactivefictiongame;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.Scanner;

@Data
@NoArgsConstructor
public class GameController {
    public static ScenarioStrategy promptForSelection(List<ScenarioStrategy> scenarioStrategies) {
        System.out.println();
        System.out.println("Виберіть одну з наступних дій:");
        for (int i = 0; i < scenarioStrategies.size(); i++) {
            System.out.println((i + 1) + ". " + scenarioStrategies.get(i).getDescription());
        }
        System.out.print("Введіть номер вибраної дії: ");

        Scanner scanner = new Scanner(System.in);
        int selectedScenarioIndex = scanner.nextInt();
        scanner.nextLine();

        if (selectedScenarioIndex >= 1 && selectedScenarioIndex <= scenarioStrategies.size()) {
            return scenarioStrategies.get(selectedScenarioIndex - 1);
        } else {
            System.out.println("Невірний номер дії. Спробуйте ще раз.");
            return promptForSelection(scenarioStrategies);
        }
    }
}
