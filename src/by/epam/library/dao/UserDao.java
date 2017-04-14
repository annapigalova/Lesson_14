package by.epam.library.dao;

import by.epam.library.bean.Product;
import by.epam.library.bean.User;

public interface UserDao {
	void signIn(String login, String password);
	void signOut(String login);
	void registration (User user);
	void rentItem (User user, Product product);	
	void backItem (Product product);

}
