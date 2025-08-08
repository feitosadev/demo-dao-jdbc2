package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Department department = new Department(1, "Magazine");
		
		Seller seller = new Seller(27, "Jose", "jose@gmail.com", new Date(), 2900.0, department);
		*/
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}