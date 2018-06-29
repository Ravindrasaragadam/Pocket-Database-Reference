package com.example.ravi.projectl;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class TextFragment extends android.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_text, container, false);
        TextView mTextSample = (TextView) view.findViewById(R.id.textSample);
        String text = "-->sqlzoo.net/wiki/SQL_Tutorial";
        mTextSample.setText(text);
//pattern we want to match and turn into a clickable link
        Pattern pattern = Pattern.compile("sqlzoo.net/wiki/SQL_Tutorial");
        Linkify.addLinks(mTextSample, pattern, "http://");
        TextView Reference2 = (TextView) view.findViewById(R.id.refertext2);
        String text2 = "-->www.tutorialspoint.com/sql";
        Reference2.setText(text2);
//pattern we want to match and turn into a clickable link
        Pattern pattern2 = Pattern.compile("www.tutorialspoint.com/sql");
        Linkify.addLinks(Reference2, pattern2, "http://");
        TextView Reference3 = (TextView) view.findViewById(R.id.textView35);
//pattern we want to match and turn into a clickable link
        Pattern pattern3 = Pattern.compile("en.wikipedia.org/wiki/Comparison_of_relational_database_management_systems");
        Linkify.addLinks(Reference3, pattern3, "http://");
        TextView Reference4 = (TextView) view.findViewById(R.id.textView34);
//pattern we want to match and turn into a clickable link
        Pattern pattern4 = Pattern.compile("troels.arvin.dk/db/rdbms/");
        Linkify.addLinks(Reference4, pattern4, "http://");
        TextView Reference5 = (TextView) view.findViewById(R.id.textView36);
//pattern we want to match and turn into a clickable link
        Pattern pattern5 = Pattern.compile("www.w3schools.com/sql/default.asp");
        Linkify.addLinks(Reference5, pattern5, "http://");
        TextView Reference6 = (TextView) view.findViewById(R.id.textView37);
//pattern we want to match and turn into a clickable link
        Pattern pattern6 = Pattern.compile("www.khanacademy.org/computing/computer-programming/sql");
        Linkify.addLinks(Reference6, pattern6, "http://");
        return view;
    }
}
