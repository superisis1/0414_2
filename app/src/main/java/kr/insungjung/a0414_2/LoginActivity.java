package kr.insungjung.a0414_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

/*
ID: tjeit, PW: qwer1234 입력된 상태로
    로그인버튼 누르면 베인 액티비티로 이동
    이이디 비번 위의 값이 아니라면, 토스트로 '로그인에 실패하셨습니다. ID/PW
    */

    EditText userIdText;
    EditText userPasswordText;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIdText = findViewById(R.id.idText);
        userPasswordText = findViewById(R.id.passText);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userId = userIdText.getText().toString();
                String userPw = userPasswordText.getText().toString();

//                맞으면 메인화면으로 이동
//                아니면 토스트 메세지

                if (userId.equals("tjeit") && userPw.equals("qwer1234")) {
//                  메인 액티비티로 이동

                } else {
//                    조건에 맞지 않다면
                    Toast.makeText(LoginActivity.this, "로그인에 실패했습니다.\n ID/PW 를 확인해주세요!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
