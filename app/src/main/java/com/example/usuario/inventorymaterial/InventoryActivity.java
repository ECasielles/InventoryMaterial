package com.example.usuario.inventorymaterial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Actividad que maneja un inventario.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see AppCompatActivity
 */
public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
    }
}
