package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	// operacao responsavel por inserir no banco,o (obj) que for colocado como parametro
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer Id);//pega o paramentro e consulta no banco
	List<Department> findAll();//retorna todos os departamentos

}
