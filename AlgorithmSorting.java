import java.util.Scanner;
/**
 * @author Riyash Goboodun
 *
 */
public class AlgorithmSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int decision;
		do {
			
			int choice;
			int size;
			int i;
			int j;
			int temp;
			
			System.out.print("Enter Array size: ");
			size = input.nextInt();
			
			int num[] = new int [size];
			
			System.out.print("Enter Array Elements: ");
			for(i=0; i<size; i++) {
				num[i] = input.nextInt();
			}
			
			System.out.println("Enter 1 for Selection sort");
			System.out.println("Enter 2 for Insertion sort");
			System.out.println("Enter 3 for Bubble sort");
			System.out.println("Enter 4 for Quick sort");
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			
			if (choice == 1) {
				System.out.println("Using Selection Sort");
				
				for(i=0; i<size; i++) {
					
					for(j=i+1; j<size; j++) {
						
						if(num[i] > num[j]) {
							
							temp = num[i];
							num[i] = num[j];
							num[j] = temp;
						}
					}
				}
				
				System.out.println("Array after Sorting");
				for(i=0; i<size; i++) {
					System.out.print(num[i]+ " ");
				}
			}
			
			else if(choice == 2) {
				System.out.println("Using insertion Sort");
				
				for(int p=1; p<size; p++) {
					temp = num[p];
					j = p-1;
					while(j>=0 && temp <= num[j]) {
						
						num[j+1] = num[j];
						j = j-1;
					}
					num[j+1] = temp;
				}
				System.out.println("Array after Sorting");
				for(i=0; i<size; i++) {
					System.out.print(num[i]+ " ");
				}
			}
			else if(choice == 3) {
				System.out.println("Using Bubble Sort");
				for (i=0; i<(size-1); i++) {
					
					for (j=0; j<(size-1); j++) {
						
						if (num[j] > num[j+1]) {
							
							temp = num[j];
							num[j] = num[j+1];
							num[j+1] = temp;
						}
					}
				}
				System.out.println("Array after sorting");
				for(i=0; i<size; i++) {
					System.out.print(num[i] + " ");
				}
			}
			
			else if(choice == 4) {
				System.out.println("Using Quick Sort");
				
				AlgorithmSorting quickSort = new AlgorithmSorting();
				quickSort.Sort(num, 0, num.length-1);
				quickSort.numberArray(num);

			}
			else {
			System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			System.out.println("Enter 1 to continue or 2 to exit");
			decision = input.nextInt();
			
		}
		while(decision == 1);
		System.out.println("Program end");

	}
		int partition(int num[], int begin, int end) {
			int pivot = num[(begin + end)/2];
			
			while(begin <= end) {
				while(num[begin] < pivot) {
					begin++;
				}
			
			
			while(num[end] > pivot) {
				end--;
			}
			
			if(begin <= end) {
				int tmp = num[begin];
				num[begin] = num[end];
				num[end] = tmp;
				
				begin++;
				end--;
			}
			}
			return begin;	
		}
		
		void Sort(int []num, int begin, int end) {
			
			int part = partition(num, begin, end);
			if(begin < part-1) {
				Sort(num, begin, part-1);
			}
			if(part < end) {
				Sort(num, part, end);
			}
		}
		
		void numberArray(int[]num) {
			System.out.println("Array after sorting");
			for (int i:num) {
				System.out.print(i + " ");
			}
		}
		
		
	
	

}
