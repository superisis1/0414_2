package kr.insungjung.a0414_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText searchText;
    Button searchBtn;
    TextView welcomeMsgTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchText = findViewById(R.id.searchText);
        searchBtn = findViewById(R.id.searchBtn);
        welcomeMsgTxt = findViewById(R.id.welcomeMsgTxt);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String searchTxt = searchText.getText().toString();

                String searchContent= String.format("%s를 검색합니다.",searchTxt);

                Toast.makeText(MainActivity.this, searchContent, Toast.LENGTH_SHORT).show();

            }
        });

        String loginUserId = getIntent().getStringExtra("사용자아이디");
        Log.d("로그인사용자",loginUserId);

        String welcomeMessage = String.format("%s님 환영합니다!",loginUserId);
        welcomeMsgTxt.setText(welcomeMessage);

    }
}
