package ukol1dod;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Scanner;

public final class InputHelper {
    private InputHelper() {
    }

    public static int nextInt(Scanner scanner, String prompt) {
        while (true) {
            if (prompt != null && !prompt.isBlank()) {
                System.out.print(prompt);
            }
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup. Zadejte celé číslo.");
            }
        }
    }

    public static double nextDouble(Scanner scanner, String prompt) {
        while (true) {
            if (prompt != null && !prompt.isBlank()) {
                System.out.print(prompt);
            }
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input.trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup. Zadejte číslo.");
            }
        }
    }

    public static String nextText(Scanner scanner, String prompt) {
        while (true) {
            if (prompt != null && !prompt.isBlank()) {
                System.out.print(prompt);
            }
            String input = scanner.nextLine();
            if (!input.isBlank()) {
                return input.trim();
            }
            System.out.println("Pole nesmí být prázdné.");
        }
    }

    public static String normalizeText(String value) {
        if (value == null) {
            return "";
        }
        String normalized = Normalizer.normalize(value, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("\\p{M}", "");
        return normalized.toLowerCase(Locale.ROOT);
    }
}

