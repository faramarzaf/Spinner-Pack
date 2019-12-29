# Spinner-Pack  

<p align="center">
  <img src="https://miro.medium.com/max/500/1*-GxIEBqc7cLgr3sDpRkzVA.png"
   height=300 height=100/> 
</p>

In android, we can create Spinner in XML layout file using `<Spinner>` element with different attributes like as shown below.  

```xml 
<Spinner android:id="@+id/spinner1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
```

To populate spinner with list of values, we need to specify spinner adapter, such as an ArrayAdapter in activity file like as shown below.  

```java 
String[] users = { "Mercedes-Benz A-Class", "Mercedes-Benz AMG C 43", "Mercedes-Benz AMG C 63", "Mercedes-Benz AMG CLA 45", "Mercedes-Benz AMG CLS 53" };
Spinner spin = (Spinner) findViewById(R.id.spinner1);
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spin.setAdapter(adapter);
```
