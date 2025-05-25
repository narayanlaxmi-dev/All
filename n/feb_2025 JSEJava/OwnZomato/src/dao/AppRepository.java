package dao;

import java.util.List;

// generic interface to particular templates
public interface AppRepository<T> {
	void save(T t);

	List<T> findAll();

	T findById(String k);
}
