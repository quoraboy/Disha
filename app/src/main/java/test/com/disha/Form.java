package test.com.disha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static test.com.disha.SignIn.mPhone;

public class Form extends AppCompatActivity {

    EditText  edtName, edtCollegeName, edtBranch;
    Button btnSubmit;
    DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

       // mDatabase = FirebaseDatabase.getInstance().getReference().child("students");

        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mName = edtName.getText().toString(),
                        mCollegeName=edtCollegeName.getText().toString(),
                        mBranch = edtBranch.getText().toString();

                if(TextUtils.isEmpty(mName.trim()))
                {
                    edtName.setError("Name can't be empty");
                }
                else if(TextUtils.isEmpty(mBranch.trim()))
                {
                    edtBranch.setError("Branch can't be empty");
                }
                else if(TextUtils.isEmpty(mCollegeName.trim()))
                {
                    edtCollegeName.setError("College name can't be empty");
                }
                else
                {  // mDatabase= mDatabase.child(mPhone)
                   // mDatabase.child("name").setValue(mName);
                    //mDatabase.child("branch").setValue(mBranch);
                    //mDatabase.child("college").setValue(mCollegeName);


                    Intent intent = new Intent(Form.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
