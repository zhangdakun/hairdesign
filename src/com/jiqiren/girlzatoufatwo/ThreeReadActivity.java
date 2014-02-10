// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.os.Bundle;
import android.widget.TextView;
//import com.jiqiren.jincaiwuxian.AppConnect;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            FatherActivity, Commontwo, Common

public class ThreeReadActivity extends FatherActivity
{

    public ThreeReadActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030009);
        readseconddatetwo((new StringBuilder("three")).append(String.valueOf(1 + Integer.valueOf(Commontwo.icon).intValue())).append(".bin").toString());
        textview = (TextView)findViewById(0x7f06000b);
        textview.setText(Common.friendlisttwo);
//        if(Commontwo.isok.equals("false") && Commontwo.idother >= 0L)
//            AppConnect.getInstance(this).showPopAd(this);
    }

    private TextView textview;
}
