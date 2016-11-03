/**
 * @author Jack & Jeremy
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Merge {

	/**
	 * @param args Two arguments, the two files to merge
	 * @throws FileNotFoundException 
	 */
	public static void main (final String[] args) throws FileNotFoundException {
		File a = new File(args[0]);
		File b = new File(args[1]);
		
		System.out.println("Team Name,Team Number,Autonomous,Portcullis,CDF,Ramparts,Moat,Draw Bridge,Rough Terrain,Rock Wall,Low Bar");
		
		//read file one
		try (Scanner fileIn = new Scanner(a)) {
			fileIn.nextLine();
			while (fileIn.hasNext()) {
				System.out.println(fileIn.nextLine());
			}
		}
		
		try (Scanner fileIn = new Scanner(b)) {
			fileIn.nextLine();
			while (fileIn.hasNext()) {
				System.out.println(fileIn.nextLine());
			}
		}
		
		System.out.println("");

	}

}
