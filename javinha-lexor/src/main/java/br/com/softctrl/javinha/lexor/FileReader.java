/**
 * 
 */
package br.com.softctrl.javinha.lexor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import br.com.softctrl.lexor.Reader;
import br.com.softctrl.lexor.Tail;

/*
The GNU Lesser General Public License v3 (or later)

Copyright (c) 2017 Carlos Timoshenko Rodrigues Lopes
http://www.0x09.com.br

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

/**
 * @author carlostimoshenkorodrigueslopes@gmail.com
 */
public class FileReader implements Reader {

	private static final String READ_ONLY = "r";

	private int current = Reader.NULL;
	private RandomAccessFile randomAccessFile;
	private Tail tail = new Tail();

	/**
	 * 
	 * @param file
	 * @throws FileNotFoundException
	 */
	public FileReader(String file) throws FileNotFoundException {
		this.randomAccessFile = new RandomAccessFile(file, READ_ONLY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.Reader#next()
	 */
	public int next() {
		try {
			this.current = this.randomAccessFile.read();
			this.tail.move((char) this.current);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return current;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.Reader#prior()
	 */
	public void prior() {

		throw new RuntimeException();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.Reader#current()
	 */
	public int current() {
		return this.current;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.Reader#row()
	 */
	public int row() {
		return this.tail.row();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.Reader#col()
	 */
	public int col() {
		return this.tail.col();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.Closeable#close()
	 */
	public void close() throws IOException {
		this.randomAccessFile.close();
	}

}
