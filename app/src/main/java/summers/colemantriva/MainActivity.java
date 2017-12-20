package summers.colemantriva;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.sql.BatchUpdateException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //define variables
    private Button answer1, answer2, answer3, answer4;
    private TextView score;
    private TextView question;


    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.sQutestions.length;

    Random random;

    private SharedPreferences savedValues;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar
                        .make(view, "Thank You for Liking my App!", Snackbar.LENGTH_LONG)
                        .setAction("Retry", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Confirm Click", Toast.LENGTH_LONG).show();
                            }
                        });

                snackbar.setActionTextColor(Color.BLUE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.BLUE);

                TextView textView = snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });

        random = new Random();

        //get reference to the widgets
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);


        updateQuestions(random.nextInt(mQuestionLength));


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(random.nextInt(mQuestionLength));
                    if(mScore == 10){
                        Intent i = new Intent(getApplicationContext(), Gameover.class);
                        startActivity(i);
                    }
                }else{
                    mScore--;
                    score.setText("Score: " + mScore);
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(random.nextInt(mQuestionLength));
                    if(mScore == 10){
                        Intent i = new Intent(getApplicationContext(), Gameover.class);
                        startActivity(i);
                    }
                }else{
                    mScore--;
                    score.setText("Score: " + mScore);
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(random.nextInt(mQuestionLength));
                    if(mScore == 10){
                        Intent i = new Intent(getApplicationContext(), Gameover.class);
                        startActivity(i);
                    }
                }else{
                    mScore--;
                    score.setText("Score: " + mScore);
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestions(random.nextInt(mQuestionLength));
                    if(mScore == 10){
                        Intent i = new Intent(getApplicationContext(), Gameover.class);
                        startActivity(i);
                    }
                }else{
                    mScore--;
                    score.setText("Score: " + mScore);
                }
            }
        });

    }

    private void updateQuestions(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getAnswer(num);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       RelativeLayout main = (RelativeLayout) findViewById(R.id.main);

        switch (item.getItemId()) {

            case R.id.menu_red:
                if(item.isChecked()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }

                main.setBackgroundColor(Color.rgb(215, 60, 60));
                return true;
            case R.id.menu_green:
                if(item.isChecked()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }

                main.setBackgroundColor(Color.rgb(150, 255, 140));
                return true;
            case R.id.menu_blue:
                if(item.isChecked()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }

                main.setBackgroundColor(Color.rgb(115, 145, 255));
                return true;
            case R.id.menu_yellow:
                if(item.isChecked()){
                    item.setChecked(false);
                }
                else{
                    item.setChecked(true);
                }

                main.setBackgroundColor(Color.rgb(255, 255, 0));
                return true;
            case R.id.action_settings:
                Intent i = new Intent(this, MyPreferencesActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
