package init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputStream);
		
		int num1 = Integer.parseInt(reader.readLine());
		int num2 = Integer.parseInt(reader.readLine());
			
		int resultado = num1 + num2;
		
		System.out.printf("%d", resultado);
		
		
	}
}
