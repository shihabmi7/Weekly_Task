package com.bitmakers.weeklytask;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.bitmakers.weeklytask.Adapter.ContactsAdapter;
import com.bitmakers.weeklytask.Adapter.ProjectAdapter;
import com.bitmakers.weeklytask.R;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProjectActivity.this, ProjectCreateActivity.class));
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);
        // Create adapter passing in the sample user data
        ProjectAdapter adapter = new ProjectAdapter(this);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

}
