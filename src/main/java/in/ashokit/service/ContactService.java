package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contacts;

public interface ContactService {

	public boolean saveContact(Contacts contact);

	public List<Contacts> getAllContacts();

	public Contacts getContactById(Integer contactId);

	boolean deleteContactById(Integer contactId);

}
