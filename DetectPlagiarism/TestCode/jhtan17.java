import java.util.*;

public class H_Histogram {

	public static void main(String[] args) {
			int n;
			int [] grades;
			int [] array = new int[10];
			
			String [] labels = {"  0 -  9: ", " 10 - 19: "," 20 - 29: "," 30 - 39: "," 40 - 49: "," 50 - 59: "," 60 - 69: "," 70 - 79: "," 80 - 89: "," 90 -100: "};
			
			Scanner scan = new Scanner(System.in);
			
			n = scan.nextInt();
			
			grades = new int[n];
			
			for (int i=0; i < n; i++){
				grades[i] = scan.nextInt();
			}
			
			for (int i=0; i < 10; i++){
				array[i] = 0;
			}
			
			for (int i=0; i < n; i++){
				if(grades[i] <10) array[0]++;
				if(grades[i] >= 10 && grades[i] <20) array[1]++;
				if(grades[i] >= 20 && grades[i] <30) array[2]++;
				if(grades[i] >= 30 && grades[i] <40) array[3]++;
				if(grades[i] >= 40 && grades[i] <50) array[4]++;
				if(grades[i] >= 50 && grades[i] <60) array[5]++;
				if(grades[i] >= 60 && grades[i] <70) array[6]++;
				if(grades[i] >= 70 && grades[i] <80) array[7]++;
				if(grades[i] >= 80 && grades[i] <90) array[8]++;
				if(grades[i] >= 90 && grades[i] <=100) array[9]++;
			}
			
			for (int i=0; i < 10; i++){
				System.out.print(labels[i]);
				for (int x = 0; x < array[i]; x++){
					System.out.print("*");
				}
				System.out.println(); 
			} 
					
	}

}
