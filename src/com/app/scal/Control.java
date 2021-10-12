/***************************************************************************	
 * 	Description:			Control to run the Simple 4 Calculator Program
 * 
 * 	Author:				 	C18727971 Thamsanqa Sibanda
 * 
 * 	Date:				 	30 September 2021
 ***************************************************************************/

package com.app.scal;

public class Control {
	
	public static void main(String[] args) {
		// Setup and Run Application
		Calculator myAppWindow = new Calculator("Simple Calculator");
		myAppWindow.setVisible(true);
		
		System.out.println("Hello World! I am the Simple Calculator");

	}// end main()

}// end Control Class
