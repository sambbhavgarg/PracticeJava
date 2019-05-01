package bin.hackerrank;
import java.util.Scanner;

public class Gemstones {

	public static void main(String args[]) {
		int n = 0;
		String rocks[];
    Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		rocks = new String[n];
		for(int i=0;i<n;i++)
		   rocks[i] = scan.next();
		printGemStones(rocks);
	}

	public static void printGemStones(String[] rocks) {
		int gemStone = 0;
		boolean flag = false;
		for(char c='a'; c<='z'; c++) {
			for(int i=0; i<rocks.length; i++) {
				if(rocks[i].contains(String.valueOf(c))) {
					flag = true;
				}
        else {
					flag = false;
					break;
				}
			}
			if(flag) {
				gemStone++;
			}
		}
		System.out.println(gemStone);
	}
}
