package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Department department = new Department(1, "Magazine");
		
		Seller seller = new Seller(27, "Jose", "jose@gmail.com", new Date(), 2900.0, department);
		*/
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		
		System.out.println("Teste 1");		
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);		
		
		System.out.println("\nTeste 2");		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list){
			System.out.println(obj);
		}
		
		System.out.println("\nTeste 3");
		list = sellerDao.findAll();
		for(Seller obj : list){
			System.out.println(obj);
		}
	}
}