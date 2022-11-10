package com.example.socialapp.dao;

import com.example.socialapp.model.User;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class UserDao {
    FirebaseFirestore db=FirebaseFirestore.getInstance();
    CollectionReference userCollection=db.collection("users");
    public void addUser(User user){
        userCollection.document(user.getUid()).set(user);
    }
    public Task<DocumentSnapshot> getUserById(String uid){
        return userCollection.document(uid).get();
    }
}

