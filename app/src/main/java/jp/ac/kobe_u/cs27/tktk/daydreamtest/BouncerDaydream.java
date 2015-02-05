package jp.ac.kobe_u.cs27.tktk.daydreamtest;

import android.service.dreams.DreamService;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import static android.view.ViewGroup.LayoutParams.*;

/**
 * Created by tktk on 2015/02/05.
 */
public class BouncerDaydream extends DreamService{
	@Override
	public void onAttachedToWindow() {
		super.onAttachedToWindow();

		// Exit dream upon user touch
		setInteractive(false);
		// Hide system UI
		setFullscreen(true);
		// Set the dream layout
		setContentView(R.layout.daydream);
	}

	@Override
	public void onDreamingStarted() {
		super.onDreamingStarted();

		// Our content view will take care of animating its children.
		final Bouncer bouncer = new Bouncer(this);
		bouncer.setLayoutParams(new
				ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT));
		bouncer.setSpeed(200); // pixels/sec

		// Add some views that will be bounced around.
		// Here I'm using ImageViews but they could be any kind of
		// View or ViewGroup, constructed in Java or inflated from
		// resources.
		for (int i=0; i<5; i++) {
			final FrameLayout.LayoutParams lp
					= new FrameLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
			final ImageView image = new ImageView(this);
			image.setImageResource(R.drawable.father);
			image.setBackgroundColor(0xFF004000);
			bouncer.addView(image, lp);
		}

		setContentView(bouncer);
	}
}
