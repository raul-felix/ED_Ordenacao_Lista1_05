package view;

import br.edu.fateczl.bubblesort.BubbleSort;
import br.edu.fateczl.mergesort.MergeSort;

public class Main {
	
	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort();
		MergeSort mergeSort = new MergeSort();
		
		int[] vet1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] vet2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] vet3 = { 101, 102, 103, 125, 124, 123, 104, 105, 106, 122 };
		
		System.out.println("Vetor 1: 74, 20, 74, 87, 81, 16, 25, 99, 44, 58");
		System.out.println("Ordenado por Bubble Sort: ");
		int[] vet1Ord = bubbleSort.sort(vet1);
		for (int i : vet1Ord) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Ordenado por Merge Sort: ");
		vet1Ord = mergeSort.sort(vet1, 0, vet1.length - 1);
		for (int i : vet1Ord) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		System.out.println("Vetor 2: 44, 43, 42, 41, 40, 39, 38");
		System.out.println("Ordenado por Bubble Sort: ");
		int[] vet2Ord = bubbleSort.sort(vet2);
		for (int i : vet2Ord) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Ordenado por Merge Sort: ");
		vet2Ord = mergeSort.sort(vet2, 0, vet2.length - 1);
		for (int i : vet2Ord) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Vetor 3: 101, 102, 103, 125, 124, 123, 104, 105, 106, 122");
		System.out.println("Ordenado por Bubble Sort: ");
		int[] vet3Ord = bubbleSort.sort(vet3);
		for (int i : vet3Ord) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Ordenado por Merge Sort: ");
		vet3Ord = mergeSort.sort(vet3, 0, vet3.length - 1);
		for (int i : vet3Ord) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
