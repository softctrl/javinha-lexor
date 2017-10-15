/**
 * 
 */
package br.com.softctrl.javinha.lexor.state;

import br.com.softctrl.lexor.LexorRuntimeException;
import br.com.softctrl.lexor.Machine;
import br.com.softctrl.lexor.NonFinalState;
import br.com.softctrl.lexor.State;

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
public class Q00 extends NonFinalState {

	/**
	 * 
	 * @param jm
	 */
	public Q00(Machine jm) {
		super(jm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#nextTransition(char)
	 */
	public State nextTransition(char c) {

		switch (c) {
		case '\0':
		case '\n':
		case '\t':
		case '\r':
			// case '\0':
		case ' ':
			return this;
		case '+':
			return new Q01(this.getMachine());
		case '-':
			return new Q02(this.getMachine());
		case '*':
			return new Q03(this.getMachine());
		case '/':
			return new Q04/* _ */(this.getMachine());
		case '<':
			return new Q05(this.getMachine());
		case '>':
			return new Q08(this.getMachine());
		case '=':
			return new Q11(this.getMachine());
		case '!':
			return new Q14(this.getMachine());
		case '"':
			return new Q23(this.getMachine());
		case '(':
			return new Q25(this.getMachine());
		case ')':
			return new Q26(this.getMachine());
		case ';':
			return new Q27(this.getMachine());
		default:

			if (Character.isLetter(c)) {
				return new Q16(this.getMachine());
			} else if (Character.isDigit(c)) {
				return new Q18(this.getMachine());
			} else {
				throw new LexorRuntimeException(this.getMachine().row(), this.getMachine().col());
			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.NonFinalState#isInitial()
	 */
	@Override
	public boolean isInitial() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#readChar(char)
	 */
	public char readChar(char c) {
		return (c != '\n' && c != '\t' && c != '\r' && c != '\0' && c != ' ' ? c : '\0');
	}

}
