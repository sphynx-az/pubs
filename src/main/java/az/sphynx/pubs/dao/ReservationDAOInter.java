package az.sphynx.pubs.dao;

import az.sphynx.pubs.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationDAOInter extends CrudRepository<Reservation, Integer> {
}
