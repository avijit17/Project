package example.calculatorapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText one,two;
    Button plus,minus,multiply,divide;
    TextView showres;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        one = (EditText)findViewById(R.id.editText1);
        two = (EditText)findViewById(R.id.editText2);
        plus = (Button)findViewById(R.id.button);
        minus = (Button)findViewById(R.id.button2);
        multiply = (Button)findViewById(R.id.button3);
        divide = (Button)findViewById(R.id.button4);
        showres = (TextView)findViewById(R.id.textView3);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try{
                    int n1 = Integer.parseInt(one.getText().toString());
                    int n2 = Integer.parseInt(two.getText().toString());
                    int sum = n1+n2;
                    showres.setText(" "+sum);
                }
                catch(Exception E){

                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try{
                    int n1 = Integer.parseInt(one.getText().toString());
                    int n2 = Integer.parseInt(two.getText().toString());
                    int sum = n1-n2;
                    showres.setText(" "+sum);
                }
                catch(Exception E){

                }
            }
        });
       multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try{
                    int n1 = Integer.parseInt(one.getText().toString());
                    int n2 = Integer.parseInt(two.getText().toString());
                    int sum = n1*n2;
                    showres.setText(" "+sum);
                }
                catch(Exception E){

                }
            }
        });

       divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try{
                    int n1 = Integer.parseInt(one.getText().toString());
                    int n2 = Integer.parseInt(two.getText().toString());
                    int sum = n1/n2;
                    showres.setText(" "+sum);
                }
                catch(Exception E){

                }
            }
        });

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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
