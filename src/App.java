import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

		File file = new File("names.txt");
        Scanner scanner = new Scanner(file);

		ArrayList<String> fighters = new ArrayList<String>();

		while(scanner.hasNext()){
			fighters.add(scanner.nextLine());
		}

		for(int i = 0; i < fighters.size() - 1; i++) {
			for(int j = i + 1; j < fighters.size(); j++) {
				String F01 = fighters.get(i);
				String F02 = fighters.get(j);

				System.out.println(F01 + " vs " + F02);
			}
		}

		scanner.close();

    }
}
