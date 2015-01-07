package cqts.com.br.examplelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.init_activity);
    }

    public void makeLogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
