package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("::: TEST 1 - findById Seller :::");	
		//test class SellerDao
		SellerDao sellerDao = new DaoFactory().createSellerDao();

		//test SellerDaoJDBC
		Seller seller = sellerDao.findById(3);
		System.out.println(seller); //test interface sellerDao JDBC
		
		System.out.println("");
		System.out.println("::: TEST 2 - findByDepartment Seller :::");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) { //print list seller by department searched
			System.out.println(obj);
		}
		
		System.out.println("");
		System.out.println("::: TEST 3 - findAll Seller :::");
		list = sellerDao.findAll();
		
		for(Seller obj : list) { //print list seller by all searched
			System.out.println(obj);
		}
		
		System.out.println("::: TEST 4 - insert Seller :::");
		//Seller newSeller = new Seller(null, "Greg", "greg@testdev.com", new Date(), 5000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New Id= " + newSeller.getId()); //print new seller inserted
		
		System.out.println("::: TEST 5 - update Seller :::");
		seller = sellerDao.findById(1);
		seller.setName("Peter Moon"); //updating the name of seller
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("::: TEST 6 - delete Seller :::");
		System.out.println("Enter id for delete test: ");
		int id = scanner.nextInt();
		sellerDao.deleteById(id);
		System.out.println("delete completed!");
		scanner.close();*/
		
		
		//System.out.println("::: TEST 1 - insert Department :::");
		//Department department = new Department(null, "Supervisor");
		DepartmentDao departmentDao = new DaoFactory().createDepartmentDao();
		//departmentDao.insert(department); //test insert new department
		//System.out.println("Inserted! New department Id= " + department.getId());

		/*
		System.out.println("::: TEST 2 - findById Department :::");
		Department department = departmentDao.findById(3); //test findById Department
		System.out.println(department); 
		
		
		System.out.println("::: TEST 3 - update Department :::");
		Department department  = departmentDao.findById(6);
		department.setName("Tools"); //updating the name of department
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		*/
		
		System.out.println("::: TEST 4 - delete Department :::");
		System.out.println("Enter id for delete test: ");
		int id = scanner.nextInt();
		departmentDao.deleteById(id);
		System.out.println("delete completed!");
		scanner.close();
	}
}
