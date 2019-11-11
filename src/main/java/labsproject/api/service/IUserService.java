package labsproject.api.service;

import labsproject.api.entity.User;

public interface IUserService {
	public Iterable<User> getAllList();
	public User getById(Long id);
	public User Insert(User user);
	public User Update(User user, Long id);
	public User Login(String username, String password);
}
