package com.example.oilfi.kcf;

import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import androidx.annotation.NonNull;

import static androidx.constraintlayout.motion.widget.MotionScene.TAG;

public class FirebaseHelper {
	
	public FirebaseHelper() {
		FirebaseFirestore db = FirebaseFirestore.getInstance();
		db.collection("0").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
			@Override
			public void onComplete(@NonNull Task<QuerySnapshot> task) {
				if (task.isSuccessful()) {
					for (QueryDocumentSnapshot document : task.getResult()) {
						Log.d(TAG, document.getId() + " => " + document.getData());
					}
				}
				else {
					Log.w(TAG, "Error getting documents.", task.getException());
				}
			}
		});
	}
}
