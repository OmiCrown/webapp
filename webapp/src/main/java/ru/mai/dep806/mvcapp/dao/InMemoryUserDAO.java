package ru.mai.dep806.mvcapp.dao;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import ru.mai.dep806.mvcapp.model.User;

/**
 * Created by Omicrown on 05.06.2015.
 */
public class InMemoryUserDAO implements UserDAO {
	private Map<Long, User> users = new HashMap<Long, User>();
	private AtomicLong sequence = new AtomicLong(0);

	public InMemoryUserDAO() {
		saveUser(new User("John Smith", "john", "jsmith@mail.com", new Date(), true));
		saveUser(new User("Steve Brown", "steve", "sbrown@mail.com", new Date(), true));
	}

	@Override
	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}
	@Override
	public User findUserById(Long id) {
		return users.get(id);
	}

	@Override
	public User saveUser(User user) {
		if (user.getId() == 0) {
			user.setId(sequence.getAndIncrement());
		}
		users.put(user.getId(), user);
		return user;
	}
}
