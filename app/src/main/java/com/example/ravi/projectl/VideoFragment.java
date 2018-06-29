package com.example.ravi.projectl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;


public class VideoFragment extends android.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_video, container, false);

        Button btn=(Button) view.findViewById(R.id.button);
        Button btn2=(Button) view.findViewById(R.id.button2);
        Button btn3=(Button) view.findViewById(R.id.button3);
        Button btn4=(Button) view.findViewById(R.id.button4);
        Button btn5=(Button) view.findViewById(R.id.button5);
        Button btn6=(Button) view.findViewById(R.id.button6);
        Button btn7=(Button) view.findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=EUzsy3W4I0g")));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/playlist?list=PLfP-D1tg0DI0D1MSTRXFr1X6bb_ZI0E7W")));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=IwswNIZ_PSg&t=9s")));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/zFRs9mQVTgQ?list=PLyGqUe6Oa_5Hcb_5QqXIsMZhvsm7Bo_-Z")));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=9Ck-Xbyn-RU&list=PLBCa5wkW-_HSStB8JKBDBJvLl1XYR7kCg")));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=LSB4eceRsw8")));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=kHrXCeB6jy0")));
            }
        });

        TextView mTextSample = (TextView) view.findViewById(R.id.moreoptions);
//pattern we want to match and turn into a clickable link
        Pattern pattern = Pattern.compile("www.studytonight.com/dbms/");
        Linkify.addLinks(mTextSample, pattern, "http://");

        return view;


    }


}
