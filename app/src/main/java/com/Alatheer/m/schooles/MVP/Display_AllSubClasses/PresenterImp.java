package com.Alatheer.m.schooles.MVP.Display_AllSubClasses;

import android.content.Context;

import com.Alatheer.m.schooles.Models.School_Stages1;

/**
 * Created by elashry on 3/3/2018.
 */

public class PresenterImp implements Presenter ,InterActor.onCompleteListener{

    private ViewData viewData;
    private InterActor interActor;
    private Context context;

    public PresenterImp(ViewData viewData, Context context) {
        this.viewData = viewData;
        this.context = context;
        interActor = new InterActorImp();
    }

    @Override
    public void DisplayAllSubClasses(String id_school) {
        interActor.DisplayAllSubClasses(id_school,this,context);
    }

    @Override
    public void OnDisplayDataSuccess(School_Stages1 schools_stages1) {
        if (viewData!=null)
        {
            viewData.OnDisplayDataSuccess(schools_stages1);
        }
    }

    @Override
    public void OnFailed(String error) {
        if (viewData!=null)
        {
            viewData.OnFailed(error);
        }
    }
}
