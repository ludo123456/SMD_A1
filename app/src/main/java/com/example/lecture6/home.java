package com.example.lecture6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    List<itemModel> ls;
    myAdapter adapter;
    RecyclerView rv;
    RecyclerView rv2;
    public home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home.
     */
    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home, container, false);
        ls = new ArrayList<>();
        ls.add(new itemModel("item name 1" , "price 1", "loc 1", "date 1"));
        ls.add(new itemModel("item name 2" , "price 2", "loc 2", "date 2"));
        ls.add(new itemModel("item name 3" , "price 3", "loc 3", "date 3"));
        ls.add(new itemModel("item name 4" , "price 4", "loc 4", "date 4"));
        ls.add(new itemModel("item name 5" , "price 5", "loc 5", "date 5"));
        ls.add(new itemModel("item name 6" , "price 6", "loc 6", "date 6"));
        adapter  = new myAdapter(getActivity(),ls);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        rv = root.findViewById(R.id.rv);
        rv2 = root.findViewById(R.id.rv2);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adapter);
        return root;
    }
}