import java.io.*;

class GameHelper {
	public String getUserInput() {
		String inputLine = null;
		System.out.println("Number: ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
		} catch (IOException e) {
			System.out.println("IOException: "+e);
		}
		return inputLine;
	}
}