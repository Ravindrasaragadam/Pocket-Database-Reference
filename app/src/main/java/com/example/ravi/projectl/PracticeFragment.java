package com.example.ravi.projectl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * create an instance of this fragment.
 */
public class PracticeFragment extends android.app.Fragment {

    private WebView wv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_practice, container, false);

        wv1=(WebView) view.findViewById(R.id.webview);

        if(isConnected()) {
            wv1.setWebViewClient(new MyBrowser());
            wv1.getSettings().setLoadsImagesAutomatically(true);
            wv1.getSettings().setJavaScriptEnabled(true);
            wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            wv1.loadUrl("https://mysqlreference.000webhostapp.com/practice.html");
            Toast.makeText(getActivity(),"connection successful",Toast.LENGTH_LONG).show();
        }

        else
        {
            Toast.makeText(getActivity(),"connect to internet to use this service",Toast.LENGTH_LONG).show();
        }

        return view;

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public boolean isConnected() {
        try {
            String command = "ping -c 1 google.com";
            return (Runtime.getRuntime().exec(command).waitFor() == 0);
        }
        catch(Exception e)
        {

        }
        return false;
    }


}
