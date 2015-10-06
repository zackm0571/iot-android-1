package joanbempong.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class OnCallActivity extends AppCompatActivity {

    Button hangUpBtn;
    HueController hueController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_call);

        hueController = HueController.getInstance();
        hueController.turnOnOnCallLights();

        //connects the button to the widgets created in xml
        hangUpBtn = (Button)findViewById(R.id.hangUpBtn);

        //creates an on click listener
        hangUpBtn.setOnClickListener(hangUpBtnOnClickListener);
    }

    View.OnClickListener hangUpBtnOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            hueController.restoreAllLightStates();
            // navigate to the MyContacts page
            startActivity(new Intent(OnCallActivity.this, HomeActivity.class));
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_on_call, menu);
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
}