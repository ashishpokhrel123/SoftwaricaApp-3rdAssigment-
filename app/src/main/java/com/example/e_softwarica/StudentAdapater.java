package com.example.e_softwarica;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_softwarica.MainActivity;
import com.example.e_softwarica.R;

import java.util.List;

class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    Context mContext;
    List<Student> studentsList;

    public StudentAdapter(Context mContext,List<Student> studentsList){
        this.mContext = mContext;
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student,parent,false);
        return new StudentViewHolder(view, mContext, studentsList);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.StudentViewHolder holder, final int i) {
        Student student = studentsList.get(i);
        holder.name.setText(student.getName());
        holder.age.setText(student.getAge()+"");
        holder.gender.setText(student.getGender());
        holder.address.setText(student.getAddress());
        holder.image.setImageResource(student.getImage());
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studentsList.remove(i);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        List<Student> list;
        TextView name, age, address,gender;
        ImageView image;
        Button btnDelete;

        public StudentViewHolder(@NonNull View itemView, final Context context, List<Student> studentList) {
            super(itemView);
            image = itemView.findViewById(R.id.ivImage);
            btnDelete = itemView.findViewById(R.id.bntDelete);
            name = itemView.findViewById(R.id.txtName);
            age = itemView.findViewById(R.id.txtAge);
            gender = itemView.findViewById(R.id.txtGender);
            address = itemView.findViewById(R.id.txtAddress);

            this.context = context;
            this.list= studentList;

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Student student = list.get(getAdapterPosition());
                    Toast.makeText(context, student.getName() , Toast.LENGTH_SHORT).show();
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                }
            });

        }
    }
}

