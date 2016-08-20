package io.donsaad.session3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText to;
    private EditText subject;
    private EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = (EditText) findViewById(R.id.et_to);
        subject = (EditText) findViewById(R.id.et_subject);
        content = (EditText) findViewById(R.id.et_content);

        Button send = (Button) findViewById(R.id.btn_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { to.getText().toString() });
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT, content.getText().toString());
                emailIntent.setType("message/rfc822");

                startActivity(Intent.createChooser(emailIntent, "Choose your favorite app: "));
            }
        });

    }

}
