package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class LabTestActivity extends AppCompatActivity {

    private String[][] packages= {
            {"Gói 1 : Bài kiểm tra tổng quát", "Nhiều người mua", "", "", "900"},
            {"Gói 2 : Bài kiểm tra dinh dưỡng", "", "", "", "299"},
            {"Gói 3 : Bài kiểm tra tình trạng tâm thần", "Nhiều người mua", "Đang giảm giá", "", "899"},
            {"Gói 4 : Bài kiểm tra vận động", "", "", "", "499"},
            {"Gói 5 : Bài kiểm tra giấc ngủ", "", "", "", "699"},
    };

    private String[] package_details={
            "Khám thể lực\n"+
                    "Khám lâm sàng tổng quát\n"+
                    "Hba1c\n" +
                    "Xét nghiệm máu, nước tiểu\n" +
                    "Chẩn đoán hình ảnh\n" +
                    "Thăm dò chức năng\n"+"Kiểm tra tình trạng tâm thần\n"+"Đánh giá dinh dưỡng\n",

            "Đánh giá thói quen ăn uống\n"+"Đánh giá cân nặng và chiều cao\n"
            +"Phân tích khẩu phần ăn\n"+"Đánh giá sở thích ẩm thực\n" +
            "Đánh giá chất lượng thực phẩm\n" +
            "Xác định các rủi ro dinh dưỡng\n"

            ,
            "Đánh giá về mức độ căng thẳng và lo lắng\n"+"Đánh giá về mức độ trầm cảm\n"+"Đánh giá về tâm trạng trong quá khứ\n"
            +"Kiểm tra về giấc ngủ\n"+"Đánh giá về sự tự tử\n"+"Hỏi về vấn đề tâm thần trong gia đình\n"+"Kiểm tra về sự tập trung và tư duy\n"
            +"Kiểm tra về mối quan hệ xã hội\n"+"Đánh giá về thói quen và hành vi có hại\n",


            "Đánh giá mức độ hoạt động hàng ngày\n"+"Sử dụng bảng đánh giá hoạt động\n"+"Đo lường mức độ hoạt động\n"
            +"Kiểm tra khả năng vận động\n"+"Đánh giá linh hoạt và sức mạnh\n"+"Đánh giá sự linh hoạt và thể chất\n"+"Đánh giá sức bền\n"
            +"Đánh giá sự thoải mái và tự tin\n"+"Kiểm tra sự phục hồi\n",


            "Nhật ký giấc ngủ\n"+
                    "Đo lường thời lượng giấc ngủ\n"+
                    "Đánh giá chất lượng giấc ngủ\n"+
                    "Đánh giá yếu tố gây ra mất ngủ\n"+
                    "Kiểm tra hành vi ngủ\n"+
                    "Đánh giá yếu tố môi trường ngủ\n"+
                    "Sử dụng thiết bị giám sát giấc ngủ"
    };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    Button btnGoTOCart,btnBack;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        btnGoTOCart=findViewById(R.id.buttonBMGoToCart);
        btnBack=findViewById(R.id.buttonBMBack);
        listView=findViewById(R.id.listViewBM);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LabTestActivity.this,HomeActivity.class));
            }
        });

        list=new ArrayList();
        for(int i=0;i<packages.length;i++){
            item=new HashMap<String,String>();
            item.put("line1",packages[i][0]);
            item.put("line2",packages[i][1]);
            item.put("line3",packages[i][2]);
            item.put("line4",packages[i][3]);
            item.put("line5","Giá gói: "+packages[i][4]);
            list.add(item);
        }

        sa=new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        listView.setAdapter(sa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it=new Intent(LabTestActivity.this,LabTestDetailsActivity.class);
                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][4]);
                startActivity(it);
            }
        });
//
//        btnGoTOCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(LabTestActivity.this,CardLabActivity.class));
//            }
//        });
    }
}