package DashBoard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionPageDepterforSH extends FragmentPagerAdapter {
    public SectionPageDepterforSH(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Orders orders = new Orders();
                return orders;

            case 1:
                Shipped shipped = new Shipped();
                return shipped;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "ORDERS";
            case 1:
                return "SHIPPED";
            default:
                return null;
        }


    }
}
