package cl.desafiolatam.sismoschile;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SismoAdapter extends RecyclerView.Adapter<SismoAdapter.SismosVH> {
    private static final String TAG = "Repositorio";
    private final List<SismosLista> sismo;

    public SismoAdapter(List<SismosLista> sismo) {
        this.sismo = sismo;
    }


    @NonNull
    @Override
    public SismoAdapter.SismosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_sismos,parent,false);
        return new SismosVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SismoAdapter.SismosVH holder, int position) {
        SismosLista sl = sismo.get(position);
                holder.bind(sl);
        Log.d(TAG, "onBindViewHolder: " + sl);

    }

    @Override
    public int getItemCount() {
        return sismo.size();
    }

    public void update(List<SismosLista> listaSismo) {
        sismo.clear();
        sismo.addAll(listaSismo);
        notifyDataSetChanged();
    }

    public class SismosVH extends RecyclerView.ViewHolder {
        private TextView tvFechaVH;
        private TextView tvLatitudVH;
        private TextView tvLongitudVH;
        private TextView tvProfundidadVH;
        private TextView tvMagnitudVH;
        private TextView tvAgenciaVH;
        private TextView tvRefGeograficaVH;
        private TextView tvFechaUpdateVH;

        public SismosVH(@NonNull View itemView) {
            super(itemView);
            tvFechaVH = itemView.findViewById(R.id.tvFecha);
            tvLatitudVH = itemView.findViewById(R.id.tvLatitud);
            tvLongitudVH = itemView.findViewById(R.id.tvLongitud);
            tvProfundidadVH = itemView.findViewById(R.id.tvProfundidad);
            tvMagnitudVH = itemView.findViewById(R.id.tvMagnitud);
            tvAgenciaVH = itemView.findViewById(R.id.tvAgencia);
            tvRefGeograficaVH = itemView.findViewById(R.id.tvRefGeografia);
            tvFechaUpdateVH = itemView.findViewById(R.id.tvFechaUpdate);
        }

        public void bind(SismosLista sl) {
            Log.d(TAG, "bind: " + sl);
            tvFechaVH.setText(sl.getFecha());
            tvLatitudVH.setText(sl.getLatitud());
            tvLongitudVH.setText(sl.getLongitud());
            tvProfundidadVH.setText(sl.getProfundidad());
            tvMagnitudVH.setText(sl.getMagnitud());
            tvAgenciaVH.setText(sl.getAgencia());
            tvRefGeograficaVH.setText(sl.getRefGeografica());
            tvFechaUpdateVH.setText(sl.getFechaUpdate());
        }
    }
}
