package y2k.budget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import y2k.budget.data.Account;

public class DebugActivity extends Activity
{
    private static final String ACCOUNT_NAME = "main";
    private Account account;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        account = new Account(ACCOUNT_NAME);
    }

    public void onGetBalance(View view) {
        Toast toast = Toast.makeText(BudgetApplication.getContext(),
                "Balance is: "+ Double.toString(account.getBalance()), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onShowCategoryView(View view) {
        setContentView(R.layout.category);
    }
}
