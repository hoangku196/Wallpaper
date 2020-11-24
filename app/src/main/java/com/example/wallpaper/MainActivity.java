package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String FLICKZ_LINK = "";
    private List<Photo> photoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidNetworking.initialize(getApplicationContext());
    }

    public class BackgroundLoadUrlFlickzTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }
    }

    private void fastAndroidNetworkingJsonArrayRequest(String link) {
        LinkParameter mLinkParameter = new LinkParameter();
        mLinkParameter.setApi_key("0375ce0a9316a6865766bc1068fcc213");
        mLinkParameter.setFormat("json");
        mLinkParameter.setExtras("description%2C+license%2C+date_upload%2C+date_taken%2C+owner_name%2C+icon_server%2C+original_format%2C+last_update%2C+geo%2C+tags%2C+machine_tags%2C+o_dims%2C+views%2C+media%2C+path_alias%2C+url_sq%2C+url_t%2C+url_s%2C+url_q%2C+url_m%2C+url_n%2C+url_z%2C+url_c%2C+url_l%2C+url_o");
        mLinkParameter.setMethod("flickr.photos.search");
        mLinkParameter.setNoJsonCallBack(1);
        mLinkParameter.setTags("cats");
        AndroidNetworking.post(link)
                .setPriority(Priority.HIGH)
                .addBodyParameter(mLinkParameter)
                .setTag("test")
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject jsonRootObject = response;
                        try {
                            JSONObject jsonPhotoObject = jsonRootObject.getJSONObject("photos");
                            JSONArray jsonPhotosArray = jsonPhotoObject.getJSONArray("photo");
                            readJson(jsonPhotosArray);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }

    private void readJson(JSONArray jsonArray) throws JSONException {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject photoObject = jsonArray.getJSONObject(i);
            Photo photo = new Photo(photoObject.getInt("id"), photoObject.getString("owner"), photoObject.getString("title"), photoObject.getString("url_t"));
            photoList.add(photo);
        }
        Log.e("size", photoList.size() + "");
    }
}