package a20181110.bai7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trang2 extends Activity {
Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutgtrang2);
        bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt2 = new Intent(trang2.this,MainActivity.class );
            //    intt2.putExtra("ten","chuoi mac dinh");
                startActivity(intt2);
            }
        });
    }
}
