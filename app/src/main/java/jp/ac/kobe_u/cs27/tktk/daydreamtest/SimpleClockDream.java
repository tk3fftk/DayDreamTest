package jp.ac.kobe_u.cs27.tktk.daydreamtest;

import android.service.dreams.DreamService;

/**
 * Created by tktk on 2015/02/05.
 */
public class SimpleClockDream extends DreamService{

	@Override
	public void onAttachedToWindow(){
		super.onAttachedToWindow();
		setInteractive(false); // DayDream起動後，画面をタッチするとアプリが終了する設定．操作させたいアプリ等ならtrueにする
		setFullscreen(true); // フルスクリーン表示を行う
		setContentView(R.layout.daydream); // 画面を定義したレイアウトXMLと本クラスの関連付けを行う
	}
}
