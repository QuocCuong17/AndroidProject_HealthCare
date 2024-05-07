package com.example.healthcareapp;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {

    private String[][] doctordetails1={
            {"Tên bác sỹ: Đặng Quốc Cường","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Văn Khang","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Hoàng Thị Loan","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"}
    };
    private String[][] doctordetails2={
            {"Tên bác sỹ: Đặng Quốc Cường","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Văn Khang","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Hoàng Thị Loan","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"}
    };
    private String[][] doctordetails3={
            {"Tên bác sỹ: Đặng Quốc Cường","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Văn Khang","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Hoàng Thị Loan","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"}
    };
    private String[][] doctordetails4={
            {"Tên bác sỹ: Đặng Quốc Cường","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Văn Khang","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Hoàng Thị Loan","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"}
    };
    private String[][] doctordetails5={
            {"Tên bác sỹ: Đặng Quốc Cường","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Văn Khang","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Nguyễn Thị Vân","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Đặng Tiểu Kiều","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"},
            {"Tên bác sỹ: Hoàng Thị Loan","Địa chỉ bệnh viện: Đông Hưng", "Kinh nghiệm: 9 năm", "Điện thoại: 0775319165", "900"}
    };
    private Button btn;
    private TextView tv;
    String[][] doctor_detail={};

    ArrayList list;
    HashMap<String,String> item;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        btn=findViewById(R.id.DDbutton);
        tv=findViewById(R.id.textViewHADTitle);

        Intent it=getIntent();
        String title=it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physician")==0)
            doctor_detail=doctordetails1;
        else if(title.compareTo("Dietician")==0)
            doctor_detail=doctordetails2;
        else if(title.compareTo("Dentist")==0)
            doctor_detail=doctordetails3;
        else if(title.compareTo("Surgeon")==0)
            doctor_detail=doctordetails4;
        else
            doctor_detail=doctordetails5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailActivity.this,FindDoctorActivity.class));
            }
        });

        list =new ArrayList();
        for (String[] strings : doctor_detail) {
            item = new HashMap<String, String>();
            item.put("line1", strings[0]);
            item.put("line2", strings[1]);
            item.put("line3", strings[2]);
            item.put("line4", strings[3]);
            item.put("line5", "Phí tư vấn: " + strings[4] + "/-");
            list.add(item);
        }
        sa=new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        ListView lst=findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it=new Intent(DoctorDetailActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_detail[i][0]);
                it.putExtra("text3",doctor_detail[i][1]);
                it.putExtra("text4",doctor_detail[i][3]);
                it.putExtra("text5",doctor_detail[i][4]);
                startActivity(it);
            }
        });

    }
}