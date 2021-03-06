package com.example.ravi.projectl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        , new AboutUsFragment())
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //Fragment frag = null;

        if (id == R.id.nav_tutorial) {
            // Handle the practice button click
            Intent i=new Intent(MainActivity.this,TutorialActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_practice) {
            // Handle the practice button click
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new PracticeFragment())
                    .commit();
        } else if (id == R.id.nav_test) {
            // Handle the practice button click
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new TestFragment())
                    .commit();
        } else if (id == R.id.nav_video) {
            //frag=new VideoFragment();
            //Intent i=new Intent(MainActivity.this,TutorVideo.class);
            //startActivity(i);
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new VideoFragment())
                    .commit();

        } else if (id == R.id.nav_text) {

            //Intent i=new Intent(MainActivity.this,TutorText.class);
            //startActivity(i);
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new TextFragment())
                    .commit();

        } else if (id == R.id.nav_about) {

            //Intent i=new Intent(MainActivity.this,Aboutus.class);
            //startActivity(i);
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame
                            , new AboutUsFragment())
                    .commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
