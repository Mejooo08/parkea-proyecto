package co.edu.unbosque.parkea.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="reserva_cupo")
@NamedQuery(name="ReservaCupo.findAll", query="SELECT r FROM ReservaCupo r")
public class ReservaCupo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name="id_factura")
    private int idFactura;

    @Getter @Setter @Column(name="momento_reserva")
    private String momentoReserva;

    @Getter @Setter @Column(name="hora_ingreso")
    private String horaIngreso;

    @Getter @Setter @Column(name="hora_salida")
    private String horaSalida;

    //bi-directional many-to-one association to Usuario
    @ManyToOne
    @Getter @Setter @JoinColumn(name="id_usuario")
    private Usuario usuario;

    //bi-directional many-to-one association to Usuario
    @ManyToOne
    @Getter @Setter @JoinColumn(name="id_parqueadero")
    private Parqueadero idParqueadero;

    @Getter @Setter @Column(name="placa_carro")
    private String placaCarro;

    @Getter @Setter @Column(name = "estado")
    private String  estado;

    /**
     * Este método se usa como constructor de la clase
     */
    public ReservaCupo() {
    }
}
