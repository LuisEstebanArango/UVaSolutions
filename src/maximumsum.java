import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class maximumsum{

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String palabra = br.readLine();
			String palabraEncriptada = "";
			for (int i = 0; i < palabra.length(); i++) {
				palabraEncriptada+=((char)(palabra.charAt(i)+2));
			}
			System.out.println(palabraEncriptada);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int getAleatorio() {
		while(true){
			int temp = (int) (Math.random()*100);
			if(temp<51)
				return temp;
		}
	}
}
