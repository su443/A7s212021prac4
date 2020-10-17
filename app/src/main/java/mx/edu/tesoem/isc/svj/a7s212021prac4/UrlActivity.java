package mx.edu.tesoem.isc.svj.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.miimagen);


        Picasso.get()
                .load("https://img2.freepng.es/20181129/cqq/kisspng-photographic-film-drawing-camera-illustration-imag-nouvelle-page-5c0004e6cea3a9.3054205015435051268464.jpg")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);

    }
}