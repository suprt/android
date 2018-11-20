package myitschool.com.first;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class first extends AppCompatActivity {
    Button button1;
    TextView myText;
    EditText EdTxt1;
    ImageButton ImgButton;
    Tree tree= new Tree("тополь", 400 , "черешковый ",10,false);
    Plant plant=new Plant("папоротник",90);
    RadioButton Tree,Flower,Plant;

    Flower flower=new Flower("ромашка ",30,15,true,"summer ");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
         button1 =  (Button) findViewById(R.id.button1);
         myText=(TextView)findViewById(R.id.text1);
         EdTxt1=(EditText) findViewById(R.id.EditText);
         Tree=(RadioButton)findViewById(R.id.Tree);
        Flower=(RadioButton)findViewById(R.id.Flower );
        Plant=(RadioButton)findViewById(R.id.Plant);
         button1.setBackgroundColor(Color.GREEN);
         ImgButton=findViewById(R.id.imButton1);
         View.OnClickListener radioListener=new View.OnClickListener() {
             @Override

             public void onClick(View v)
           {  String s="";
                 switch (v.getId()){
                     case R.id.Tree:s=tree.printPlant();break;
                     case R.id.Flower:s=flower.printPlant();break;
                     case R.id.Plant:s=plant.printPlant();break;
                 }
               myText.setText(s);
             }

         };

         Flower.setOnClickListener(radioListener);
         Tree.setOnClickListener(radioListener);
         Plant.setOnClickListener(radioListener);
         ImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int f =1;
                 for(int d=1;d<=Integer.parseInt(EdTxt1.getText().toString());d++)
                     f*=d;
                 myText.setText(""+f);
             }
         });
        View.OnClickListener Listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String s;



            }
        };

        button1.setOnClickListener(Listener);

    }
    public void changeBck(View v){
        ImgButton.setBackgroundColor(Color.MAGENTA);
    }

}
