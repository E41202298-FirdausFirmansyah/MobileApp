package com.dausdroid.myappwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    ListView listViewBulan;
    String[] semuabulan;

    Spinner spinner;

    private static final String[] Kota = new String[]{
        "Aceh", "Ambon", "Balikpapan", "Bandung", "Banjarmasin", "Batam", "Bekasi", "Bengkulu", "Blitar",
        "Bogor", "Cilegon", "Cimahi", "Cirebon", "Denpasar", "Depok", "Dumai", "Gorontalo", "Gunungsitoli",
        "Jakarta Barat", "Jakarta Pusat", "Jakarta Selatan", "Jakarta Timur", "Jakarta Utara", "Jambi",
        "Jayapura", "Kediri", "Kendari", "Kotamobagu", "Kupang", "Lampung", "Langsa", "Lhokseumawe",
        "Lubuklinggau", "Madiun", "Magelang", "Makassar", "Malang", "Manado", "Mataram", "Medan",
        "Mojokerto", "Padang", "Palangkaraya", "Palembang", "Palu", "Pangkalpinang", "Parepare",
        "Pasuruan", "Pekalongan", "Pekanbaru", "Pematangsiantar", "Pontianak", "Probolinggo", "Sabang",
        "Salatiga", "Samarinda", "Semarang", "Serang", "Solo", "Sukabumi", "Surabaya", "Surakarta",
        "Tangerang", "Tangerang Selatan", "Tanjungpinang", "Tasikmalaya", "Tebing Tinggi", "Tegal",
        "Ternate", "Yogyakarta"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewBulan = findViewById(R.id.lvBulan);
        semuabulan = new DateFormatSymbols().getMonths();
        ArrayAdapter<String> bulanAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,semuabulan);
        listViewBulan.setAdapter(bulanAdapter);
        listViewBulan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String bulan = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Nama bulan = "+bulan,Toast.LENGTH_SHORT).show();
            }
        });

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.bahasa, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String bahasa = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Memilih bahasa: "+bahasa, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Kota);
        editText.setAdapter(adapter1);
    }
}