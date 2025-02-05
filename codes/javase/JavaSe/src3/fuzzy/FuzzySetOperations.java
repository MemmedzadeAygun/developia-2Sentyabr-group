package fuzzy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FuzzySetOperations {
	 // Qeyri-səlis çoxluq oxumaq metodu
    public static Map<Integer, Double> readFuzzySet(String name) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Double> fuzzySet = new HashMap<>();

        System.out.println(name + " daxil edin (Element və Üzvlük dərəcəsi, məsələn: '2 0.4'). Bitirmək üçün 'done' yazın:");
        while (true) {
            System.out.print(name + ": ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("done")) {
                break;
            }
            try {
                String[] parts = userInput.split(" ");
                int element = Integer.parseInt(parts[0]);
                double membership = Double.parseDouble(parts[1]);
                fuzzySet.put(element, membership);
            } catch (Exception e) {
                System.out.println("Xəta: Düzgün formatda daxil edin! Məsələn: '2 0.4'");
            }
        }

        return fuzzySet;
    }

    // Qeyri-səlis çoxluqların birləşməsi
    public static Map<Integer, Double> fuzzyUnion(Map<Integer, Double> A, Map<Integer, Double> B) {
        Map<Integer, Double> C = new HashMap<>();
        for (Integer key : A.keySet()) {
            C.put(key, Math.max(A.get(key), B.getOrDefault(key, 0.0)));
        }
        for (Integer key : B.keySet()) {
            C.putIfAbsent(key, B.get(key));
        }
        return C;
    }

    // Qeyri-səlis çoxluqların kəsişməsi
    public static Map<Integer, Double> fuzzyIntersection(Map<Integer, Double> A, Map<Integer, Double> B) {
        Map<Integer, Double> C = new HashMap<>();
        for (Integer key : A.keySet()) {
            if (B.containsKey(key)) {
                C.put(key, Math.min(A.get(key), B.get(key)));
            }
        }
        return C;
    }

    public static void main(String[] args) {
        System.out.println("Qeyri-səlis çoxluqları daxil etməyə başlayın.");

        // Çoxluqları oxuyuruq
        Map<Integer, Double> A = readFuzzySet("A");
        Map<Integer, Double> B = readFuzzySet("B");

        // Birləşmə və kəsişməni hesablayırıq
        Map<Integer, Double> CUnion = fuzzyUnion(A, B);
        Map<Integer, Double> CIntersection = fuzzyIntersection(A, B);

        // Nəticələri çap edirik
        System.out.println("Birləşmə (C): " + CUnion);
        System.out.println("Kəsişmə (C): " + CIntersection);
    }
}
