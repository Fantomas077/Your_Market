package crc641f6da6f34cf000f5;


public class MainActivity_SplashActivity
	extends crc643f46942d9dd1fff9.FormsAppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("Your_Market.Droid.MainActivity+SplashActivity, Your_Market.Android", MainActivity_SplashActivity.class, __md_methods);
	}


	public MainActivity_SplashActivity ()
	{
		super ();
		if (getClass () == MainActivity_SplashActivity.class) {
			mono.android.TypeManager.Activate ("Your_Market.Droid.MainActivity+SplashActivity, Your_Market.Android", "", this, new java.lang.Object[] {  });
		}
	}


	public MainActivity_SplashActivity (int p0)
	{
		super (p0);
		if (getClass () == MainActivity_SplashActivity.class) {
			mono.android.TypeManager.Activate ("Your_Market.Droid.MainActivity+SplashActivity, Your_Market.Android", "System.Int32, mscorlib", this, new java.lang.Object[] { p0 });
		}
	}


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
