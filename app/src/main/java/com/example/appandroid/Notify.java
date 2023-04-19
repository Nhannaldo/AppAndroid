package com.example.appandroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class Notify {
    public static void exit(Context context){
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Đăng xuất!");
        alertDialogBuilder.setIcon(R.drawable.thongbao);
        alertDialogBuilder.setMessage("Bạn có chắc chắn muốn đăng xuất?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Intent intent= new Intent(this,Signin.class);
                System.exit(1)
                ;
            }
        });
        alertDialogBuilder.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();
    }
}
