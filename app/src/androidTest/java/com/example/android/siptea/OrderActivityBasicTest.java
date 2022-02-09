package com.example.android.siptea;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
public class OrderActivityBasicTest {
@Rule
    public ActivityTestRule<OrderActivity> mActivityTestRule=new ActivityTestRule<>(OrderActivity.class);
@Test
    public void clickIncrementButton_ChangesQuantityAndCost()
{
    //1.Find View
    //2.Perform Action on the view
    onView(withId(R.id.increment_button)).perform(click());
//3.Check whether the expected is what you want
    onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
    onView(withId(R.id.cost_text_view)).check(matches(withText("$5.00")));
}
@Test
    public void clickDecrementButton_ChangesQuantityAndCost()
{
    // Check the initial quantity variable is zero
onView((withId(R.id.quantity_text_view))).check(matches(withText("0")));
//1.Find the view
    //2.Perform the click
    onView((withId(R.id.decrement_button))).perform(click());
//3.Match the avlue
    onView((withId(R.id.quantity_text_view))).check(matches(withText("0")));
    onView((withText(R.id.cost_text_view))).check(matches(withText("$0.00")));

}


}

