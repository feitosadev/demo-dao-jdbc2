package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
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
		
		System.out.println("\nTeste 4");		
		Seller newSeller = new Seller(27, "Jose", "jose@gmail.com", new Date(), 2900.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		System.out.println("\nTeste 5");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		
		System.out.println("\nTeste 6");
		System.out.println("Digite o id para deletar no teste.");
		int id = entrada.nextInt();
		sellerDao.deleteById(id);
	}
}