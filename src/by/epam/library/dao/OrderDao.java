package by.epam.library.dao;

import by.epam.library.bean.Order;

public interface OrderDao {
	
	void addOrder (Order order);
	void cancelOrder(Order order);
	

}
