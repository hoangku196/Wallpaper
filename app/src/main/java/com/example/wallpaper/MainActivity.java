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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String FLICKZ_LINK = "https://www.flickr.com/services/rest/";
    private List<Photo> photoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidNetworking.initialize(getApplicationContext());
        new BackgroundLoadUrlFlickzTask().execute(FLICKZ_LINK);
    }

    public class BackgroundLoadUrlFlickzTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.e("pre", "pre");
        }

        @Override
        protected String doInBackground(String... strings) {
            fastAndroidNetworkingJsonArrayRequest(strings[0]);
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.e("post", "post");
        }
    }

    private void fastAndroidNetworkingJsonArrayRequest(String link) {
        LinkParameter mLinkParameter = new LinkParameter();
        mLinkParameter.setApi_key("0375ce0a9316a6865766bc1068fcc213");
        mLinkParameter.setFormat("json");
        mLinkParameter.setExtras("description,license,url_t");
        mLinkParameter.setMethod("flickr.photos.search");
        mLinkParameter.setNoJsonCallBack(1);
        mLinkParameter.setTags("cats");
        
        AndroidNetworking.post(link)
                .setPriority(Priority.HIGH)
                .addBodyParameter(mLinkParameter)
//                .addBodyParameter("api_key", "0375ce0a9316a6865766bc1068fcc213")
//                .addBodyParameter("format", "json")
//                .addBodyParameter("extras", "description,license,url_t")
//                .addBodyParameter("method", "flickr.photos.search")
//                .addBodyParameter("nojsoncallback", "1")
//                .addBodyParameter("tags", "cats")
                .setTag("test")
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject jsonRootObject = response;
                        try {
                            JSONObject jsonPhotoObject = jsonRootObject.getJSONObject("photos");
                            JSONArray jsonPhotosArray = jsonPhotoObject.getJSONArray("photo");
                            Log.e("resposne", response.toString());
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
            Log.e("photo", photo.getTitle());
            photoList.add(photo);
        }
        Log.e("size", photoList.size() + "");
    }
}