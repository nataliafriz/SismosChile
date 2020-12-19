package cl.desafiolatam.sismoschile;

import java.util.List;

public class Presente implements PresenteRepositorio {
    PresenteVista vista;
    Repositorio repositorio;

    public Presente(PresenteVista vista, Repositorio repositorio) {
        this.vista = vista;
        this.repositorio = repositorio;
    }

    @Override
    public void showInfo(List<SismosLista> listaSismo) {
        vista.showInfo(listaSismo);
    }
}
