package az.sphynx.pubs.service.impl;

import az.sphynx.pubs.dao.ReservationDAOInter;
import az.sphynx.pubs.entity.Reservation;
import az.sphynx.pubs.service.inter.ReservationServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ReservationServiceImpl implements ReservationServiceInter {

    @Autowired
    ReservationDAOInter aReservationDaoInter;

    @Override
    public List<Reservation> findAll() {
        return (List<Reservation>) aReservationDaoInter.findAll();
    }

    @Override
    public Reservation findById(Integer id) {
        return aReservationDaoInter.findById(id).get();
    }

    @Override
    public Reservation save(Reservation vReservation) {
        return aReservationDaoInter.save(vReservation);
    }

    @Override
    public int deleteById(Integer id) {
        aReservationDaoInter.deleteById(id);
        return 0;
    }
}