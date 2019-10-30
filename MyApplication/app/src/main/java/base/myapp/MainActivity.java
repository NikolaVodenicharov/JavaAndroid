package base.myapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.addButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText firstNumber = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumber = (EditText) findViewById(R.id.secondNumEditText);
                TextView textView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());
                int result = num1 + num2;

                textView.setText(result + "");
            }
        });
        }

}
