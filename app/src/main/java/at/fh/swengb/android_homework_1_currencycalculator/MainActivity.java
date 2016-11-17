package at.fh.swengb.android_homework_1_currencycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define global variables
    private EditText inputAmount;
    private TextView resultOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial global variables
        inputAmount = (EditText)findViewById(R.id.inputAmount);
        resultOutput = (TextView)findViewById(R.id.resultOutput);
    }

    public void euroToDollar(View view){
        //read amount as string from input and convert it to double
        String inputAmountString = inputAmount.getText().toString();
        double inputAmountDouble = 0;

        try {
            //convert the string to double
            inputAmountDouble = Double.parseDouble(inputAmountString);

            //calculate
            double result = inputAmountDouble * 1.071385;

            //send result to view
            resultOutput.setText(inputAmountString + " € are " + result + " $");
        }
        catch (NumberFormatException e){
            resultOutput.setText("WRONG INPUT!!11!!1");
            e.printStackTrace();
        }
    }

    public void dollarToEuro (View view){
        //read amount as string from input and convert it to double
        String inputAmountString = inputAmount.getText().toString();
        double inputAmountDouble = 0;

        try {
            //convert the string to double
            inputAmountDouble = Double.parseDouble(inputAmountString);

            //calculate
            double result = inputAmountDouble * 0.93337129;

            //send result to view
            resultOutput.setText(inputAmountString + " $ are " + result + " €");
        }
        catch (NumberFormatException e){
            resultOutput.setText("WRONG INPUT!!11!!1");
            e.printStackTrace();
        }
    }

    public void showAbout(View view){
        Intent intent = new Intent(this, ActivityDisplayAbout.class); //where does it come from | where should it go to
        String message = resultOutput.getText().toString();
        intent.putExtra("data", message);
        startActivity(intent);
    }
}
