package a20181110.bai7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {
   Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt);
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        final Animation ani = AnimationUtils.loadAnimation(this,R.anim.animation_translate);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(ani);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(MainActivity.this,trang2.class );

               // intt.putExtra("ten","chuoi mac dinh");
                startActivity(intt);
               overridePendingTransition(R.anim.vao,R.anim.ra);
            }
        });
    }
}
