/**
 * 
 */
package br.com.softctrl.test;

/**
 * @author timoshenko
 *
 */
public final class FileUtils {

	private static final String FOLDER = "classes/";

	/**
	 * 
	 * @param filename
	 * @return
	 */
	public static final String getLocalFile(final String filename) {
		return FOLDER + filename;
	}


}
