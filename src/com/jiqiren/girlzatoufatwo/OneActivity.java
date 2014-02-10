// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.*;
import android.os.Bundle;
import android.os.Process;
import android.text.format.Time;
import android.view.*;
import android.widget.AdapterView;
import android.widget.ListView;
//import com.jiqiren.jincaiwuxian.AppConnect;
//import com.jiqiren.jincaiwuxian.UpdatePointsNotifier;
import java.util.Date;

import com.android.adlib.AD;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            FatherActivity, Commontwo, DaoTuiActivity, FirstImageActivity

public class OneActivity extends FatherActivity
  //  implements UpdatePointsNotifier
{

    public OneActivity()
    {
        dialog = null;
    }

    private void doshow()
    {
//        AppConnect.getInstance(this).showOffers(this);
    }

    public void getUpdatePoints(String s, int i)
    {
        if(i > 0)
        {
            sharedata.putString("mydata", String.valueOf(i));
            sharedata.commit();
        }
//        if(Integer.parseInt(share.getString("mydata", "0")) >= 1)
//            AppConnect.getInstance(this).showPopAd(this);
    }

    public void getUpdatePointsFailed(String s)
    {
    }

    private Context context;
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030001);
        context = this;
        sharedata = getSharedPreferences("girlzatoufa", 0).edit();
        share = getSharedPreferences("girlzatoufa", 0);
        Time time = new Time("GMT+8");
        time.setToNow();
        String s = String.valueOf(time.year);
        String s1 = String.valueOf(1 + time.month);
        if(s1.length() == 1)
            s1 = (new StringBuilder("0")).append(s1).toString();
        String s2 = String.valueOf(time.monthDay);
        if(s2.length() == 1)
            s2 = (new StringBuilder("0")).append(s2).toString();
        mytoday = new Date((new StringBuilder(String.valueOf(s))).append("/").append(s1).append("/").append(s2).toString());
        myBirthday = new Date("2013/07/13");
        Commontwo.idother = mytoday.getTime() - myBirthday.getTime();
        listview = (ListView)findViewById(0x7f060005);
        listview.setCacheColorHint(0);
        listview.setAdapter(getListTitleAdapter(Commontwo.title));
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
            	if(i > 10) {
            		if(!AD.haveOffers(context)) {
            			return;
            		}
            	}
//                if(i < 8)
//                {
                    Commontwo.icon = String.valueOf(i);
                    Intent intent1 = new Intent(OneActivity.this, FirstImageActivity.class);
                    startActivity(intent1);
//                }
//                else
//                if(Integer.parseInt(share.getString("mydata", "0")) >= 1 || Commontwo.isok.equals("true") || Commontwo.idother < 0L)
//                {
//                    Commontwo.icon = String.valueOf(i);
//                    Intent intent = new Intent(OneActivity.this, FirstImageActivity.class);
//                    startActivity(intent);
//                }
//                else
//                {
//                    showProgressDialog("\u624E\u5934\u53D1\u65B9\u6CD5\u4E5D\u5230\u624E\u5934\u53D1\u65B9\u6CD5\u56DB\u5341\u9700\u8981\u89E3\u9501\u3002\n\u53EA\u97001\u79EF\u5206\u5C31\u53EF\u4EE5\u5168\u90E8\u89E3\u9501\n\u4E0B\u8F7D\u91CC\u9762\u7684\u7CBE\u54C1\u8F6F\u4EF6\u53EF\u514D\u8D39\u83B7\u5F97\u79EF\u5206");
//                }
            }

//            final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
        }
);
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
//            final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
//        }
//).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialoginterface, int j)
//            {
//            }
//
//            final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
//        }
//).show();
//        if(true) goto _L1; else goto _L3
//_L3:
    	return null;
    }

    protected void onDestroy()
    {
//        AppConnect.getInstance(this).finalize();
        super.onDestroy();
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

    protected void onResume()
    {
//        AppConnect.getInstance(this).getPoints(this);
        super.onResume();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
//        Dialog dialog1 = AppConnect.getInstance(this).getPopAdDialog();
//        if(dialog1 != null)
//        {
//            dialog1.isShowing();
//            dialog1.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {
//
//                public void onCancel(DialogInterface dialoginterface)
//                {
//                }
//
//                final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
//            }
//);
//        }
    }

    public void showProgressDialog(String s)
    {
        (new android.app.AlertDialog.Builder(this)).setPositiveButton("\u514D\u8D39\u83B7\u53D6\u79EF\u5206", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                doshow();
            }

//            final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
        }
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

//            final OneActivity this$0;
//
//            
//            {
//                this$0 = OneActivity.this;
//                super();
//            }
        }
).setMessage(s).create().show();
    }

    private static final int DIALOG_EXIT = 1;
    private ProgressDialog dialog;
    private ListView listview;
    private Date myBirthday;
    private Date mytoday;
    private SharedPreferences share;
    private android.content.SharedPreferences.Editor sharedata;


}
