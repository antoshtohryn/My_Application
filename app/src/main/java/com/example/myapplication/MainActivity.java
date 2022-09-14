package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view)
    {
        TextView my_text = (TextView)findViewById(R.id.my_text);
        my_text.setText("My first lab!");
    }

    public void changeColor(View view)
    {
        TextView my_text = (TextView)findViewById(R.id.my_text);
        if (my_text.getCurrentTextColor() == Color.parseColor("#C500FF")) {
            my_text.setTextColor(Color.parseColor("#661A52"));
        }
        else if (my_text.getCurrentTextColor() == Color.parseColor("#661A52")) {
            my_text.setTextColor(Color.parseColor("#C500FF"));
        }
    }
}