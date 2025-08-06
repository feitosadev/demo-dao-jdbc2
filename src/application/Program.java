package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Magazine");
		
		Seller seller = new Seller(27, "Jose", "jose@gmail.com", new Date(), 2900.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

	}

}