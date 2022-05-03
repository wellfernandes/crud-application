package application;

import java.util.Date;
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
		
		System.out.println("");
		System.out.println("::: TEST 3 - Seller findAll :::");
		list = sellerDao.findAll();
		
		for(Seller obj : list) { //print list seller by all searched
			System.out.println(obj);
		}
		
		System.out.println("::: TEST 4 - Seller insert :::");
		//Seller newSeller = new Seller(null, "Greg", "greg@testdev.com", new Date(), 5000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New Id= " + newSeller.getId()); //print new seller inserted
		
		System.out.println("::: TEST 5 - Seller update :::");
		seller = sellerDao.findById(1);
		seller.setName("Peter Moon"); //updating the name of seller
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}
}
