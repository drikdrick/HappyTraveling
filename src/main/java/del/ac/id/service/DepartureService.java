package del.ac.id.service;

import java.util.List;

import del.ac.id.model.Departure;

public interface DepartureService {

	List<Departure> getAllDepartures();
	void saveDeparture(Departure departure);
	Departure getDeparturebyId(long id);
	void deleteDepartureById(long id);
}
