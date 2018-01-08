package com.example.dora.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //tipe data

    String namaFirst = "Rizki";
    String namaLast = "syaputra";

    //deklarasi widget

    TextView txtWelcome;

    EdiText etNama, etSekolah;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Full name : " + namaFirst + namaLast);

        //memanggil id dari textview
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etNama = (EditText)findViewById(R.id.etNama);
        etSekolah = (EditText)findViewById(R.id.etSekolah);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //menambahkan aksi ketika btnSubmit di klik
        btnSubmit.setOnClickListener(new OnClickListener){

            public void onClick(){
                //mengambil nilai dari etNama dan etSekolah
                String nNama = etNama.getText().toString();
                String nSekolah = etNama.getText().toString();

                //menampilkan hasil ke textview
                txtWelcome.setText("Hallo , " + nNama + nSekolah );
            }
        }

        //menampilkan hasil teks ke widget textview
//        txtWelcome.setText("Hy, " + namaFirst + namaLast);
    }
}
