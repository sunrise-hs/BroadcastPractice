package com.example.hanshu.broadcastpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HanShu on 2016/7/18.
 */
public class AllActivity {
    public static List<Activity> list=new ArrayList<Activity>();
    public static void addActivity(Activity activity){
        list.add(activity);
    }
    public static void removeActivity(Activity activity){
        list.remove(activity);
    }
    public static  void finishAll(){
        for (Activity active:list){
            if(!active.isFinishing()){
                active.finish();
            }
        }
    }
}
