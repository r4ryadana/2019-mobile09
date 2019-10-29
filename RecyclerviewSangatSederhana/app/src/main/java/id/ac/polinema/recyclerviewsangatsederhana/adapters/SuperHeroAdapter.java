package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder> {
    private List<SuperHero> heroList;
    public Context mContext;

    public SuperHeroAdapter(Context context, List<SuperHero> heroList) {
        this.heroList = heroList;
        mContext = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero, parent, false);
        return new MyViewHolder(superHeroView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.heroName.setText(heroList.get(position).getHeroName());
    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView heroName;
        private ImageView gambarC;

        public MyViewHolder(View itemView) {
            super(itemView);
            heroName = (TextView) itemView.findViewById(R.id.heroName);
            gambarC = (ImageView) itemView.findViewById(R.id.gambarC);
        }
    }
}
