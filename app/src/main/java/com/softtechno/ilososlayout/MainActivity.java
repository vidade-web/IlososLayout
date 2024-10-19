package com.softtechno.ilososlayout;

import java.util.Objects;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;
import com.softtechno.ilososlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout drawer;
    private TextView pagetitle;
    private Button menuButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        super.onCreate(savedInstanceState);
        com.softtechno.ilososlayout.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_login_index,
                R.id.nav_login_verified,
                R.id.nav_order_create,
                R.id.nav_profile_index,
                R.id.nav_profile_settings,
                R.id.nav_locations_index,
                R.id.nav_locations_create,
                R.id.nav_locations_update,
                R.id.nav_locations_help,
                R.id.nav_locations_search_index,
                R.id.nav_locations_search_map
        ).setOpenableLayout(drawer).build();
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_content_main);
        NavController navController = Objects.requireNonNull(navHostFragment).getNavController();
        NavigationUI.setupWithNavController(navigationView, navController);
        drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        pagetitle = findViewById(R.id.pagetitle);
        menuButton = findViewById(R.id.menu_button);
        //menuButton.setWidth(0);
        //menuButton.setVisibility(View.INVISIBLE);
        menuButton.setOnClickListener(v -> drawer.openDrawer(GravityCompat.START));

        backButton = findViewById(R.id.back_button);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }

    public void setPagetitle(int title, String type) {
        int textSize = 0;
        switch(type) {
            case "big":
                textSize = 24;
                break;
            case "small":
                textSize = 18;
                break;
        }
        pagetitle.setTextSize(textSize);
        pagetitle.setText(title);
    }

    public void setStatusMenuButton(boolean isVisible) {
        int status = isVisible ? View.VISIBLE : View.INVISIBLE;
        menuButton.setVisibility(status);
    }

    public void setStatusBackButton(boolean isVisible) {
        int status = isVisible ? View.VISIBLE : View.INVISIBLE;
        backButton.setVisibility(status);
    }

    /*
    public void toggleDrawerLockMode(boolean enable) {
        int lockMode = enable ? DrawerLayout.LOCK_MODE_UNLOCKED : DrawerLayout.LOCK_MODE_LOCKED_CLOSED;
        drawer.setDrawerLockMode(lockMode);
    }
    * */


}