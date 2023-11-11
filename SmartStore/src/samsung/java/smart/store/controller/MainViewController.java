package samsung.java.smart.store.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import samsung.java.smart.store.view.IMainView;
import samsung.java.smart.store.view.MainView;

/**
 * @author Bui Trong Tung
 *The class MainViewController controls the main windows of the Smart Store application
 */
public class MainViewController {
	private IMainView mainWindow;
	
	/**
	 * The constructor
	 */
	public MainViewController(){
		mainWindow = new MainView();
		mainWindow.setSignOutActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub				
			}			
		});
	}
	
	/**
	 * Change the main window if the user has administrator permission
	 */
	public void setAdminView(){
		mainWindow.addCreateAccountMenu();
		mainWindow.setCreateAccountActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}			
		});
	}
}
