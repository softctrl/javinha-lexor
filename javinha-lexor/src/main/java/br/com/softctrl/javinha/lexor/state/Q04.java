/**
 * 
 */
package br.com.softctrl.javinha.lexor.state;

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
public class Q04 extends NonFinalState {

	/**
	 * 
	 * @param machine
	 */
	public Q04(Machine machine) {
		super(machine);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#nextTransition(char)
	 */
	public State nextTransition(char c) {

		switch (c) {
		case '/':
			return new Q28(this.getMachine());
		case '*':
			return new Q30(this.getMachine());
		default:
			return new Q33(this.getMachine());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.softctrl.lexor.State#readChar(char)
	 */
	public char readChar(char c) {
		return c == '/' ? c : '\0';
	}

}
