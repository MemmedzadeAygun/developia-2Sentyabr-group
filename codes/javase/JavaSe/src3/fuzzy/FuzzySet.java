package fuzzy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FuzzySet {

	public static Map<Integer, Double> readFuzzySet(String name) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Double> fuzzySet = new HashMap<>();

		System.out.println(name + " coxlugunu daxil edin (bitirmek ucun 'exit' yazin):");
		while (true) {
			System.out.print(name + ": ");
			String userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("exit")) {
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

	public static Map<Integer, Double> fuzzyUnion(Map<Integer, Double> A, Map<Integer, Double> B) {
		Map<Integer, Double> C = new HashMap<>();
		for (Integer x : A.keySet()) {
			C.put(x, Math.max(A.getOrDefault(x, 0.0), B.getOrDefault(x, 0.0)));
		}
		for (Integer x : B.keySet()) {
			C.putIfAbsent(x, B.get(x));
		}
		return C;
	}

	public static Map<Integer, Double> fuzzyIntersection(Map<Integer, Double> A, Map<Integer, Double> B) {
		Map<Integer, Double> C = new HashMap<>();
		for (Integer x : A.keySet()) {
			if (B.containsKey(x)) {
				C.put(x, Math.min(A.get(x), B.get(x)));
			}
		}
		return C;
	}

	public static double fuzzyMinimum(Map<Integer, Double> A, Map<Integer, Double> B) {
		double minA = A.values().stream().min(Double::compare).orElse(0.0);
		double minB = B.values().stream().min(Double::compare).orElse(0.0);
		return Math.min(minA, minB);
	}

	public static double fuzzyMaximum(Map<Integer, Double> A, Map<Integer, Double> B) {
		double maxA = A.values().stream().max(Double::compare).orElse(0.0);
		double maxB = B.values().stream().max(Double::compare).orElse(0.0);
		return Math.max(maxA, maxB);
	}

	public static void main(String[] args) {
		System.out.println("Qeyri-səlis çoxluqları daxil etməyə başlayın.");

		Map<Integer, Double> A = readFuzzySet("A");
		Map<Integer, Double> B = readFuzzySet("B");

		Map<Integer, Double> C_union = fuzzyUnion(A, B);
		Map<Integer, Double> C_intersection = fuzzyIntersection(A, B);

		double overallMin = fuzzyMinimum(A, B);
		double overallMax = fuzzyMaximum(A, B);

		System.out.println("Birləşmə (C): " + C_union);
		System.out.println("Kəsişmə (C): " + C_intersection);
		System.out.println("Aidlik dərəcələrinin ümumi minimumu: " + overallMin);
		System.out.println("Aidlik dərəcələrinin ümumi maksimumu: " + overallMax);
	}
}
