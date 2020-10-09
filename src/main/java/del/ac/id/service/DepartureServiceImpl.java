package del.ac.id.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import del.ac.id.model.Departure;
import del.ac.id.repository.DepartureRepository;

@Service
public class DepartureServiceImpl implements DepartureService{

	@Autowired
	private DepartureRepository departureRepository;
	
	@Override
	public List<Departure> getAllDepartures() {
		return departureRepository.findAll();
	}

	@Override
	public void saveDeparture(Departure departure) {
		this.departureRepository.save(departure);
		
	}

	@Override
	public Departure getDeparturebyId(long id) {
		Optional<Departure> optional = departureRepository.findById(id);
		Departure departure = null;
		if(optional.isPresent()) {
			departure = optional.get();
		}else {
			throw new RuntimeException("Departure tidak ditemukan");
		}
		
		return departure;
	}

	@Override
	public void deleteDepartureById(long id) {
		this.departureRepository.deleteById(id);
	}

}
