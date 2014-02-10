// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.*;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.*;
import android.widget.*;
//import com.jiqiren.jincaiwuxian.AppConnect;
//import com.jiqiren.jincaiwuxian.SDKUtils;

public class DaoTuiActivity
{

    public DaoTuiActivity()
    {
    }

    public static DaoTuiActivity getInstance()
    {
        if(quitPopAd == null)
            quitPopAd = new DaoTuiActivity();
        return quitPopAd;
    }

    private LinearLayout getQuitView_Landscape(final Context context, final Dialog dialog)
    {
        float af[] = new float[8];
        af[0] = 10F;
        af[1] = 10F;
        af[2] = 0.0F;
        af[3] = 0.0F;
        af[4] = 0.0F;
        af[5] = 0.0F;
        af[6] = 10F;
        af[7] = 10F;
        RoundRectShape roundrectshape = new RoundRectShape(af, null, null);
        ShapeDrawable shapedrawable = new ShapeDrawable(roundrectshape);
        shapedrawable.getPaint().setColor(Color.argb(200, 10, 10, 10));
        float af1[] = new float[8];
        af1[0] = 0.0F;
        af1[1] = 0.0F;
        af1[2] = 10F;
        af1[3] = 10F;
        af1[4] = 10F;
        af1[5] = 10F;
        af1[6] = 0.0F;
        af1[7] = 0.0F;
        RoundRectShape roundrectshape1 = new RoundRectShape(af1, null, null);
        ShapeDrawable shapedrawable1 = new ShapeDrawable(roundrectshape1);
        shapedrawable1.getPaint().setColor(Color.argb(200, 20, 20, 20));
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearlayout.setBackgroundColor(Color.argb(80, 0, 0, 0));
        linearlayout.setGravity(17);
        linearlayout.setOrientation(0);
        RelativeLayout relativelayout = new RelativeLayout(context);
        relativelayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        relativelayout.setGravity(17);
        LinearLayout linearlayout1 = new LinearLayout(context);
        TextView textview = new TextView(context);
        textview.setText("\u786E\u5B9A\u8981\u9000\u51FA\u5417\uFF1F");
        textview.setTextSize(18F);
        textview.setEms(1);
        textview.setTextColor(-1);
        linearlayout1.setId((int)System.currentTimeMillis());
        linearlayout1.setPadding(10, 10, 10, 0);
        linearlayout1.setBackgroundDrawable(shapedrawable);
        linearlayout1.addView(textview);
        int i = ((Activity)context).getWindowManager().getDefaultDisplay().getHeight();
        int j = -55 + (i - 75);
//        LinearLayout linearlayout2;
//        if(i <= 480)
//            linearlayout2 = AppConnect.getInstance(context).getPopAdView(context, j, j);
//        else
//            linearlayout2 = AppConnect.getInstance(context).getPopAdView(context);
//        if(linearlayout2 == null)
//        {
//            linearlayout = null;
//        } else
//        {
//            int k = Color.argb(200, 40, 40, 40);
//            linearlayout2.setBackgroundColor(k);
//            int l = (int)(1L + System.currentTimeMillis());
//            linearlayout2.setId(l);
//            linearlayout2.setPadding(2, 0, 2, 0);
//            LinearLayout linearlayout3 = new LinearLayout(context);
//            linearlayout3.setOrientation(1);
//            linearlayout3.setBackgroundDrawable(shapedrawable1);
//            linearlayout3.setPadding(3, 8, 3, 3);
//            LinearLayout linearlayout4 = new LinearLayout(context);
//            linearlayout4.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
//            linearlayout4.setOrientation(1);
//            linearlayout4.setGravity(48);
//            LinearLayout linearlayout5 = new LinearLayout(context);
//            linearlayout5.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
//            linearlayout5.setGravity(80);
//            Button button = new Button(context);
//            button.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
//            button.setText(" \u9000 \u51FA ");
//            android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    if(dialog != null)
//                        dialog.cancel();
//                    ((Activity)context).finish();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Context val$context;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                dialog = dialog1;
//                context = context1;
//                super();
//            }
//            }
//;
//            button.setOnClickListener(onclicklistener);
//            Button button1 = new Button(context);
//            button1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
//            button1.setText(" \u53D6 \u6D88 ");
//            android.view.View.OnClickListener onclicklistener1 = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    dialog.cancel();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                dialog = dialog1;
//                super();
//            }
//            }
//;
//            button1.setOnClickListener(onclicklistener1);
//            Button button2 = new Button(context);
//            button2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
//            button2.setText(" \u66F4 \u591A ");
//            android.view.View.OnClickListener onclicklistener2 = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    AppConnect.getInstance(context).showOffers(context);
//                    if(dialog != null)
//                        dialog.cancel();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Context val$context;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                context = context1;
//                dialog = dialog1;
//                super();
//            }
//            }
//;
//            button2.setOnClickListener(onclicklistener2);
//            linearlayout4.addView(button);
//            linearlayout4.addView(button1);
//            linearlayout5.addView(button2);
//            linearlayout3.addView(linearlayout4);
//            linearlayout3.addView(linearlayout5);
//            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams.addRule(6, linearlayout2.getId());
//            layoutparams.addRule(8, linearlayout2.getId());
//            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams1.addRule(1, linearlayout1.getId());
//            android.widget.RelativeLayout.LayoutParams layoutparams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams2.addRule(1, linearlayout2.getId());
//            layoutparams2.addRule(6, linearlayout2.getId());
//            layoutparams2.addRule(8, linearlayout2.getId());
//            relativelayout.addView(linearlayout1, layoutparams);
//            relativelayout.addView(linearlayout2, layoutparams1);
//            relativelayout.addView(linearlayout3, layoutparams2);
//            linearlayout.addView(relativelayout);
//        }
        return linearlayout;
    }

    private LinearLayout getQuitView_Portrait(final Context context, final Dialog dialog)
    {
//        int i = SDKUtils.getDisplaySize(context);
        float af[] = new float[8];
        af[0] = 10F;
        af[1] = 10F;
        af[2] = 10F;
        af[3] = 10F;
        af[4] = 0.0F;
        af[5] = 0.0F;
        af[6] = 0.0F;
        af[7] = 0.0F;
        RoundRectShape roundrectshape = new RoundRectShape(af, null, null);
        ShapeDrawable shapedrawable = new ShapeDrawable(roundrectshape);
        shapedrawable.getPaint().setColor(Color.argb(240, 10, 10, 10));
        float af1[] = new float[8];
        af1[0] = 0.0F;
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = 0.0F;
        af1[4] = 10F;
        af1[5] = 10F;
        af1[6] = 10F;
        af1[7] = 10F;
        RoundRectShape roundrectshape1 = new RoundRectShape(af1, null, null);
        ShapeDrawable shapedrawable1 = new ShapeDrawable(roundrectshape1);
        shapedrawable1.getPaint().setColor(Color.argb(240, 20, 20, 20));
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearlayout.setBackgroundColor(Color.argb(80, 0, 0, 0));
        linearlayout.setGravity(17);
        linearlayout.setOrientation(1);
        RelativeLayout relativelayout = new RelativeLayout(context);
        relativelayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        relativelayout.setGravity(17);
        LinearLayout linearlayout1 = new LinearLayout(context);
        TextView textview = new TextView(context);
        textview.setText("\u786E\u5B9A\u8981\u9000\u51FA\u5417\uFF1F");
        textview.setTextSize(18F);
        textview.setTextColor(-1);
        linearlayout1.setId((int)System.currentTimeMillis());
//        LinearLayout linearlayout2;
//        if(i == 320)
//            linearlayout1.setPadding(10, 10, 0, 10);
//        else
//        if(i == 240)
//            linearlayout1.setPadding(10, 5, 0, 5);
//        else
//            linearlayout1.setPadding(15, 15, 0, 15);
        linearlayout1.setBackgroundDrawable(shapedrawable);
        linearlayout1.addView(textview);
//        linearlayout2 = AppConnect.getInstance(context).getPopAdView(context);
//        if(linearlayout2 == null)
//        {
//            linearlayout = null;
//        } else
//        {
//            linearlayout2.setBackgroundColor(Color.argb(200, 40, 40, 40));
//            linearlayout2.setId((int)(1L + System.currentTimeMillis()));
//            linearlayout2.setPadding(5, 0, 5, 0);
//            LinearLayout linearlayout3 = new LinearLayout(context);
//            linearlayout3.setGravity(17);
//            linearlayout3.setOrientation(0);
//            linearlayout3.setPadding(3, 10, 3, 10);
//            linearlayout3.setBackgroundDrawable(shapedrawable1);
//            Button button = new Button(context);
//            button.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F));
//            button.setText(" \u9000 \u51FA ");
//            android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    if(dialog != null)
//                        dialog.cancel();
//                    ((Activity)context).finish();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Context val$context;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                dialog = dialog1;
//                context = context1;
//                super();
//            }
//            }
//;
//            button.setOnClickListener(onclicklistener);
//            Button button1 = new Button(context);
//            button1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F));
//            button1.setText(" \u53D6 \u6D88 ");
//            android.view.View.OnClickListener onclicklistener1 = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    dialog.cancel();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                dialog = dialog1;
//                super();
//            }
//            }
//;
//            button1.setOnClickListener(onclicklistener1);
//            Button button2 = new Button(context);
//            button2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F));
//            button2.setText(" \u66F4 \u591A ");
//            android.view.View.OnClickListener onclicklistener2 = new android.view.View.OnClickListener() {
//
//                public void onClick(View view)
//                {
//                    AppConnect.getInstance(context).showOffers(context);
//                    if(dialog != null)
//                        dialog.cancel();
//                }
//
//                final DaoTuiActivity this$0;
//                private final Context val$context;
//                private final Dialog val$dialog;
//
//            
//            {
//                this$0 = DaoTuiActivity.this;
//                context = context1;
//                dialog = dialog1;
//                super();
//            }
//            }
//;
//            button2.setOnClickListener(onclicklistener2);
//            linearlayout3.addView(button);
//            linearlayout3.addView(button1);
//            linearlayout3.addView(button2);
//            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams.addRule(5, linearlayout2.getId());
//            layoutparams.addRule(7, linearlayout2.getId());
//            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams1.addRule(3, linearlayout1.getId());
//            android.widget.RelativeLayout.LayoutParams layoutparams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
//            layoutparams2.addRule(3, linearlayout2.getId());
//            layoutparams2.addRule(5, linearlayout2.getId());
//            layoutparams2.addRule(7, linearlayout2.getId());
//            relativelayout.addView(linearlayout1, layoutparams);
//            relativelayout.addView(linearlayout2, layoutparams1);
//            relativelayout.addView(linearlayout3, layoutparams2);
//            linearlayout.addView(relativelayout);
//        }
        return linearlayout;
    }

    public void close()
    {
        if(dialog != null && dialog.isShowing())
            dialog.cancel();
    }

    public void show(final Context context)
    {
        dialog = new Dialog(context, 0x1030010);
        LinearLayout linearlayout;
        if(((Activity)context).getResources().getConfiguration().orientation == 1)
            linearlayout = getQuitView_Portrait(context, dialog);
        else
            linearlayout = getQuitView_Landscape(context, dialog);
        if(linearlayout != null)
        {
            dialog.setContentView(linearlayout);
            dialog.show();
        } else
        {
            (new android.app.AlertDialog.Builder(context)).setTitle("\u9000\u51FA\u63D0\u793A").setMessage("\u786E\u5B9A\u8981\u9000\u51FA\u5F53\u524D\u5E94\u7528\u5417\uFF1F").setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if(dialoginterface != null)
                        dialoginterface.cancel();
                    ((Activity)context).finish();
                }

//                final DaoTuiActivity this$0;
//                private final Context val$context;

            
//            {
//                this$0 = DaoTuiActivity.this;
//                context = context1;
//                super();
//            }
            }
).setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.cancel();
                }

//                final DaoTuiActivity this$0;

            
//            {
//                this$0 = DaoTuiActivity.this;
//                super();
//            }
            }
).create().show();
        }
    }

    private static Dialog dialog;
    private static DaoTuiActivity quitPopAd;
}
