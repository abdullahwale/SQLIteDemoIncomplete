package com.example.hp.sqlitedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText myInput;

    TextView myText;

    MyDBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput = (EditText) findViewById(R.id.edtProduct);

        myText = (TextView) findViewById(R.id.textView);

        dbHandler =new MyDBHandler(this,null,null,1);

        printDatabase();


    }

    private void printDatabase() {
        String dbSting= dbHandler.databasetostring();

        myText.setText(dbSting);

        myInput.setText("");
    }

    public void addButtonClick(View view)

    {

        Products products = new Products(myInput.getText().toString());

        dbHandler.addProduct(products);

        printDatabase();

    }
    public void deleteButtonClick(View view)

    {

        String inputText= myInput.getText().toString();

        dbHandler.deleteProduct(inputText);

        printDatabase();

    }






}
