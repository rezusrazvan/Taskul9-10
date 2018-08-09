package com.example.student.harta;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng Bucuresti = new LatLng(44, 26);
        mMap.addMarker(new MarkerOptions().position(Bucuresti).title("Marker in Bucuresti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bucuresti));

        LatLng Berlin = new LatLng(52,13);
        mMap.addMarker(new MarkerOptions().position(Berlin).title("Marker in Berlin"));

        LatLng Londra = new LatLng(51,-0.1);
        mMap.addMarker(new MarkerOptions().position(Londra).title("Marker in Londra"));


    }
}
