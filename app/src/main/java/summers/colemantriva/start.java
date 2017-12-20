package summers.colemantriva;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences.Editor;

public class start extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void startGame(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
