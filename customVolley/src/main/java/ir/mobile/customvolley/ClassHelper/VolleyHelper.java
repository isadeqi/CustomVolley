package ir.mobile.customvolley.ClassHelper;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import ir.mobile.customvolley.ClassType.ParamType;

public class VolleyHelper {
    String query="";
    Context context;
    UtilityHelper utilityHelper;
    String TAG="VolleyError";
    public VolleyHelper(Context context){
        this.context=context;
        utilityHelper=new UtilityHelper(context);
    }
    public  void get(String url, Response.Listener<String> response, final Callable<Void> errorCallable){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url+query,response, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG+" Get : ",error.getMessage());
                try {
                    errorCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Accept", "application/json");
                params.put("Authorization","Bearer "+utilityHelper.getSharedPreferences("token"));
                return params;
            }
        };


        requestQueue.add(stringRequest);
        clearQuery();
    }
    public  void get(String url,String id, Response.Listener<String> response, final Callable<Void> errorCallable){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url+id+query,response, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG+" Get : ",error.getMessage());
                try {
                    errorCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Accept", "application/json");
                params.put("Authorization","Bearer "+utilityHelper.getSharedPreferences("token"));
                return params;
            }
        };


        requestQueue.add(stringRequest);
        clearQuery();
    }
    public  void post(String url, final ArrayList<ParamType> paramTypes, Response.Listener<String> response, final Callable<Void> errorCallable){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,response, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG+" Post : ",error.getMessage());
                try {
                    errorCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Accept", "application/json");
                params.put("Authorization","Bearer "+utilityHelper.getSharedPreferences("token"));
                return params;
            }

            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                for(int i=0;i<paramTypes.size();i++){
                    params.put(paramTypes.get(i).getKry(),paramTypes.get(i).getValue());
                }
                return params;
            }
        };
        requestQueue.add(stringRequest);
    }
    public  void put(String url, String id, final ArrayList<ParamType> paramTypes, Response.Listener<String> response, final Callable<Void> errorCallable){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.PUT, url+id,response, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG+" Put : ",error.getMessage());
                try {
                    errorCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Accept", "application/json");
                params.put("Authorization","Bearer "+utilityHelper.getSharedPreferences("token"));
                return params;
            }

            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                for(int i=0;i<paramTypes.size();i++){
                    params.put(paramTypes.get(i).getKry(),paramTypes.get(i).getValue());
                }
                return params;
            }
        };
        requestQueue.add(stringRequest);
    }
    public  void delete(String url, String id, Response.Listener<String> response, final Callable<Void> errorCallable){
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url+id,response, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG+" Delete : ",error.getMessage());
                try {
                    errorCallable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Accept", "application/json");
                params.put("Authorization","Bearer "+utilityHelper.getSharedPreferences("token"));
                return params;
            }
        };


        requestQueue.add(stringRequest);
    }
    public  void setQuery(String parameter,String value){
        if(query.equalsIgnoreCase("")){
            query="?"+parameter+"="+value;
        }else {
            query="&"+parameter+"="+value;
        }
    }
    private void clearQuery(){
        query="";
    }
}
