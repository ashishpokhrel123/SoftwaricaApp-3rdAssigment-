package com.example.e_softwarica;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddStudentFragment extends Fragment {

    TextView txtname, txtage, txtaddress;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    Button btnSave;


    private String name;
    private int age;
    private String address;
    private String gender;
    private static List<Student> studentsList = new ArrayList<>();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_add_student, container, false);
        txtname = v.findViewById(R.id.name);
        txtaddress = v.findViewById(R.id.address);
        txtage = v.findViewById(R.id.age);


        btnSave = v.findViewById(R.id.save);



        btnSave.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View v) {



                if (txtname.getText().toString().trim().isEmpty() || txtage.getText().toString().trim().isEmpty() ||
                txtaddress.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getActivity(), "Empty field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    studentsList = MainActivity.students;
                    Student model = new Student(txtname.getText().toString(),
                            txtaddress.getText().toString(), "Male",
                            Integer.parseInt(txtage.getText().toString()), R.drawable.avatar);


                    studentsList.add(model);
                    Toast.makeText(getActivity(), "Student added:", Toast.LENGTH_LONG).show();
                }


            }
        });
        return v;
    }


}










































