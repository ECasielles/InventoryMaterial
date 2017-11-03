package com.example.usuario.inventorymaterial;

import android.app.Application;

import com.example.usuario.inventorymaterial.pojo.Dependency;

import java.util.ArrayList;

/**
 * Clase singleton (hereda de Application) que contiene los datos
 *
 * @author Enrique Casielles
 * @version 1.0
 * @see android.app.Application
 * @see ArrayList
 * @see Dependency
 */
//IMPORTANTE: Comprobar en el manifest que está name:.InventoryApplication
public class InventoryApplication extends Application {

    ArrayList<Dependency> dependencies;

    public InventoryApplication() {
        dependencies = new ArrayList<>();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
