package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Restaurant;
import exception.ResourceNotFoundException;

public class RestaurentDao implements AppRepository<Restaurant> {

	private Map<String, Restaurant> resturents;
	private static RestaurentDao restaurentdaoInstances = null;
	
	
	public RestaurentDao() {
		resturents = new HashMap<String, Restaurant>();
	}

	public static RestaurentDao getRestaurentDaoInstance() {
		if (restaurentdaoInstances == null)
			restaurentdaoInstances = new RestaurentDao();

		return restaurentdaoInstances;
	}

	@Override
	public void save(Restaurant rest) {
		resturents.put(rest.getId(), rest);
		System.out.println("Restudrent created successfully with id " + rest.getId());
	}

	@Override
	public List<Restaurant> findAll() {

		return resturents.values().stream().collect(Collectors.toList());
	}

	@Override
	public Restaurant findById(String id) {
		if (!resturents.containsKey(id)) {
			throw new ResourceNotFoundException(" Restaurent not found of id: " + id);
		}
		return resturents.get(id);
	}

	public Restaurant findbyName(String rstname) {
		return findAll().stream().filter(rest -> rest.getName().equalsIgnoreCase(rstname)).findFirst()
				.orElseThrow(() -> new ResourceNotFoundException("Restaurent not found you enter :" + rstname));
	}
}
