package com.example.socialapp.dao;

import android.util.Log;
import android.widget.Toast;

import com.example.socialapp.model.Post;
import com.example.socialapp.model.User;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class PostDao {
    private FirebaseFirestore db=FirebaseFirestore.getInstance();
    private FirebaseAuth mAuth;
    private CollectionReference postCollections=db.collection("posts");
    private User mUser;
    public void addPost(String text){
        mAuth=FirebaseAuth.getInstance();
        String currentUid=mAuth.getCurrentUser().getUid();
        UserDao userDao=new UserDao();
        userDao.getUserById(currentUid).addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                User user=documentSnapshot.toObject(User.class);
                mUser=user;
                long currentTime=System.currentTimeMillis();
                Post post=new Post(text,mUser,currentTime);
                postCollections.document().set(post);
                Log.d("PostDao","Success");
            }
        });

    }
}
