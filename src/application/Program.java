package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("::: TEST 1 - Seller findById :::");	
		//test class SellerDao
		SellerDao sellerDao = new DaoFactory().createSellerDao();

		//test SellerDaoJDBC
		Seller seller = sellerDao.findById(3);
		System.out.println(seller); //test interface sellerDao JDBC
		
		System.out.println("");
		System.out.println("::: TEST 2 - Seller findByDepartment :::");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) { //print list seller by department searched
			System.out.println(obj);
		}
		
	}
}
