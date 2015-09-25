package campos.steve.tryingsupportlibrary;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private LinearLayout linearLayout;
    private TextView textView;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayoutFragment);
        textView = (TextView) findViewById(R.id.textView);
        context = getApplicationContext();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                Snackbar.make(navigationView, menuItem.getTitle(), Snackbar.LENGTH_LONG).show();

                textView.setText(menuItem.getTitle());
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve1));
                        break;
                    case R.id.nav_calendar:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve2));
                        break;
                    case R.id.nav_music:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve3));
                        break;
                    case R.id.nav_messages:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve4));
                        break;
                    case R.id.aditional1:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve5));
                        break;
                    case R.id.aditional2:
                        linearLayout.setBackgroundColor(context.getResources().getColor(R.color.PersonalizadoSteve4));
                        break;
                }
                return true;
            }
        });
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
    /*public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/
}
