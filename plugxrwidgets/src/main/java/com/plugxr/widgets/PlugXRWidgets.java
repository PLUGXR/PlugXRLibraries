package com.plugxr.widgets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class PlugXRWidgets {

    public void CallUrl(Context context,String Url){

        Intent callurl = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse(Url));
        context.startActivity(callurl);

    }

}
