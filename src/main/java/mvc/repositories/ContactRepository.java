package mvc.repositories;

import mvc.models.ContactModel;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<ContactModel, Integer> {
}
