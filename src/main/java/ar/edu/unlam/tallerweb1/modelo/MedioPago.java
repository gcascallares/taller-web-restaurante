package ar.edu.unlam.tallerweb1.modelo;

import ar.edu.unlam.tallerweb1.modelo.extensions.MedioPagoEnum;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Sebastian on 04/05/2017.
 */
@Entity(name = "MedioPago")
public class MedioPago  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private MedioPagoEnum tipo;
    @Column(nullable = false,length = 200)
    private String descripcion;
    @ManyToMany(mappedBy = "mediosPago")
    private Collection<Restaurant> restaurants = new ArrayList<>();
    @OneToMany(mappedBy = "medioPago")
    private Collection<Reserva> reservas = new ArrayList<>();


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public MedioPagoEnum getTipo() {
        return tipo;
    }

    public void setTipo(MedioPagoEnum tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @ManyToMany(mappedBy="mediopago")
    public Collection<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Collection<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }
}
