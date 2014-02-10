// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.os.Bundle;
import android.widget.ListView;
//import com.jiqiren.jincaiwuxian.AppConnect;
import java.util.ArrayList;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            FatherActivity, Commontwo, Common

public class TwoImageActivity extends FatherActivity
{

    public TwoImageActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030002);
        if(Commontwo.listtwo != null)
            Commontwo.listtwo.clear();
        readsdate((new StringBuilder("two")).append(String.valueOf(1 + Integer.valueOf(Commontwo.icon).intValue())).append(".bin").toString());
        listview = (ListView)findViewById(0x7f060005);
        listview.setCacheColorHint(0);
//        if(Commontwo.isok.equals("false") && Commontwo.idother >= 0L)
//            AppConnect.getInstance(this).showPopAd(this);
        listview.setAdapter(getListfirstimage(Commontwo.listtwo, Commontwo.alltwoiamge[Integer.valueOf(Commontwo.icon).intValue()]));
        super.Init((String)Common.friendlist.get(Integer.valueOf(Commontwo.icon).intValue()));
    }

    private ListView listview;
}
