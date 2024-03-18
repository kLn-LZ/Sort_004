package View;

import Controller.BubbleSort;
import Controller.MergeSort;
import kLn.Order.ControllerOrdenacao;

public class Main {
    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        ControllerOrdenacao qs = new ControllerOrdenacao();

        double startTime;
        double endTime;

        int[] vet = new int[1500];

        for (int i = 1499; i >= 0; i--) {

            vet[i] = i;


        }

        startTime = System.nanoTime();
        bs.bubbleSort(vet, vet.length - 1);
        endTime = System.nanoTime();

        System.out.println("O tempo de ordenação do Bubble Sort foi: " + (double) (endTime - startTime) / 1_000_000_000 );


        startTime = System.nanoTime();
        ms.mergeSort(vet, 0, vet.length - 1);
        endTime = System.nanoTime();

        System.out.println("O tempo de ordenação do Merge Sort foi: " + (double) (endTime - startTime) / 1_000_000_000 );

        startTime = System.nanoTime();
        qs.quickSort(vet, 0, vet.length - 1);
        endTime = System.nanoTime();

        System.out.println("O tempo de ordenação do Quick Sort foi: " + (double) (endTime - startTime) / 1_000_000_000 );





    }
}
