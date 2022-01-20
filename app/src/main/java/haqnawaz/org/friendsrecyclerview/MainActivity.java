package haqnawaz.org.friendsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Friends> friendsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Friends f0 = new Friends(1,"Home", 0000, "Lahore",R.drawable.d);
        Friends f1 = new Friends(2,"Cart", 0000, "Lahore",R.drawable.c);
        Friends f2 = new Friends(3,"Clock", 0000, "Quetta",R.drawable.b);
        Friends f3 = new Friends(4,"Contacts",0000,"Peshawar",R.drawable.a);
        Friends f4 = new Friends(5,"Cart", 0000, "Karachi",R.drawable.c);
        Friends f5 = new Friends(6,"Contact",0000,"Faisalabad ",R.drawable.a);
        Friends f6 = new Friends(7,"Home", 0000, "Rawalpindi",R.drawable.d);
        Friends f7 = new Friends(8,"Clock",0000,"Karachi",R.drawable.b);
        Friends f8 = new Friends(8,"Cary",0000,"Quetta",R.drawable.c);
        Friends f9 = new Friends(8,"Home",0000,"Kasur",R.drawable.d);
        Friends f10 = new Friends(8,"Contact",0000,"Islamabad",R.drawable.a);
        Friends f11 = new Friends(8,"Clock",0000,"Rawalpindi",R.drawable.b);

        friendsList.addAll(Arrays.asList(new Friends[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.myRecyclerView);

        recyclerView.setHasFixedSize(true);

        //LinearLayoutManager GridLayoutManager
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewAdapter(friendsList) ;
        recyclerView.setAdapter(adapter);
        //adapter.notifyDataSetChanged();
    }
}
