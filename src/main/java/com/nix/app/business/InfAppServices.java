package com.nix.app.business;

import java.util.List;

import javax.ejb.Local;

import entities.User;

@Local
public interface InfAppServices {	
	
	public void signUpUser(User user); 
	public User signInUser(String email); 
	
	
		
	
	
	
	/*public void addCollection(String userId, Collection collection);
	
	public void removeCollection(String collectionId); 
	public void updateCollection(Collection collection); 
	
	public void addItem(String collectionId, Item item,byte[] bytes);
	
	public void updateItem(Item item, byte[] bytes); 
	public void removeItem(String  itemId); */
	
	
	
	
	
	/* for test */ 
	
	public  <T> T find(Class< T> clazz,Object id); 
	public <T> void remove(Class<T> clazz, Object id); 
	
	public <T> List<T> getAll(Class<T> clazz);  
	public <T> void deleteAll(Class<T> clazz); 
	public <T> void removeAll(Class<T> clazz); 
	
	
}
