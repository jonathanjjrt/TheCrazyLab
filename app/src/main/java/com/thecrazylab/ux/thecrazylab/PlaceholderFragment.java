package com.thecrazylab.ux.thecrazylab;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PlaceholderFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PlaceholderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * This argument represents the title for each section
     */
    public static final String ARG_SECTION_TITLE = "section_number";


    /**
     * Crea una instancia prefabricada de {@link PlaceholderFragment}
     *
     * @param sectionTitle Título usado en el contenido
     * @return Instancia dle fragmento
     */
    public static PlaceholderFragment newInstance(String sectionTitle) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.section_fragment, container, false);

        // Ubicar argumento en el text view de section_fragment.xml
        String title = getArguments().getString(ARG_SECTION_TITLE);
        TextView titulo = (TextView) view.findViewById(R.id.title);
        titulo.setText(title);
        return view;
    }
}
