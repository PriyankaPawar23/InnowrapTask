package com.example.innowraptask;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.innowraptask.model.item1;
import com.example.innowraptask.model.item2;
import com.example.innowraptask.model.item3;
import com.example.innowraptask.model.items;

import com.example.innowraptask.adapter.Adapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DrawerLayout dLayout;
    NavigationView navigationView;
    CardView cardView;
    ImageButton arrow;
    RelativeLayout hiddenLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        dLayout=findViewById(R.id.dLayout);
        navigationView=findViewById(R.id.navigation);
        cardView = findViewById(R.id.cardView);
        arrow = findViewById(R.id.arrow);
        hiddenLayout = findViewById(R.id.hiddenLayout);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenLayout.getVisibility()==View.VISIBLE)
                {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenLayout.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_down);
                }
                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenLayout.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_up);
                }
            }
        });



        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        List<items> itemss = new ArrayList<>();
        item1 item12 = new item1(R.drawable.child3, "Reagale", "New Sponsorship",Color.argb(255, 255, 178, 102), Color.argb(45, 255, 0, 102));
        itemss.add(new items(0, item12));
        item3 item31 = new item3("Johanna", "Birthday in 2 months", Color.argb(255, 0, 102, 0), Color.argb(255, 204, 255, 204));
        itemss.add(new items(2, item31));
        item2 item22 = new item2("How to use Amazon Smile and give as you live", R.drawable.child1, Color.argb(200, 255, 153, 204));
        itemss.add(new items(1, item22));
        item2 item23 = new item2("How to use Amazon Smile and give as you live", R.drawable.childpic, Color.argb(200, 255, 153, 204));
        itemss.add(new items(1, item23));
        item1 item13 = new item1(R.drawable.child2, "Reagale", "New Sponsorship",Color.argb(255, 255, 178, 102), Color.argb(45, 255, 0, 102));
        itemss.add(new items(0, item13));
        item3 item34 = new item3("Sergio","Give Thanks that Sergio receives regular home visits from caring project staff.", Color.argb(255, 255, 178, 102), Color.argb(45, 255, 0, 102));
        itemss.add(new items(2, item34));
        item3 item33 = new item3("Johanna", "Birthday in 2 months", Color.argb(255, 0, 102, 0), Color.argb(255, 204, 255, 204));
        itemss.add(new items(2, item33));
        item2 item24 = new item2("How to use Amazon Smile and give as you live", R.drawable.child1, Color.argb(200, 255, 153, 204));
        itemss.add(new items(1, item24));
        item3 item32 = new item3("Sergio","Give Thanks that Sergio receives regular home visits from caring project staff.", Color.argb(255, 139, 0, 0), Color.argb(45, 220, 20, 60));
        itemss.add(new items(2, item32));
        recyclerView.setAdapter(new Adapter(itemss));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                dLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }
}