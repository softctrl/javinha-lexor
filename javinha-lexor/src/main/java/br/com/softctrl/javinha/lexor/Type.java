/**
 * 
 */
package br.com.softctrl.javinha.lexor;

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
 * Extracted from enum Tag (@author gustavo).
 * 
 * @author carlostimoshenkorodrigueslopes@gmail.com
 */
public enum Type implements br.com.softctrl.lexor.Type {

	// fim de arquivo
//	EOF("EOF", true),

	// Operadores
	RELOP_LT("RELOP_LT", true),
	RELOP_LE("RELOP_LE", true),
	RELOP_GT("RELOP_GT", true),
	RELOP_GE("RELOP_GE", true),
	RELOP_EQ("RELOP_EQ", true),
	RELOP_NE("RELOP_NE", true),
	RELOP_ASSIGN("RELOP_ASSIGN", true),
	RELOP_PLUS("RELOP_PLUS", true),
	RELOP_MINUS("RELOP_MINUS", true),
	RELOP_MULT("RELOP_MULT", true),
	RELOP_DIV("RELOP_DIV", true),

	// Simbolos
	SMB_OP("SMB_OP", true),
	SMB_CP("SMB_CP", true),
	SMB_SEMICOLON("SMB_SEMICOLON", true),

	// identificador
	ID("ID", true),

	// numeros
	DIGIT("DIGIT", true),

	// strings
	STRING("STRING", true),

	// palavra reservada
//	KW("KW", true),

	// Comments
	COMMENT("COMM", false);

	private String value;
	private boolean code;

	/**
	 * 
	 * @param code
	 * @param value
	 */
	private Type(String value, boolean code) {
		this.value = value;
		this.code = code;
	}

	/*
	 * (non-Javadoc)
	 * @see br.com.softctrl.lexor.Type#value()
	 */
	public String value() {
		return this.value;
	}
	
	/*
	 * (non-Javadoc)
	 * @see br.com.softctrl.lexor.Type#isCode()
	 */
	public boolean isCode() {
		return this.code;
	}

}
