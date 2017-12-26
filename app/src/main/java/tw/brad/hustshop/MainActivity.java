package tw.brad.hustshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goAccount(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/my-account/edit-account/");
        startActivity(intent);

    }
    public void goOrder(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/my-account/orders/");
        startActivity(intent);
    }
    public void goProduct(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/shop/");
        startActivity(intent);
    }
    public void goVendor(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/view-vendor/");
        startActivity(intent);
    }
    public void goNews(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/");
        startActivity(intent);
    }
    public void goAboutUs(View view) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url", "/about-us/");
        startActivity(intent);
    }
}
