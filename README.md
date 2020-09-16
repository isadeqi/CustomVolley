CustomVolley
=====


How do I use CustomVolley?
-------------------
Or use Gradle:

```gradle
repositories {
   maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.isadeqi:CustomVolley:1.0'
}
```
Manifest
-------------------
```xml
 <application ....>
    .
    .
      <uses-library android:name="org.apache.http.legacy" android:required="false"/>
    .
    .
 </application>
```
   
How do I set query?
-------------------
```java
     VolleyHelper volleyHelper=new VolleyHelper(this);
     volleyHelper.setQuery("key","value");
```

How do I set token?
-------------------
```java
   UtilityHelper utilityHelper=new UtilityHelper(this);
   utilityHelper.setSharedPreferences("token"," Your token ");
```

How do I use GET?
-------------------
```java
VolleyHelper volleyHelper=new VolleyHelper(this);
        volleyHelper.get(getResources().getString(R.string.url), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("onResponse",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
               //Callable Error 
                return null;
            }
        });
```

How do I use GET by id?
-------------------
```java
VolleyHelper volleyHelper=new VolleyHelper(this);
        volleyHelper.get(getResources().getString(R.string.url),id, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("onResponse",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
               //Callable Error 
                return null;
            }
        });
```
How do I use POST?
-------------------
```java
      VolleyHelper volleyHelper=new VolleyHelper(this);
        ArrayList<ParamType> paramTypes=new ArrayList<>();
        paramTypes.add(new ParamType("key","value"));
        volleyHelper.post(getResources().getString(R.string.url),paramTypes, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("onResponse",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
               //Callable Error 
                return null;
            }
        });
```

How do I use PUT?
-------------------
```java
       VolleyHelper volleyHelper=new VolleyHelper(this);
        ArrayList<ParamType> paramTypes=new ArrayList<>();
        paramTypes.add(new ParamType("key","value"));
        volleyHelper.put(getResources().getString(R.string.url),id,paramTypes, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("onResponse",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
               //Callable Error 
                return null;
            }
        });
```
How do I use DELETE?
-------------------
```java
        VolleyHelper volleyHelper=new VolleyHelper(this);
        volleyHelper.delete(getResources().getString(R.string.url),id, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("onResponse",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
               //Callable Error 
                return null;
            }
        });
```
