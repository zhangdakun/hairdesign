// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.os.Process;
import android.text.format.Time;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import java.io.*;
import java.util.Date;
import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.android.adlib.AD;
import com.android.adlib.ADbaseActivity;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            Commontwo, DaoTuiActivity

public class FourActivity extends ADbaseActivity
    implements Runnable
{

    public FourActivity()
    {
        bu = null;
        butwo = null;
        buthree = null;
        thread = null;
        url = "http://a.apk.anzhi.com/apk/201212/26/com.liuweiwen.android.excelshiyong_47293100_0.apk";
        type = 0;
        idother = 0L;
        dialog = null;
    }

    private void installApk(String s)
    {
        File file = new File(s);
        Intent intent = new Intent();
        intent.addFlags(0x10000000);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        startActivity(intent);
    }

    public void cancelProgressDialog()
    {
        removeDialog(2);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030009);
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
        myBirthday = new Date("2013/04/24");
        idother = (mytoday.getTime() - myBirthday.getTime()) / 0x5265c00L;
        textview = (TextView)findViewById(0x7f06000b);
        textview.setText(Commontwo.four);
        textviewone = (TextView)findViewById(0x7f060010);
        textviewone.setText("\u4F8B\u5916\u4E00\u4E9B\u4F18\u79C0\u5B9E\u7528\u8F6F\u4EF6\uFF1A");
        
        AD.showRecommandWall(this);
//        finish();
    }

    protected Dialog onCreateDialog(int i)
    {
//        i;
//        JVM INSTR tableswitch 1 2: default 24
//    //                   1 28
//    //                   2 74;
//           goto _L1 _L2 _L3
//_L3:
//        break MISSING_BLOCK_LABEL_74;
//_L1:
//        Object obj = null;
//_L4:
//        return ((Dialog) (obj));
//_L2:
//        (new android.app.AlertDialog.Builder(this)).setTitle("\u9000\u51FA\u8F6F\u4EF6\uFF1F").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialoginterface, int j)
//            {
//                finish();
//            }
//
//            final FourActivity this$0;
//
//            
//            {
//                this$0 = FourActivity.this;
//                super();
//            }
//        }
//).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialoginterface, int j)
//            {
//            }
//
//            final FourActivity this$0;
//
//            
//            {
//                this$0 = FourActivity.this;
//                super();
//            }
//        }
//).show();
//          goto _L1
//        _waitingDialog = new ProgressDialog(this);
//        _waitingDialog.setMessage("\u6B63\u5728\u4E0B\u8F7D\uFF0C\u8BF7\u7A0D\u5019\u3002\u3002");
//        _waitingDialog.setIndeterminate(true);
//        _waitingDialog.setCancelable(true);
//        obj = _waitingDialog;
//          goto _L4
    	
    	
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

    public void run()
    {
//        String s;
//        s = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/download_zatoufa").toString();
//        File file = new File(s);
//        if(!file.exists())
//            file.mkdir();
//        HttpGet httpget = new HttpGet(url);
//        try
//        {
//            HttpResponse httpresponse = (new DefaultHttpClient()).execute(httpget);
//            if(httpresponse.getStatusLine().getStatusCode() != 200)
//                break MISSING_BLOCK_LABEL_364;
//            InputStream inputstream = httpresponse.getEntity().getContent();
//            FileOutputStream fileoutputstream;
//            byte abyte0[];
//            if(type == 0)
//                fileoutputstream = new FileOutputStream((new StringBuilder(String.valueOf(s))).append("/excel.apk").toString());
//            else
//            if(type == 1)
//                fileoutputstream = new FileOutputStream((new StringBuilder(String.valueOf(s))).append("/word.apk").toString());
//            else
//                fileoutputstream = new FileOutputStream((new StringBuilder(String.valueOf(s))).append("/cad.apk").toString());
//            abyte0 = new byte[8192];
//            do
//            {
//                int i = inputstream.read(abyte0);
//                if(i == -1)
//                {
//                    fileoutputstream.close();
//                    inputstream.close();
//                    cancelProgressDialog();
//                    if(type != 0)
//                        break;
//                    installApk((new StringBuilder(String.valueOf(s))).append("/excel.apk").toString());
//                    break MISSING_BLOCK_LABEL_364;
//                }
//                fileoutputstream.write(abyte0, 0, i);
//            } while(true);
//        }
//        catch(Exception exception)
//        {
//            cancelProgressDialog();
//            break MISSING_BLOCK_LABEL_364;
//        }
//        if(type == 1)
//            installApk((new StringBuilder(String.valueOf(s))).append("/word.apk").toString());
//        else
//            installApk((new StringBuilder(String.valueOf(s))).append("/cad.apk").toString());
    }

    public void showProgressDialog()
    {
        removeDialog(2);
        showDialog(2);
    }

    private static final int DIALOG_EXIT = 1;
    private final int DIALOG_WAITING = 2;
    private ProgressDialog _waitingDialog;
    private Button bu;
    private Button buthree;
    private Button butwo;
    private ProgressDialog dialog;
    private long idother;
    private Date myBirthday;
    private Date mytoday;
    private TextView textview;
    private TextView textviewfour;
    private TextView textviewone;
    private TextView textviewthree;
    private TextView textviewtwo;
    private Thread thread;
    private int type;
    String url;
}
