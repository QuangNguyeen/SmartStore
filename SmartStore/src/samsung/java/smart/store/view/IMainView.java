package samsung.java.smart.store.view;

import java.awt.event.ActionListener;

/**
 * @author Bui Trong Tung
 *	The IMainView interface assign methods to main window of the Smart Store System  
 */
public interface IMainView {

	/**
	 * Add the Create new account menu item on menu if the signed user is admin
	 */
	public void addCreateAccountMenu();
	
	/**
	 * Set listener to Create new account menu item
	 * @param listener A ActionListener listens the event when the user chooses Create new account menu item
	 */
	public void setCreateAccountActionListener(ActionListener listener);
	
	/**
	 * Set listener to Sign out menu
	 * @param listener A ActionListener listens the event when the user chooses Sign out menu item
	 */
	void setSignOutActionListener(ActionListener listener);

}