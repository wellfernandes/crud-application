package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
			
		//test class SellerDao
		SellerDao sellerDao = new DaoFactory().createSellerDao();

		//test SellerDaoJDBC
		Seller seller = sellerDao.findById(3);
		System.out.println(seller); //test interface sellerDao JDBC
		
	}
}
