package com.example.oilfi.kcf;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StationAdapter extends RecyclerView.Adapter<StationHolder> {
    private ArrayList<String> UnitList = new ArrayList<>();
    private ArrayList<String> StationList = new ArrayList<>();
    private Context context;
    private int StationSelected;

    public StationAdapter(ArrayList<String> unitList, ArrayList<String> stationList, Context context) {
        UnitList = unitList;
        StationList = stationList;
        this.context = context;
    }
	
	public int getStationSelected() {
		return StationSelected;
	}

    @NonNull
    @Override
    public StationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
	    LayoutInflater layoutInflater;
	    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.station, parent, false);
        StationHolder holder = new StationHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final StationHolder holder, final int position) {
        Log.d("adapter", "onBindCalled");
        holder.unit.setText(UnitList.get(position));
        holder.station.setText(StationList.get(position));

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
	            Toast.makeText(context, UnitList.get(position), Toast.LENGTH_SHORT).show();
	            StationSelected = position;
            }
        });
    }

    @Override
    public int getItemCount() {
        return UnitList.size();
    }
}

class StationHolder extends RecyclerView.ViewHolder {
	TextView station;
	TextView unit;
	LinearLayout linearLayout;
	
	public StationHolder(View itemView) {
		super(itemView);
		station = itemView.findViewById(R.id.StationList);
		unit = itemView.findViewById(R.id.UnitList);
		linearLayout = itemView.findViewById(R.id.stationLayout);
	}
}
