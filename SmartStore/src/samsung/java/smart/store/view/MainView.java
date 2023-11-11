package samsung.java.smart.store.view;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @author Bui Trong Tung
 * The MainView extending JFrame displays the main view of the Smart Store System. This class imple
 */
@SuppressWarnings("serial")
public class MainView extends JFrame implements IMainView {
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem createAccountItem;
	private JMenuItem signOutMenu;
	
	/**
	 * Constructs the main windows of the Smart Store System
	 */
	public MainView(){

		menuBar = new JMenuBar();
		
		//Product menu
		menu = new JMenu("Products");
		menu.setMnemonic(KeyEvent.VK_P);
		menuBar.add(menu);
		
		//Account menu
		menu = new JMenu("Account");
		menu.setMnemonic(KeyEvent.VK_A);
		
		signOutMenu = new JMenuItem("Sign out", KeyEvent.VK_S);
		menu.add(signOutMenu);
		menuBar.add(menu);
		
		//Exit menu
		menu = new JMenu("Exit");
		menu.setMnemonic(KeyEvent.VK_E);
		menuBar.add(menu);
		
		setJMenuBar(menuBar);
		
		setTitle("Smart Store");
		setSize(500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/* (non-Javadoc)
	 * @see samsung.java.smart.store.view.IMainView#addAdminMenuItem()
	 */
	@Override
	public void addCreateAccountMenu(){
		createAccountItem = new JMenuItem("Create new account", KeyEvent.VK_C);
		menu = menuBar.getMenu(1);
		menu.add(createAccountItem);
		this.validate();
	}
	
	/* (non-Javadoc)
	 * @see samsung.java.smart.store.view.IMainView#setAdminItemActionListener(java.awt.event.ActionListener)
	 */
	@Override
	public void setCreateAccountActionListener(ActionListener listener){
		this.createAccountItem.addActionListener(listener);
	}
	
	/* (non-Javadoc)
	 * @see samsung.java.smart.store.view.IMainView#setSignOutActionListener(java.awt.event.ActionListener)
	 */
	@Override
	public void setSignOutActionListener(ActionListener listener) {
		this.signOutMenu.addActionListener(listener);
	}
}
