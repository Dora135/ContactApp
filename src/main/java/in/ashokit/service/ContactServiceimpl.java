package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Contacts;
import in.ashokit.repository.ContactRepository;
@Service
public class ContactServiceimpl implements ContactService {
	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContact(Contacts contact) {
		contact=repo.save(contact);
		return true;
		
	}

	@Override
	public List<Contacts> getAllContacts() {
		return repo.findAll();
		
	}

	@Override
	public Contacts getContactById(Integer contactId) {
	Optional<Contacts> con=repo.findById(contactId);
	if(con.isPresent()) {
		return con.get();
	}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		repo.deleteById(contactId);
		return true;
	}

}
