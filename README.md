CustomVolley
=====
Or use Gradle:

```gradle
repositories {
   maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.isadeqi:CustomVolley:1.0'
}
```

How do I use CustomVolley?
-------------------

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

Get
-------------------
```xml
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

Get Id
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
Post
-------------------
```java
      VolleyHelper volleyHelper=new VolleyHelper(this);
        ArrayList<ParamType> paramTypes=new ArrayList<>();
        paramTypes.add(new ParamType("key","value"));
        volleyHelper.post(getResources().getString(R.string.url),paramTypes, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Log.e("ssss",s);
            }
        }, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                return null;
            }
        });
```
