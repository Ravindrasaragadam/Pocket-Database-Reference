package com.example.ravi.projectl;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class TutorialActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fragmentManager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
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
                .replace(R.id.content_tutor_frame
                        , new OverviewFragment())
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
        getMenuInflater().inflate(R.menu.tutorial, menu);
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


        if (id == R.id.nav_overview) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new OverviewFragment())
                    .commit();
        } else if (id == R.id.nav_architecture) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new ArchitectureFragment())
                    .commit();

        }else if (id == R.id.nav_models) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new DataModelsFragment())
                    .commit();

        } else if (id == R.id.nav_schemas) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new SchemaFragment())
                    .commit();

        }  else if (id == R.id.nav_erbasic) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new ErBasicFragment())
                    .commit();

        } else if (id == R.id.nav_generaliZation) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new GeneralizationFragment())
                    .commit();

        } else if (id == R.id.nav_coddrule) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new CoddFragment())
                    .commit();


        } else if (id == R.id.nav_relationalmodel) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new RelationalDataFragment())
                    .commit();

        } else if (id == R.id.nav_relationalalgebra) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new RelationalAlgebraFragment())
                    .commit();

        } else if (id == R.id.nav_sql) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new SQLFragment())
                    .commit();

        } else if (id == R.id.nav_normalisation) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new NormalizationFragment())
                    .commit();

        } else if (id == R.id.nav_rdbjoins) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new JoinFragment())
                    .commit();

        } else if (id == R.id.nav_storagesystem) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new StorageSystemFragment())
                    .commit();

        } else if (id == R.id.nav_filestructure) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new FileStructureFragment())
                    .commit();


        } else if (id == R.id.nav_transaction) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new TransactionFragment())
                    .commit();

        } else if (id == R.id.nav_concurrencycontrol) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new ConcurrencyFragment())
                    .commit();

        } else if (id == R.id.nav_deadlock) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new DeadlockFragment())
                    .commit();

        } else if (id == R.id.nav_databackup) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new BackupFragment())
                    .commit();


        } else if (id == R.id.nav_recovery) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_tutor_frame
                            , new RecoveryFragment())
                    .commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
