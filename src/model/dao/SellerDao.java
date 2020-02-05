package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	// operacao responsavel por inserir no banco,o (obj) que for colocado como parametro
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
		Seller findById(Integer Id);//pega o paramentro e consulta no banco
		List<Seller> findAll();//retorna todos os departamentos
		List<Seller> findByDepartment(Department department);

}
