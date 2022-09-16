package com.example.manhinhtinh_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etChieuCao, etCanNang;
    RadioButton rbNam, rbNu;
    Button btnTinhBMI;
    TextView txtChiSo, txtNhanXet;
    double ChiSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChieuCao = findViewById(R.id.et_chieucao);
        etCanNang = findViewById(R.id.et_cannang);
        rbNam = findViewById(R.id.rb_nam);
        rbNu = findViewById(R.id.rb_nu);
        btnTinhBMI = findViewById(R.id.btn_tinh);
        txtChiSo = findViewById(R.id.txt_ketqua);
        txtNhanXet = findViewById(R.id.txt_nhanxet);

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double chieucao = Double.parseDouble(etChieuCao.getText().toString()) / 100;
                double cannang = Double.parseDouble(etCanNang.getText().toString());
                ChiSo = Math.round((cannang/Math.pow(chieucao,2))*10.0)/10.0;
                if (rbNam.isChecked()){
                    if(ChiSo < 18.5){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm sinh dưỡng");
                    }
                    else if(ChiSo >= 18.5 && ChiSo <= 24.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    else if(ChiSo == 25){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang bị thừa cân");
                    }
                    else if(ChiSo > 25 && ChiSo <= 29.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở giai đoạn tiền béo phì/béo phì cấp độ thấp");
                    }
                    else if(ChiSo >= 30 && ChiSo <= 34.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ I");
                    }
                    else if(ChiSo >= 35 && ChiSo <= 39.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ II");
                    }
                    else if(ChiSo == 40){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ III");
                    }
                }
                else if(rbNu.isChecked()){
                    if(ChiSo < 18.5){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn cần bổ sung thêm sinh dưỡng");
                    }
                    else if(ChiSo >= 18.5 && ChiSo <= 22.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn có chỉ số BMI bình thường");
                    }
                    else if(ChiSo == 23){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang bị thừa cân");
                    }
                    else if(ChiSo > 23 && ChiSo <= 24.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở giai đoạn tiền béo phì/béo phì cấp độ thấp");
                    }
                    else if(ChiSo >= 25 && ChiSo <= 29.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ I");
                    }
                    else if(ChiSo >= 30 && ChiSo <= 39.9){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ II");
                    }
                    else if(ChiSo == 40){
                        txtChiSo.setText(String.valueOf(ChiSo));
                        txtNhanXet.setText("Bạn đang ở béo phì độ III");
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Vui lòng chọn giới tính!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}