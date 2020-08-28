package com.example.exless1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student ( "Vasya", 1));
        students.add(new Student ( "Masya", 2));
        students.add(new Student ( "Kasya", 3));
        students.add(new Student ( "Basya", 4));
        students.add(new Student ( "Pasya", 5));
        students.add(new Student ( "Sasya", 6));
        students.add(new Student ( "Dasya", 7));
        students.add(new Student ( "Vasya", 1));
        students.add(new Student ( "Masya", 2));
        students.add(new Student ( "Kasya", 3));
        students.add(new Student ( "Basya", 4));
        students.add(new Student ( "Pasya", 5));
        students.add(new Student ( "Sasya", 6));
        students.add(new Student ( "Dasya", 7));

        StudentAdapter adapter = new StudentAdapter(students);
        recyclerView.setAdapter(adapter);



    }
}