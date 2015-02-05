package jp.ac.kobe_u.cs27.tktk.daydreamtest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.CompoundButton;
import android.widget.Switch;

import wada811.utils.PreferenceUtils;


public class DayDreamSettingsActivity extends FragmentActivity {

	final DayDreamSettingsActivity self = this;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day_dream);

		Switch switchInteractive = (Switch)findViewById(R.id.setInteractive);
		switchInteractive.setChecked(PreferenceUtils.getBoolean(self, getString(R.string.setInteractive), true));
		switchInteractive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
				PreferenceUtils.putBoolean(self, getString(R.string.setInteractive), isChecked);
			}
		});
		Switch switchFullscreen = (Switch)findViewById(R.id.setFullscreen);
		switchFullscreen.setChecked(PreferenceUtils.getBoolean(self, getString(R.string.setFullscreen), true));
		switchFullscreen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
				PreferenceUtils.putBoolean(self, getString(R.string.setFullscreen), isChecked);
			}
		});
		Switch switchScreenBright = (Switch)findViewById(R.id.setScreenBright);
		switchScreenBright.setChecked(PreferenceUtils.getBoolean(self, getString(R.string.setScreenBright), true));
		switchScreenBright.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
				PreferenceUtils.putBoolean(self, getString(R.string.setScreenBright), isChecked);
			}
		});
	}
}
