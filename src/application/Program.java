package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//test class Seller
		Department department = new Department(1, "development");
		Seller seller = new Seller(20, "Mike", "mike@devmail.com", new Date(), 5000.0, department);
		System.out.println(seller); //print test
		
		//test class SellerDao
		SellerDao sellerDao = new DaoFactory().createSellerDao();
		System.out.println(sellerDao.getClass()); //print test
	}
}
