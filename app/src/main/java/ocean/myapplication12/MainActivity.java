package ocean.myapplication12;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ocean.myapplication12.R;

public class MainActivity extends AppCompatActivity {
    public EditText Num;
    public Button go;
    public TextView TT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num=(EditText)findViewById(R.id.Text1);
        go=(Button)findViewById(R.id.btn1);
        final TextView TT= (TextView)findViewById(R.id.txt2);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=1; i<=10; i++){
                    String s = Num.getText().toString();
                    int c=Integer.parseInt(s);
                    TT.setText(TT.getText().toString()+"\n"+c+"  *  "+i+"  =  "+(c*i));

                }

            }
        });
    }


}