package cl.desafiolatam.sismoschile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PresenteVista {
    private Presente presente;
    private SismoAdapter adapter;
    private RecyclerView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presente = new Presente (this,new Repositorio());
        adapter = new SismoAdapter(new ArrayList<>());
        view = findViewById(R.id.RecyclerSismo);
        view.setLayoutManager(new LinearLayoutManager(getParent()));
        view.setAdapter(adapter);
    }

    @Override
    public void showInfo(List<SismosLista> listaSismo) {
        adapter.update(listaSismo);

    }
}