package co.edu.unbosque.parkea.repository;

import co.edu.unbosque.parkea.model.ReservaCupo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Esta clase se usa como repositorio de Reserva
 */
@Repository
public interface ReservaCupoRepository extends CrudRepository<ReservaCupo, Integer> {
}
