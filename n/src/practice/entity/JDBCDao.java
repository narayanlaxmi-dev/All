package practice.entity;
// generic interface

import java.util.Collection;

public interface JDBCDao<T, K> {
	Collection<T> getAll();

	T getOne(K key);

	void add(T t);

	void update(T t);

	void delete(K k);
}
