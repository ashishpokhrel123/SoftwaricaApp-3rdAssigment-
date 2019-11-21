package com.example.e_softwarica;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    public WebView webView;


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_about, container, false);
        webView = (WebView) v.findViewById(R.id.webview);
        webView.loadUrl("https://softwarica.edu.np/");
        webView.setWebViewClient(new WebViewClient());

        return v;
    }

}
