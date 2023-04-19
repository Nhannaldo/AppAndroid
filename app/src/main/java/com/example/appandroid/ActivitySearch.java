package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.SearchView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ActivitySearch extends AppCompatActivity implements MovieItemClick {

    private RecyclerView MovieRV;
    DataSource db;
    List<Movie> ds;
    List<Movie> search;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        MovieRV= findViewById(R.id.recyclerview);
        searchView=findViewById(R.id.searchview);
        db= new DataSource(ActivitySearch.this);
        ds=db.getAll();
        SearchAdapter adapter;
        adapter = new SearchAdapter(this,ds,this);
        MovieRV.setAdapter(adapter);
        MovieRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                search= new ArrayList<>();
                if( query.length()>0){
                    for (int i=0;i<ds.size();i++){
                        if(ds.get(i).getTitle().toUpperCase().contains(query.toUpperCase())){
                            Movie movie= new Movie();
                            movie.setTitle(ds.get(i).getTitle());
                            movie.setImage(ds.get(i).getImage());
                            search.add(movie);
                        }
                    }
                    SearchAdapter adapter;
                    adapter = new SearchAdapter(ActivitySearch.this,search,ActivitySearch.this);
                    MovieRV.setAdapter(adapter);
                    MovieRV.setLayoutManager(new LinearLayoutManager(ActivitySearch.this,LinearLayoutManager.VERTICAL,false));
                }
                else {
                    SearchAdapter adapter;
                    adapter = new SearchAdapter(ActivitySearch.this,ds,ActivitySearch.this);
                    MovieRV.setAdapter(adapter);
                    MovieRV.setLayoutManager(new LinearLayoutManager(ActivitySearch.this,LinearLayoutManager.VERTICAL,false));
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                search= new ArrayList<>();
                if( newText.length()>0){
                    for (int i=0;i<ds.size();i++){
                        if(ds.get(i).getTitle().toUpperCase().contains(newText.toUpperCase())){
                            Movie movie= new Movie();
                            movie.setTitle(ds.get(i).getTitle());
                            movie.setImage(ds.get(i).getImage());
                            search.add(movie);
                        }
                    }
                    SearchAdapter adapter;
                    adapter = new SearchAdapter(ActivitySearch.this,search,ActivitySearch.this);
                    MovieRV.setAdapter(adapter);
                    MovieRV.setLayoutManager(new LinearLayoutManager(ActivitySearch.this,LinearLayoutManager.VERTICAL,false));
                }
                else {
                    SearchAdapter adapter;
                    adapter = new SearchAdapter(ActivitySearch.this,ds,ActivitySearch.this);
                    MovieRV.setAdapter(adapter);
                    MovieRV.setLayoutManager(new LinearLayoutManager(ActivitySearch.this,LinearLayoutManager.VERTICAL,false));
                }
                return false;
            }
        });
    }
    @Override
    public void onItemClick(int position) {
        Intent intent= new Intent(ActivitySearch.this,MovieDetailActivity.class);
        intent.putExtra("img",ds.get(position).getImage());
        intent.putExtra("title",ds.get(position).getTitle());
        intent.putExtra("mota",ds.get(position).getDescription());
        startActivity(intent);
    }
}