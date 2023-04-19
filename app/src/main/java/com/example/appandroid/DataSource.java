package com.example.appandroid;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends SQLiteOpenHelper {

    public DataSource(Context context){
        super(context,"AppPhim.db",null,1);
    }
    public static List<Movie> getPhimMoi(){
        List<Movie> lstMovie= new ArrayList<>();
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoione)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi3)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi4)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi5)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi6)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi7)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi8)));
        return lstMovie;
    }
    public static List<Movie> getAnimeTV(){
        List<Movie> lstMovie= new ArrayList<>();
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime1)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime3)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime4)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime5)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime6)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime7)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime8)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime9)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.anime10)));
        return lstMovie;
    }
    public static List<Movie> getHanhDong(){
        List<Movie> lstMovie= new ArrayList<>();
        lstMovie.add(new Movie(String.valueOf(R.drawable.hanhdong1)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.hanhdong2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.filmmoi4)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.slide1)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.slide2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.slide3)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.slide4)));
        return lstMovie;
    }
    public static List<Movie> getTinhCam(){
        List<Movie> lstMovie= new ArrayList<>();
        lstMovie.add(new Movie(String.valueOf(R.drawable.tinhcam1)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.tinhcam2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.tinhcam3)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.tinhcam4)));
        return lstMovie;
    }
    public static List<Movie> getKinhDi(){
        List<Movie> lstMovie= new ArrayList<>();
        lstMovie.add(new Movie(String.valueOf(R.drawable.kinhdi1)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.kinhdi2)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.kinhdi3)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.kinhdi4)));
        lstMovie.add(new Movie(String.valueOf(R.drawable.kinhdi5)));
        return lstMovie;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public List<Movie> getAll(){
        List<Movie> ds= new ArrayList<>();
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cs=db.rawQuery("SELECT * FROM Movie",null);
        cs.moveToFirst();
        while (!cs.isAfterLast()){
            String title=cs.getString(4);
            String image=cs.getString(2);
            String mota= cs.getString(5);
            Movie p= new Movie(title,image,mota);
            ds.add(p);
            cs.moveToNext();
        }
        cs.close();
        return ds;
    }
}
