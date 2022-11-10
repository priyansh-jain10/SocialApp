package com.example.socialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.socialapp.dao.PostDao;

public class CreatePostActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
        Button postButton=findViewById(R.id.postButton);
        input=findViewById(R.id.postInput);
        PostDao postDao=new PostDao();
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String postText=input.getText().toString().trim();
                if(!postText.isEmpty()){
                    postDao.addPost(postText);
                    finish();
                }
            }
        });
    }
}