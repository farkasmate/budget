package y2k.budget;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class y2k.budget.DebugActivityTest \
 * y2k.budget.tests/android.test.InstrumentationTestRunner
 */
public class DebugActivityTest extends ActivityInstrumentationTestCase2<DebugActivity> {

    public DebugActivityTest() {
        super("y2k.budget", DebugActivity.class);
    }

}
