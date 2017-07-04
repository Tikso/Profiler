package traco.profiler.profilepage;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import traco.profiler.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link ProfilPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfilPageFragment extends Fragment implements ProfilepagContractor.View {

    private TextView mTxtName, mTxtEmail, mTxtIntersts, mTxtAbout;
    private FloatingActionButton editButton;
    private ImageButton imgLogout, imgSettings;
    private ImageView imgProfile;

    public ProfilPageFragment() {
        // Required empty public constructor
    }


    public static ProfilPageFragment newInstance(String param1, String param2) {
        ProfilPageFragment fragment = new ProfilPageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRetainInstance(true);
        if (getArguments() != null) {
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_profil_page, container, false);
        mTxtAbout = (TextView) mView.findViewById(R.id.txtAboutIntersts);
        mTxtEmail = (TextView) mView.findViewById(R.id.txtEmail);
        mTxtName = (TextView) mView.findViewById(R.id.txtName);
        mTxtIntersts = (TextView) mView.findViewById(R.id.txtInterstsDetail);
        imgProfile = (ImageView) mView.findViewById(R.id.imgProfile);
        imgSettings = (ImageButton) mView.findViewById(R.id.imgSettings);
        imgLogout = (ImageButton) mView.findViewById(R.id.imgLogout);
        editButton= (FloatingActionButton) mView.findViewById(R.id.floatingEditButton);
        return mView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void makeToast(@StringRes int stringId) {

    }

    @Override
    public void makeToast(String message) {

    }

    @Override
    public void setPresenter(ProfilepagContractor.Presenter presenter) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public void setInterests(String interests) {

    }

    @Override
    public void setBio(String bio) {

    }

    @Override
    public void setPhotoUrl(String url) {

    }

    @Override
    public void setDefaultPhoto() {

    }

    @Override
    public void startPhotoActivity() {

    }

    @Override
    public void startDetailActivity() {

    }

    @Override
    public void startSettingsActivity() {

    }

    @Override
    public void showLogoutSnackBar(boolean show) {

    }

    @Override
    public void startLoginActivity() {

    }

    @Override
    public void setThumbnailLoadingIndicator(boolean show) {

    }

    @Override
    public void setDetailLoadingIndicator(boolean show) {

    }
}
