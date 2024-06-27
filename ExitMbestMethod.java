
public void exitStudyMode(View v) {
        Context context = getApplicationContext();
        try {
            EnterpriseDeviceManager.getInstance(context).getApplicationPolicy().startApp("kr.co.mbest.smartlearningtab", "kr.co.mbest.smartlearningtab.base.ui.ExitActivity");
        } catch (Exception e) {
            Toast.makeText(context, "Error: " + e.getMessage(), 0).show();
        }
    }