package com.example.oilfi.kcf;

import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import androidx.annotation.NonNull;

public class FirebaseHelper {
	
	private final FirebaseFirestore db;
	private static final String TAG = "FireBase Helper";
	public FirebaseHelper() {
		db = FirebaseFirestore.getInstance();
	}
	
	public void insert(Object object) {
		db.collection("/Audits/Pumps/List").document().set(object).addOnSuccessListener(new OnSuccessListener<Void>() {
			@Override
			public void onSuccess(Void aVoid) {
			
			}
		
		
		});
		
		db.collection("/Audits/Pumps/List").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
			@Override
			public void onComplete(@NonNull Task<QuerySnapshot> task) {
				if (task.isSuccessful()) {
					for (QueryDocumentSnapshot document : task.getResult()) {
						Log.d(TAG, document.getId() + " => " + document.getData());
						Pump_Audit pump_audit = document.toObject(Pump_Audit.class);
						
						Log.d(TAG, pump_audit.getPumpName());
						
					}
				}
				else {
					Log.w(TAG, "Error getting documents.", task.getException());
				}
			}
		});
		
	}
}
