// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.jiqiren.girlzatoufatwo;

import android.app.Activity;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.android.adlib.ADbaseActivity;

// Referenced classes of package com.jiqiren.girlzatoufatwo:
//            Common, Commontwo

public class FatherActivity extends ADbaseActivity
{

    public FatherActivity()
    {
    }

    private void checkValue(String s)
    {
        int i = s.indexOf("\n");
        Log.d("father", "checkValue, s, "+s+", i, "+i);
        try {
			

        Common.friendlist.add(s.substring(0, i).trim());
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
		}
    }

    private byte[] getSecondBytes(String s)
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            InputStream inputstream = getClassLoader().getResourceAsStream(s);
            if(null == inputstream)
            inputstream = this.getAssets().open(s);
            byte abyte1[] = new byte[1024];
            do
            {
                int i = inputstream.read(abyte1);
                if(i == -1)
                {
                    inputstream.close();
                    abyte0 = bytearrayoutputstream.toByteArray();
                    break;
                }
                bytearrayoutputstream.write(abyte1, 0, i);
            } while(true);
        }
        catch(Exception exception)
        {
            abyte0 = null;
        }
        return abyte0;
    }

    protected void Init(String s)
    {
        ((TextView)findViewById(0x7f06000a)).setText(s);
    }

    public SimpleAdapter getListMainAdapter(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        do
        {
            if(i >= arraylist.size())
            {
                String as[] = new String[1];
                as[0] = "itemText";
                int ai[] = new int[1];
                ai[0] = 0x7f06000b;
                return new SimpleAdapter(this, arraylist1, 0x7f030007, as, ai);
            }
            HashMap hashmap = new HashMap();
            hashmap.put("itemText", arraylist.get(i));
            arraylist1.add(hashmap);
            i++;
        } while(true);
    }

    public SimpleAdapter getListMainAdapterjpdx(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        do
        {
            if(i >= arraylist.size())
            {
                String as[] = new String[1];
                as[0] = "itemText";
                int ai[] = new int[1];
                ai[0] = 0x7f06000b;
                return new SimpleAdapter(this, arraylist1, 0x7f030005, as, ai);
            }
            HashMap hashmap = new HashMap();
            hashmap.put("itemText", arraylist.get(i));
            arraylist1.add(hashmap);
            i++;
        } while(true);
    }

    public SimpleAdapter getListTitleAdapter(String as[])
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if(i >= as.length)
            {
                String as1[] = new String[1];
                as1[0] = "itemText";
                int ai[] = new int[1];
                ai[0] = 0x7f06000b;
                return new SimpleAdapter(this, arraylist, 0x7f030007, as1, ai);
            }
            HashMap hashmap = new HashMap();
            hashmap.put("itemText", as[i]);
            arraylist.add(hashmap);
            i++;
        } while(true);
    }

    public SimpleAdapter getListfirstimage(ArrayList arraylist, int ai[])
    {
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        do
        {
            if(i >= arraylist.size())
            {
                String as[] = new String[2];
                as[0] = "itemText";
                as[1] = "itemImage";
                int ai1[] = new int[2];
                ai1[0] = 0x7f060008;
                ai1[1] = 0x7f060007;
                return new SimpleAdapter(this, arraylist1, 0x7f030003, as, ai1);
            }
            HashMap hashmap = new HashMap();
            hashmap.put("itemImage", Integer.valueOf(ai[i]));
            hashmap.put("itemText", arraylist.get(i));
            arraylist1.add(hashmap);
            i++;
        } while(true);
    }

    public void readsdate(String s)
    {
        String s1;
        int i;
        s1 = new String(getSecondBytes(s));
        
        Log.d("father", "readsdate, s, "+s+", s1, "+s1);
        i = 0;
//_L1:
//        int j;
//        j = s1.indexOf("\n", i);
//        if(j == -1)
//        {
//            checkValue(s1.substring(i, s1.length()));
//            break MISSING_BLOCK_LABEL_74;
//        }
//        Commontwo.listtwo.add(s1.substrin`g(i, j).trim());
//        i = j + 1;
//          goto _L1
//        Throwable throwable;
//        throwable;
        
        i = 0;
        int j = -1;
        while(( j = s1.indexOf("\n", i)) != -1){
        	Commontwo.listtwo.add(s1.substring(i, j).trim());
        	i = j + 1;
        }
        
        
        checkValue(s1.substring(i, s1.length()));
        
    }

    public void readseconddate(String s)
    {
        String s1;
        int i;
        s1 = new String(getSecondBytes(s));
        
        Log.d("father", "readseconddate, s, "+s+", s1, "+s1);
        
        i = 0;
//_L1:
//        int j;
//        j = s1.indexOf("\n", i);
//        if(j == -1)
//        {
//            checkValue(s1.substring(i, s1.length()));
//            break MISSING_BLOCK_LABEL_74;
//        }
//        Common.friendlist.add(s1.substring(i, j).trim());
//        i = j + 1;
//          goto _L1
//        Throwable throwable;
//        throwable;
        
        int j = -1;
        while((j = s1.indexOf("\n", i)) != -1) {
          Common.friendlist.add(s1.substring(i, j).trim());
          i = j + 1;	
        }
        
        checkValue(s1.substring(i, s1.length()));
        
        
    }

    public void readseconddatethree(String s)
    {
        String s1;
        int i;
        s1 = new String(getSecondBytes(s));
        Log.d("father", "readseconddatethree, s, "+s+", s1, "+s1);
        
        i = 0;
//_L1:
//        int j;
//        j = s1.indexOf("\n", i);
//        if(j == -1)
//        {
//            checkValue(s1.substring(i, s1.length()));
//            break MISSING_BLOCK_LABEL_74;
//        }
//        Common.friendlistthree.add(s1.substring(i, j).trim());
//        i = j + 1;
//          goto _L1
//        Throwable throwable;
//        throwable;
        
        int j = -1;
        
        while((j = s1.indexOf("\n", i)) != -1) {
          Common.friendlistthree.add(s1.substring(i, j).trim());
          i = j + 1;        	
        }
        checkValue(s1.substring(i, s1.length()));
    }

    void readseconddatetwo(String s)
    {
        Common.friendlisttwo = new String(getSecondBytes(s));
    }
    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag;
        if(i == 4)
        {
                Process.killProcess(Process.myPid());
                finish();

            flag = true;
        } else
        {
            flag = super.onKeyDown(i, keyevent);
        }
        return flag;
    }
    public TextView Title;
}
