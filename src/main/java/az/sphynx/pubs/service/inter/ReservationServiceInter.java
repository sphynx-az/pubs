package az.sphynx.pubs.service.inter;

import az.sphynx.pubs.entity.Reservation;
import org.springframework.stereotype.Service;
import java.util.List;
@Service 
public interface ReservationServiceInter{
List<Reservation> findAll();
Reservation findById(Integer id);
Reservation save(Reservation vReservation);
int deleteById(Integer id);
}