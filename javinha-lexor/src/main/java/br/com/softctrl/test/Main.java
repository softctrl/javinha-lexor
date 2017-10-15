/**
 * 
 */
package br.com.softctrl.test;

import java.io.IOException;

import br.com.softctrl.javinha.lexor.FileReader;
import br.com.softctrl.javinha.lexor.JavinhaMachine;

/**
 * @author timoshenko
 *
 */
public class Main {

	private static final boolean comments = false;

	private static final String FILE = FileUtils.getLocalFile(comments ? "Main.jvn" : "HelloJavinha.jvn");

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		final String filename;
		if (args.length == 3) {
			filename = args[2];
		} else {
			filename = FILE;
		}

		JavinhaMachine javinhaMachine = new JavinhaMachine(new FileReader(filename));
		javinhaMachine.proccess();
		System.out.println("\nTabela de símbolos:");
		 javinhaMachine.getSymbolTable().print();
//		javinhaMachine.getSymbolTable().printCode();

	}

}
