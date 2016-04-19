package com.example.danny.trelaapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class SettingsActivity extends AppCompatActivity {

    ImageView profilePicture;
    static final int CAM_REQUEST = 1;
    Bitmap bitMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profilePicture = (ImageView) findViewById(R.id.profilePicture);


        Picture();


        ListView listview = (ListView) findViewById(R.id.settingsList);
        final String[] settings = getResources().getStringArray(R.array.settingsmenu);
        listview.setAdapter(
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_list_item_1,
                        settings
                )
        );

        ImageButton btnOverview = (ImageButton) findViewById(R.id.btnOverview);
        btnOverview.setOnClickListener(new MenuBar());

        ImageButton btnArtists = (ImageButton) findViewById(R.id.btnArtists);
        btnArtists.setOnClickListener(new MenuBar());

        ImageButton btnConcerts = (ImageButton) findViewById(R.id.btnConcerts);
        btnConcerts.setOnClickListener(new MenuBar());

        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);
        btnSettings.setBackgroundResource(R.color.colorWhite);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        File file = getFile();
                        //camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                        startActivityForResult(camera_intent, CAM_REQUEST);


                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), EditDistanceActivity.class));
                }


            }
        });

    }

    private File getFile()
    {
        File folder = new File("sdcard/camera_app");
        if(!folder.exists())
        {
            folder.mkdir();
        }
        File image_file = new File(folder, "cam_image.jpg");
        return image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAM_REQUEST && resultCode== RESULT_OK && data != null){
            // get bundle
            Bundle extras = data.getExtras();

            // get bitmap
            bitMap = (Bitmap) extras.get("data");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitMap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] b = baos.toByteArray();

            String encodedImage = Base64.encodeToString(b, Base64.DEFAULT);

            SharedPreferences shre = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor edit=shre.edit();
            edit.putString("profile_picture",encodedImage);
            edit.commit();
        }
        Picture();
    }

    public void Picture()
    {
        SharedPreferences shre = PreferenceManager.getDefaultSharedPreferences(this);
        String previouslyEncodedImage = shre.getString("profile_picture", "");

        if( !previouslyEncodedImage.equalsIgnoreCase("") ){
            byte[] b = Base64.decode(previouslyEncodedImage, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
            profilePicture.setImageBitmap(bitmap);
        }
    }
}
