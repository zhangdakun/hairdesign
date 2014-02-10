// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            FatherActivity, Common, Commontwo

public class FirstImageActivity extends FatherActivity
{

    public FirstImageActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030002);
        if(Common.friendlist != null)
            Common.friendlist.clear();
        readseconddate((new StringBuilder("one")).append(String.valueOf(1 + Integer.valueOf(Commontwo.icon).intValue())).append(".bin").toString());
        listview = (ListView)findViewById(0x7f060005);
        listview.setCacheColorHint(0);
        listview.setAdapter(getListfirstimage(Common.friendlist, Common.alliamge[Integer.valueOf(Commontwo.icon).intValue()]));
        super.Init(Commontwo.title[Integer.valueOf(Commontwo.icon).intValue()]);
    }

    private ListView listview;
}
