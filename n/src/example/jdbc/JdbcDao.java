package example.jdbc;

import java.util.Collection;

// generic interface provide basic tempplates for performing crud operations

public interface JdbcDao<T, K> {	// T entity or table /key type

//	READ DQL
	Collection<T> getAll();			// get all obj of specific type

	T getOne(K key);				// get 1 obj specific type based upon identity
//	DCL operations

	void add(T t);					// add new record into exixting talbe

	void update(T t);				// update existing record

	void delete(T t); 				// delete exisiting record

}
