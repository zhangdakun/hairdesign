// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
//import com.jiqiren.jincaiwuxian.AppConnect;
import java.util.ArrayList;
import java.util.List;

import net.youmi.android.AdManager;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            OneActivity, TwoActivity, ThreeActivity, FourActivity, 
//            Commontwo

public class FirstActivity extends ActivityGroup
{

    public FirstActivity()
    {
        _selectedButton = 0;
    }

    private void initTabhost()
    {
        tabHost.addTab(tabHost.newTabSpec("first").setIndicator("first").setContent(new Intent(this, OneActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("second").setIndicator("second").setContent(new Intent(this, TwoActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("third").setIndicator("third").setContent(new Intent(this, ThreeActivity.class)));
//        tabHost.addTab(tabHost.newTabSpec("four").setIndicator("four").setContent(new Intent(this, FourActivity.class)));
    }

    private void selectTab(int i)
    {
        if(tabHost != null)
            tabHost.setCurrentTab(i);
    }

    private void setBottomBarButtons()
    {
        if(_bottomButtons == null)
        {
            _bottomButtons = new ArrayList(3);//relaced 4
            _bottomButtons.add((Button)findViewById(0x7f060001));
            _bottomButtons.add((Button)findViewById(0x7f060002));
            _bottomButtons.add((Button)findViewById(0x7f060003));
//            _bottomButtons.add((Button)findViewById(0x7f060004));
        }
        _loop = 0;
        do
        {
            if(_loop >= 3)// 
                return;
            ((Button)_bottomButtons.get(_loop)).setOnClickListener(new android.view.View.OnClickListener() {

                public void onClick(View view)
                {
                    _selectedButton = _idx;
                    updateBottomButtons();
                    selectTab(_selectedButton);
                }

                private int _idx;
//                final FirstActivity this$0;
//
//            
            {
//                this$0 = FirstActivity.this;
//                super();
                _idx = _loop;
            }
            }
);
            _loop = 1 + _loop;
        } while(true);
    }

    private void updateBottomButtons()
    {
        int i = 0;
        do
        {
            if(i >= 3)// relpace 4
                return;
            if(_selectedButton == i)
                ((Button)_bottomButtons.get(i)).setSelected(true);
            else
                ((Button)_bottomButtons.get(i)).setSelected(false);
            i++;
        } while(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
//        AppConnect.getInstance("d710af52ebdbc2c41b1cc8c5758ac15c", "google", this);
//        AppConnect.getInstance(this).setAdViewClassName("com.jiqiren.girlzatoufatwo.MyActivity");
//        Commontwo.isok = AppConnect.getInstance(this).getConfig("IS_WHITE_USER");
//        AppConnect.getInstance(this).initPopAd(this);
        requestWindowFeature(1);
        setContentView(0x7f030008);
        
        AdManager.getInstance(this).init("9b1a5795f15559f8",
        	    "f4e4d43765b306ce", false);
        
        tabHost = (TabHost)findViewById(0x7f06000d);
        tabHost.setup(getLocalActivityManager());
        setBottomBarButtons();
        initTabhost();
        updateBottomButtons();
        tabHost.setCurrentTab(0);
    }

    protected void onDestroy()
    {
//        AppConnect.getInstance(this).finalize();
        super.onDestroy();
    }

    private List _bottomButtons;
    private int _loop;
    private int _selectedButton;
    private TabHost tabHost;





}
