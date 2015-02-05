package jp.ac.kobe_u.cs27.tktk.daydreamtest;

import android.service.dreams.DreamService;

import wada811.utils.PreferenceUtils;

/**
 * Created by tktk on 2015/02/05.
 */
public class DayDreamDemo extends DreamService {

	@Override
	public void onAttachedToWindow(){
		super.onAttachedToWindow();
		setInteractive(PreferenceUtils.getBoolean(getApplicationContext(), getString(R.string.setInteractive), true));
		setFullscreen(PreferenceUtils.getBoolean(getApplicationContext(), getString(R.string.setFullscreen), true));
		setScreenBright(PreferenceUtils.getBoolean(getApplicationContext(), getString(R.string.setScreenBright), true));
		setContentView(R.layout.daydream);
	}

	@Override
	public void onDreamingStarted(){
		super.onDreamingStarted();
	}

	@Override
	public void onDreamingStopped(){
		super.onDreamingStopped();
	}

	@Override
	public void onDetachedFromWindow(){
		super.onDetachedFromWindow();
	}
}