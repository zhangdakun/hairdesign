// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.*;
import android.os.Bundle;
import android.os.Process;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ListView;
//import com.jiqiren.jincaiwuxian.AppConnect;
import java.util.ArrayList;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            FatherActivity, Common, Commontwo, DaoTuiActivity, 
//            TwoImageActivity

public class TwoActivity extends FatherActivity
{

    public TwoActivity()
    {
        dialog = null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030001);
        share = getSharedPreferences("girlzatoufa", 0);
        if(Common.friendlist != null)
            Common.friendlist.clear();
        readseconddate("twohead.bin");
        listview = (ListView)findViewById(0x7f060005);
        listview.setCacheColorHint(0);
        listview.setAdapter(getListMainAdapter(Common.friendlist));
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                Commontwo.icon = String.valueOf(i);
                Intent intent = new Intent(TwoActivity.this, TwoImageActivity.class);
                startActivity(intent);
            }

//            final TwoActivity this$0;
//
//            
//            {
//                this$0 = TwoActivity.this;
//                super();
//            }
        }
);
//        if(Integer.parseInt(share.getString("mydata", "0")) >= 1)
//            AppConnect.getInstance(this).showPopAd(this);
    }

    protected Dialog onCreateDialog(int i)
    {
//        i;
//        JVM INSTR tableswitch 1 1: default 20
//    //                   1 22;
//           goto _L1 _L2
//_L1:
//        return null;
//_L2:
//        (new android.app.AlertDialog.Builder(this)).setTitle("\u9000\u51FA\u8F6F\u4EF6\uFF1F").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialoginterface, int j)
//            {
//                finish();
//            }
//
//            final TwoActivity this$0;
//
//            
//            {
//                this$0 = TwoActivity.this;
//                super();
//            }
//        }
//).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialoginterface, int j)
//            {
//            }
//
//            final TwoActivity this$0;
//
//            
//            {
//                this$0 = TwoActivity.this;
//                super();
//            }
//        }
//).show();
//        if(true) goto _L1; else goto _L3
//_L3:
    	
    	return null;
    }

//    public boolean onKeyDown(int i, KeyEvent keyevent)
//    {
//        boolean flag;
//        if(i == 4)
//        {
//            if(Commontwo.isok.equals("true") || Commontwo.idother < 0L)
//            {
//                Process.killProcess(Process.myPid());
//                finish();
//            } else
//            {
//                DaoTuiActivity.getInstance().show(this);
//            }
//            flag = true;
//        } else
//        {
//            flag = super.onKeyDown(i, keyevent);
//        }
//        return flag;
//    }

    private static final int DIALOG_EXIT = 1;
    private ProgressDialog dialog;
    private ListView listview;
    private SharedPreferences share;
}
