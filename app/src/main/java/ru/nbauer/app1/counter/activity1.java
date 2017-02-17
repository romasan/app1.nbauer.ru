package ru.nbauer.app1.counter;

//import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
//import android.content.res.Resources;
import java.util.Objects;

//import com.google.android.gms.appindexing.Action;
//import com.google.android.gms.appindexing.AppIndex;
//import com.google.android.gms.appindexing.Thing;
//import com.google.android.gms.common.api.GoogleApiClient;

// README
// https://habrahabr.ru/post/114580/
// https://goo.gl/JjYzCg
// https://github.com/romasan/old-java-projects/blob/master/twitsearcher/src2/citadel.java

public class activity1 extends AppCompatActivity {

    private TextView text;
    private String code;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        text = (TextView) findViewById(R.id.codeText);
        code = "";

        int[] buttons = {
                R.id.button0,
                R.id.button1,
                R.id.button2,
                R.id.button3,
                R.id.button4,
                R.id.button5,
                R.id.button6,
                R.id.button7,
                R.id.button8,
                R.id.button9,
                R.id.button_clear,
                R.id.button_done
        };
        for (int i = 0; i < buttons.length; i += 1) {
            Button buttonNum = (Button) findViewById(buttons[i]);
            buttonNum.setOnClickListener(doSomething);
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private OnClickListener doSomething = new OnClickListener() {
        @Override
        public void onClick(View v) {
            String tag = v.getTag().toString();
            if(Objects.equals(tag, "clear")) {
                int length = code.length();
                if(length > 0) {
                    code = code.substring(0, length - 1);
                }
            } else if(Objects.equals(tag, "done")) {
                code = "D O N E";
            } else {
                code += tag;
            }
            text.setText(code);
        }
    };

//        int id = v.getId();                       // get integer id of view
//        String idString = "no id";
//        if (id != View.NO_ID) {                    // make sure id is valid
//            Resources res = v.getResources();     // get resources
//            if (res != null)
//                idString = res.getResourceEntryName(id); // get id string entry
//        }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
//    public Action getIndexApiAction() {
//        Thing object = new Thing.Builder()
//                .setName("activity1 Page") // TODO: Define a title for the content shown.
//                // TODO: Make sure this auto-generated URL is correct.
//                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
//                .build();
//        return new Action.Builder(Action.TYPE_VIEW)
//                .setObject(object)
//                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
//                .build();
//    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        client.connect();
//        AppIndex.AppIndexApi.start(client, getIndexApiAction());
//    }

//    @Override
//    public void onStop() {
//        super.onStop();
//
//        // ATTENTION: This was auto-generated to implement the App Indexing API.
//        // See https://g.co/AppIndexing/AndroidStudio for more information.
//        AppIndex.AppIndexApi.end(client, getIndexApiAction());
//        client.disconnect();
//    }
}

//    android:onClick="but1_click"
//    public void btn1_click(View v){
//        text.setText("M3SS4G3!" + v);
//    }