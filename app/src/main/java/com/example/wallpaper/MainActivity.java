package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String FLICKZ_LINK = "https://www.flickr.com/services/rest/";
    private List<Photo> photoList = new ArrayList<>();

    private RecyclerView rv;
    private Button btnGet;
    private CustomRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidNetworking.initialize(getApplicationContext());

        init();
    }

    private void init() {
        {
            rv = findViewById(R.id.rv);
            LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            adapter = new CustomRecyclerView(this, photoList);
            rv.setLayoutManager(lm);
            rv.setAdapter(adapter);
        }

        {
            btnGet = findViewById(R.id.btnGet);
            btnGet.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGet:
                new BackgroundLoadUrlFlickzTask().execute(FLICKZ_LINK);
                break;
        }
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
//        LinkParameter mLinkParameter = new LinkParameter();
//        mLinkParameter.setApi_key("0375ce0a9316a6865766bc1068fcc213");
//        mLinkParameter.setFormat("json");
//        mLinkParameter.setExtras("description,license,url_t");
//        mLinkParameter.setMethod("flickr.photos.search");
//        mLinkParameter.setNoJsonCallBack(1);
//        mLinkParameter.setTags("dogs");

        AndroidNetworking.post(link)
                .setPriority(Priority.HIGH)
//                .addBodyParameter(mLinkParameter)
                .addBodyParameter("api_key", "0375ce0a9316a6865766bc1068fcc213")
                .addBodyParameter("format", "json")
                .addBodyParameter("extras", "description,license,url_t")
                .addBodyParameter("method", "flickr.photos.search")
                .addBodyParameter("nojsoncallback", "1")
                .addBodyParameter("tags", "dogs")
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
        adapter.notifyDataSetChanged();
    }


//    private void demoGson(){
//        Type listType = new TypeToken<List<MyJson>>(){}.getType();
//        List<MyJson> myJsons = new Gson().fromJson(s, listType);
//    }
}