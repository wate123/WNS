//package weathernotificationservice.wns;
//
//import android.os.AsyncTask;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * Created by Jun Lin on 4/19/2017.
// */
//
//public class Download extends AsyncTask<String,Void, String> {
//
//    @Override
//    protected String doInBackground(String... urls) {
//        String result = "";
//        URL url;
//        HttpURLConnection urlConnection = null;
//        try {
//            url = new URL(urls[0]);
//            urlConnection = (HttpURLConnection) url.openConnection();
//            InputStream in = urlConnection.getInputStream();
//            InputStreamReader reader = new InputStreamReader(in);
//            int data = reader.read();
//
//            while (data != -1){
//                char current = (char) data;
//                result += current;
//                data = reader.read();
//            }
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    protected void onPostExcute(String result){
//        super.onPostExecute(result);
//        try {
//            JSONObject jsonObj = new JSONObject(result);
//
//            JSONObject weatherData = new JSONObject(jsonObj.getString("main"));
//            double tempInt = Double.parseDouble(weatherData.getString("temp"));
//            //convert C to F
//            int tempIn = (int) (tempInt*1.8-459.67);
//            //get the name from json
//            String placeName = jsonObj.getString("name");
//            MainActivity.tempText.setText(String.valueOf(tempIn));
//            MainActivity.placeText.setText(placeName);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
